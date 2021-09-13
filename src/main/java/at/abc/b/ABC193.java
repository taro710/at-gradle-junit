package at.abc.b;
// パッケージ名は含めない

import java.util.*;

// クラス名はMain
public class ABC193 {
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());

    Set<Integer> set = new HashSet<>();
    for (int i = 1; i <= n; i++) {
      int a = Integer.parseInt(scanner.next());
      int p = Integer.parseInt(scanner.next());
      int x = Integer.parseInt(scanner.next());
      int zaiko = x - a;

      if (zaiko <= 0) {
        set.add(-1);
      } else {
        set.add(p);
      }
    }

    if (set.size() == 1 && set.contains(-1)) {
      System.out.println(-1);
    } else {
      set.remove(-1);
      int ans = Collections.min(set);
      System.out.println(ans);
    }
  }
  // ##########################################

  // テスト用
  public static String answer(String s) {
    if (isOk(s)) {
      return "Yes";
    } else {
      return "No";
    }
  }

  public static boolean isOk(String string) {
    long count = 1;
    List<String> big = List.of("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
    List<String> small = List.of("abcdefghijklmnopqrstuvwxyz".split(""));
    for (String str : string.split("")) {
      if (count % 2 == 0 && small.contains(str)) {
        return false;
      } else if (count % 2 != 0 && big.contains(str)) {
        return false;
      }
      count++;
    }
    return true;
  }
}
