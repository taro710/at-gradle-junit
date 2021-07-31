package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC194 {
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    long a = Long.parseLong(scanner.next());
    long b = Long.parseLong(scanner.next());

    if (a + b >= 15 && b >= 8) System.out.println(1);
    else if (a + b >= 10 && b >= 3) System.out.println(2);
    else if (a + b >= 3) System.out.println(3);
    else System.out.println(4);
  }
  // ##########################################

  // テスト用
  public static int answer(long a, long b) {
    if (a + b >= 15 && b >= 8) return 1;
    else if (a + b >= 10 && b >= 3) return 2;
    else if (a + b >= 3) return 3;
    else return 4;
  }
}
