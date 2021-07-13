import java.util.Scanner;

// 提出用
public class Main {
  //
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());
    if (n % 100 == 0) {
      System.out.println(n / 100);
    } else {
      System.out.println(n / 100 + 1);
    }
  }
}
