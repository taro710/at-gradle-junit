import java.util.Scanner;

// 提出用
public class Main {
  //
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    double a = Double.parseDouble(scanner.next());
    double b = Double.parseDouble(scanner.next());

    System.out.println(((a - b) / 3) + b);
  }
  // ##########################################
}
