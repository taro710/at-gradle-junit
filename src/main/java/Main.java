import java.util.Scanner;

// 提出用
public class Main {
  //
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    String t = scanner.next();
    if (s.compareTo(t) < 0) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
  // ##########################################
}
