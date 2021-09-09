package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC214 {

  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());

    if (n <= 125) {
      System.out.println(4);
    } else if (n <= 211) {
      System.out.println(6);
    } else {
      System.out.println(8);
    }
  }

  // テスト用
  public static int answer(int n) {
    if (n <= 125) {
      return (4);
    } else if (n <= 211) {
      return (6);
    } else {
      return (8);
    }
  }
}
