// パッケージ名は含めない

import java.util.Scanner;

// クラス名はMain
public class Main {
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    String x = scanner.next();

    if (x.contains("\\.")) {
      System.out.println(x);
    } else {
      System.out.println(x.split("\\.")[0]);
    }
  }
  // ##########################################
}
