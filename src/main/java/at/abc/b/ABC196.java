package at.abc.b;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC196 {
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    String x = scanner.next();

    if (x.contains("\\.")) {
      System.out.println(x);
    } else {
      System.out.println(x.split("\\.")[0]);
    }
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
