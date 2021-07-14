package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC198 {
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());
    System.out.println(n - 1);
  }
  // ##########################################

  // テスト用
  public static int answer(int n) {

    return n - 1;
  }
}
