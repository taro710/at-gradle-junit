// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class Main {
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int x = Integer.parseInt(scanner.next());
    if (x >= 90) {
      System.out.println("expert");
    } else {
      if (x < 40) {
        System.out.println(40 - x);
      } else if (x < 70) {
        System.out.println(70 - x);
      } else {
        System.out.println(90 - x);
      }
    }
  }
  // ##########################################
}
