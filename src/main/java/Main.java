import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 提出用
public class Main {
  //
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int a1 = Integer.parseInt(scanner.next());
    int a2 = Integer.parseInt(scanner.next());
    int a3 = Integer.parseInt(scanner.next());
    List<Integer> list = new ArrayList<>(List.of(a1, a2, a3));
    Collections.sort(list);

    if (list.get(2) - list.get(1) == list.get(1) - list.get(0)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
