package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC202 {
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int a = Integer.parseInt(scanner.next());
    int b = Integer.parseInt(scanner.next());
    int c = Integer.parseInt(scanner.next());
    int reverseNum1 = 7 - a;
    int reverseNum2 = 7 - b;
    int reverseNum3 = 7 - c;
    System.out.println(reverseNum1 + reverseNum2 + reverseNum3);
  }
  // ##########################################
  // テスト用
  public static int answer(int a, int b, int c) {
    int reverseNum1 = 7 - a;
    int reverseNum2 = 7 - b;
    int reverseNum3 = 7 - c;
    return reverseNum1 + reverseNum2 + reverseNum3;
  }
}
