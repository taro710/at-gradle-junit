package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC212 {

  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    double a = Double.parseDouble(scanner.next());
    double b = Double.parseDouble(scanner.next());

    if (0 < a && b == 0) {
      System.out.println("Gold");
    }
    if (0 == a && 0 < b) {
      System.out.println("Silver");
    }
    if (0 < a && 0 < b) {
      System.out.println("Alloy");
    }
  }

  // テスト用
  public static String answer(double a, double b) {
    if (0 < a && b == 0) {
      return ("Gold");
    }
    if (0 == a && 0 < b) {
      return ("Silver");
    }
    if (0 < a && 0 < b) {
      return ("Alloy");
    }
    return "else";
  }
}
