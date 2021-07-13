package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC200 {
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());
    if (n % 100 == 0) {
      System.out.println(n / 100);
    } else {
      System.out.println(n / 100 + 1);
    }
  }
  // ##########################################

  // テスト用
  public static int answer(int n) {
    if (n % 100 == 0) {
      return n / 100;
    } else {
      return n / 100 + 1;
    }
  }
}
