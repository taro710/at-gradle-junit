package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC204 {

  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int x = Integer.parseInt(scanner.next());
    int y = Integer.parseInt(scanner.next());

    if (x == y) {
      System.out.println(x);
    } else {
      System.out.println(3 - x - y);
    }
  }

  // テスト用
  public static int answer(int x, int y) {
    if (x == y) {
      return x;
    } else {
      return 3 - x - y;
    }
  }
}
