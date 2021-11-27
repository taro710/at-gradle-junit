package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC218 {

  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());
    String s = scanner.next();

    String string = String.valueOf(s.charAt(n - 1));

    if (string.equals("o")) {
      System.out.println("Yes");
    } else if (string.equals("x")) {
      System.out.println("No");
    }
  }

  // テスト用
  public static String answer(int n, String s) {
    String string = String.valueOf(s.charAt(n - 1));

    if (string.equals("o")) {
      return "Yes";
    } else {
      return "No";
    }
  }
}
