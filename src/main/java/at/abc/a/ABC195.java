package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC195 {
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    long m = Long.parseLong(scanner.next());
    long h = Long.parseLong(scanner.next());

    System.out.println(h % m == 0 ? "Yes" : "No");
  }
  // ##########################################

  // テスト用
  public static String answer(long m, long h) {
    return h % m == 0 ? "Yes" : "No";
  }
}
