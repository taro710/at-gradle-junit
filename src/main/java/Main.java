import java.util.Scanner;

// 提出用
public class Main {
  //
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    double a = Double.parseDouble(scanner.next());
    double b = Double.parseDouble(scanner.next());

    if (0 < a && b == 0) {
      System.out.println("Gold");
    }
    if (0 == a && 0 < b) {
      System.out.println("Silver");
    }
    if (0 < a && 0 < b) {
      System.out.println("Alloy");
    }
  }
  // ##########################################
}
