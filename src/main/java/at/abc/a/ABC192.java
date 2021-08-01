package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC192 {
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int x = Integer.parseInt(scanner.next());
    int num = x % 100;

    if (num == 0) System.out.println(100);
    else System.out.println(100 - num);
  }
  // ##########################################

  // テスト用
  public static double answer(int x) {
    int num = x % 100;

    if (num == 0) return 100;
    else return 100 - num;
  }
}
