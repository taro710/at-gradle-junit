package at.abc.b;
// パッケージ名は含めない

import java.util.List;
import java.util.Scanner;

// クラス名はMain
public class ABC192 {
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    String s = (scanner.next());

    if (isOk(s)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
  // ##########################################

  // テスト用
  public static String answer(String s) {
    if (isOk(s)) {
      return "Yes";
    } else {
      return "No";
    }
  }

  public static boolean isOk(String string) {
    long count = 1;
    List<String> big = List.of("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
    List<String> small = List.of("abcdefghijklmnopqrstuvwxyz".split(""));
    for (String str : string.split("")) {
      if (count % 2 == 0 && small.contains(str)) {
        return false;
      } else if (count % 2 != 0 && big.contains(str)) {
        return false;
      }
      count++;
    }
    return true;
  }
}
