import java.util.Scanner;

// 提出用
public class Main {
  //
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    String xy = scanner.next();
    int x = Integer.parseInt(xy.split("\\.")[0]);
    int y = Integer.parseInt(xy.split("\\.")[1]);

    if (0 <= y && y <= 2) {
      System.out.println(x + "-");
    } else if (3 <= y && y <= 6) {
      System.out.println(x);
    } else {
      System.out.println(x + "+");
    }
  }
  // ##########################################
}
