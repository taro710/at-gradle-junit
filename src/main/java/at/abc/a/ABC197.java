package at.abc.a;
// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class ABC197 {
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();

    // TODO 一個でもString.valueOfに入れれば良い
    System.out.println(String.valueOf(s.charAt(1)) + s.charAt(2) + s.charAt(0));
  }
  // ##########################################

  // テスト用
  public static String answer(String s) {

    return s.charAt(1) + String.valueOf(s.charAt(2)) + s.charAt(0);
  }
}
