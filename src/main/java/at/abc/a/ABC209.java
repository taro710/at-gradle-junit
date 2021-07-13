package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC209 {

  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int a = Integer.parseInt(scanner.next());
    int b = Integer.parseInt(scanner.next());
    if (a <= b) {
      System.out.println(b - a + 1);
    } else {
      System.out.println(0);
    }
  }

  // テスト用
  public static int answer(int a, int b) {
    if (a <= b) {
      return (b - a + 1);
    } else {
      return (0);
    }
  }
}
