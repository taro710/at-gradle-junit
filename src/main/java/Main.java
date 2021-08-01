import java.util.Scanner;

// 提出用
public class Main {
  //
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    double x = Double.parseDouble(scanner.next());
    Double num = x % 100;

    if (num == 0) System.out.println(100);
    else System.out.println(100 - num.intValue());
  }
  // ##########################################
}
