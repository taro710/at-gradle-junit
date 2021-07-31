package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC193 {
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    double a = Double.parseDouble(scanner.next());
    double b = Double.parseDouble(scanner.next());

    System.out.println(((a - b) / a) * 100);
  }
  // ##########################################

  // テスト用
  public static double answer(double a, double b) {
    return ((a - b) / a) * 100;
  }
}
