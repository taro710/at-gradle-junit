package at.abc.b;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC195Check {
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int min = Integer.parseInt(scanner.next());
    int max = Integer.parseInt(scanner.next());
    int w = Integer.parseInt(scanner.next()) * 1000;

    int minAns = 1000000000;
    int maxAns = 0;

    // リストで解く場合
    //    List<Integer> list = new ArrayList<>();

    for (int i = 1; i <= 1000000; i++) {
      if (i * min <= w && w <= i * max) {
        minAns = Math.min(minAns, i);
        maxAns = Math.max(maxAns, i);
        // リストで解く場合
        //        list.add(i);
      }
    }
    // リストで解く場合
    //    if (list.size() != 0) {
    //      int minAns2 = (Collections.min(list));
    //      int maxAns2 = (Collections.max(list));
    //      System.out.print(minAns2 + " " + maxAns2);
    //    } else {
    //      System.out.println("UNSATISFIABLE");
    //    }

    if (maxAns == 0) {
      System.out.println("UNSATISFIABLE");
    } else {
      System.out.print(minAns + " " + maxAns);
    }
  }
  // ##########################################

  // テスト用
  public static String answer(String s) {
    if (true) {
      return "Yes";
    } else {
      return "No";
    }
  }
}
