package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC210 {

  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());
    int a = Integer.parseInt(scanner.next());
    int x = Integer.parseInt(scanner.next());
    int y = Integer.parseInt(scanner.next());

    if (n < a) { // A個以上は買わない
      System.out.println(x * n);
    } else { // A個以上買う
      System.out.println(x * a + (n - a) * y);
    }
  }

  // テスト用
  public static int answer(int n, int a, int x, int y) {
    if (n < a) { // A個以上は買わない
      return (x * n);
    } else { // A個以上買う
      return (x * a + (n - a) * y);
    }
  }
}
