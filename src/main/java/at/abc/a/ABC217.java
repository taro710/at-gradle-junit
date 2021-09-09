package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC217 {

  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    String t = scanner.next();
    if (s.compareTo(t) < 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  // テスト用
  public static String answer(String s, String t) {
    if (s.compareTo(t) < 0) {
      return ("Yes");
    } else {
      return ("No");
    }
  }
}
