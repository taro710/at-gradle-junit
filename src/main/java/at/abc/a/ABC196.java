package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC196 {
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    long a = Long.parseLong(scanner.next());
    long b = Long.parseLong(scanner.next());
    long c = Long.parseLong(scanner.next());
    long d = Long.parseLong(scanner.next());

    System.out.println(b - c);
  }
  // ##########################################

  // テスト用
  public static long answer(long a, long b, long c, long d) {
    return b - c;
  }
}
