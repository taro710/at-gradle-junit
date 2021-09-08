package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC213 {

  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int a = Integer.parseInt(scanner.next());
    int b = Integer.parseInt(scanner.next());

    for (int i = 0; i <= 255; i++) {
      if ((a ^ i) == b) {
        System.out.println(i);
      }
    }
  }

  // テスト用
  public static int answer(int a, int b) {
    for (int i = 0; i <= 255; i++) {
      if ((a ^ i) == b) {
        return i;
      }
    }
    return 0;
  }
}
