import java.util.Scanner;

// 提出用
public class Main {
  //
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    long m = Long.parseLong(scanner.next());
    long h = Long.parseLong(scanner.next());

    System.out.println(h % m == 0 ? "Yes" : "No");
  }
  // ##########################################
}
