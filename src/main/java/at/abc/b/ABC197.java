package at.abc.b;
// パッケージ名は含めない

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// クラス名はMain
public class ABC197 {
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int h = Integer.parseInt(scanner.next());
    int w = Integer.parseInt(scanner.next());
    int x = Integer.parseInt(scanner.next());
    int y = Integer.parseInt(scanner.next());

    List<String[]> list = new ArrayList();

    for (int i = 1; i <= h; i++) {
      String s = scanner.next();
      String[] strings = s.split("");
      list.add(strings);
    }
    int count = 0;

    // 対象地点が.かどうか
    if (list.get(x - 1)[y - 1].equals(".")) {
      count++;
    }
    System.out.println(count);

    String[] 横一列 = list.get(x - 1);
    // 対象地点より左を調べる（#が出るまでいくつの.があるか
    for (int i = y - 2; i >= 0; i--) {
      if (横一列[i].equals(".")) {
        count++;
      } else {
        break;
      }
    }
    System.out.println(count);
    // 対象地点より右を調べる（#が出るまでいくつの.があるか
    for (int i = y; i <= y; i++) {
      if (横一列[i].equals(".")) {
        count++;
      } else {
        break;
      }
    }
    System.out.println(count);
    // 対象地点より上を調べる（#が出るまでいくつの.があるか
    // 対象地点より下を調べる（#が出るまでいくつの.があるか

    //    for (String[] 配列 : list) {
    //      if (配列[y - 1].equals(".")) {
    //        count++;
    //      }
    //    }

  }
  // ##########################################

  // テスト用
  public static String answer(String x) {
    if (x.contains("\\.")) {
      return (x);
    } else {
      return (x.split("\\.")[0]);
    }
  }
}
