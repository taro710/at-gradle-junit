import java.util.Scanner;

// 提出用
public class Main {
  //
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int a = Integer.parseInt(scanner.next());
    int b = Integer.parseInt(scanner.next());

    for (int i = 0; i <= 255; i++) {
      if ((a ^ i) == b) {
        System.out.println(i);
      }
    }
  }
  // ##########################################
}
