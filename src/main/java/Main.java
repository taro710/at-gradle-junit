import java.util.Scanner;

// 提出用
public class Main {
  //
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    long a = Long.parseLong(scanner.next());
    long b = Long.parseLong(scanner.next());

    if (a + b >= 15 && b >= 8) System.out.println(1);
    else if (a + b >= 10 && b >= 3) System.out.println(2);
    else if (a + b >= 3) System.out.println(3);
    else System.out.println(4);
  }
  // ##########################################
}
