package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC216 {

  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    String xy = scanner.next();
    int x = Integer.parseInt(xy.split("\\.")[0]);
    int y = Integer.parseInt(xy.split("\\.")[1]);

    if (0 <= y && y <= 2) {
      System.out.println(x + "-");
    } else if (3 <= y && y <= 6) {
      System.out.println(x);
    } else {
      System.out.println(x + "+");
    }
  }

  // テスト用
  public static String answer(String xy) {
    int x = Integer.parseInt(xy.split("\\.")[0]);
    int y = Integer.parseInt(xy.split("\\.")[1]);

    if (0 <= y && y <= 2) {
      return (x + "-");
    } else if (3 <= y && y <= 6) {
      return String.valueOf(x);
    } else {
      return (x + "+");
    }
  }
}
