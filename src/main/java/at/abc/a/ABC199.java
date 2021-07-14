package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC199 {
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int a = Integer.parseInt(scanner.next());
    int b = Integer.parseInt(scanner.next());
    int c = Integer.parseInt(scanner.next());

    if (Math.pow(a, 2) + Math.pow(b, 2) < Math.pow(c, 2)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
  // ##########################################

  // テスト用
  public static String answer(int a, int b, int c) {

    if (Math.pow(a, 2) + Math.pow(b, 2) < Math.pow(c, 2)) {
      return "Yes";
    } else {
      return "No";
    }
  }
}
