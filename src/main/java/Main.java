import java.util.Scanner;

// 提出用
public class Main {
  //
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int a = Integer.parseInt(scanner.next());
    int b = Integer.parseInt(scanner.next());
    int c = Integer.parseInt(scanner.next());

    if (Math.pow(a, 2) + Math.pow(b, 2) < Math.pow(c, 2)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
