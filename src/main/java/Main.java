import java.util.Scanner;

// 提出用
public class Main {
  //
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());

    if (n <= 125) {
      System.out.println(4);
    } else if (n <= 211) {
      System.out.println(6);
    } else {
      System.out.println(8);
    }
  }
  // ##########################################
}
