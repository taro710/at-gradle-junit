package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC215 {

  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();

    if (s.equals("Hello,World!")) {
      System.out.println("AC");
    } else {
      System.out.println("WA");
    }
  }

  // テスト用
  public static String answer(String s) {
    if (s.equals("Hello,World!")) {
      return ("AC");
    } else {
      return ("WA");
    }
  }
}
