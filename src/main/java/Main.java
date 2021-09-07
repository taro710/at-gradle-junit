import java.util.Scanner;

// 提出用
public class Main {
  //
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());
    int a = Integer.parseInt(scanner.next());
    int x = Integer.parseInt(scanner.next());
    int y = Integer.parseInt(scanner.next());

    if (n < a) { // A個以上は買わない
      System.out.println(x * n);
    } else { // A個以上買う
      System.out.println(x * a + (n - a) * y);
    }
  }
  // ##########################################
}
