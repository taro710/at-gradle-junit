import java.util.Scanner;

// 提出用
public class Main {
  //
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();

    System.out.println(String.valueOf(s.charAt(1)) + s.charAt(2) + s.charAt(0));
  }
  // ##########################################
}
