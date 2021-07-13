package at.abc.a;
// パッケージ名は含めない

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// クラス名はMain
public class ABC203 {
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int a = Integer.parseInt(scanner.next());
    int b = Integer.parseInt(scanner.next());
    int c = Integer.parseInt(scanner.next());
    List<Integer> list = List.of(a, b, c);
    Map<Integer, Integer> map = new HashMap<>();

    // マップのに格納（サイコロの出目：重複数）
    list.forEach(
        num -> {
          if (map.containsKey(num)) {
            map.put(num, map.get(num) + 1);
          } else {
            map.put(num, 1);
          }
        });
    // 重複がなかった場合
    if (map.size() == 3) {
      System.out.println(0);
      return;
    }

    int answer = 0;
    for (Integer key : map.keySet()) {
      // 全て同じだった場合
      if (map.get(key) == 3) {
        System.out.println(key);
        return;
      }
      // その時点において重複していないものをanswerに
      if (map.get(key) == 1) {
        answer = key;
      }
    }
    System.out.println(answer);
  }
  // ##########################################

  // テスト用
  public static int answer(int a, int b, int c) {
    List<Integer> list = List.of(a, b, c);
    Map<Integer, Integer> map = new HashMap<>();

    list.forEach(
        num -> {
          if (map.containsKey(num)) {
            map.put(num, map.get(num) + 1);
          } else {
            map.put(num, 1);
          }
        });
    if (map.size() == 3) {
      return 0;
    }
    int answer = 0;
    for (Integer key : map.keySet()) {
      if (map.get(key) == 3) {
        return key;
      }
      if (map.get(key) == 1) {
        answer = key;
      }
    }
    return answer;
  }
}
