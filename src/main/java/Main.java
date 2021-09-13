// パッケージ名は含めない

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// クラス名はMain
public class Main {
  // ##########################################
  public static void main(String... args) {
    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());

    Set<Integer> set = new HashSet<>();
    for (int i = 1; i <= n; i++) {
      int a = Integer.parseInt(scanner.next());
      int p = Integer.parseInt(scanner.next());
      int x = Integer.parseInt(scanner.next());
      int zaiko = x - a;

      if (zaiko <= 0) {
        set.add(-1);
      } else {
        set.add(p);
      }
    }

    if (set.size() == 1 && set.contains(-1)) {
      System.out.println(-1);
    } else {
      set.remove(-1);
      int ans = Collections.min(set);
      System.out.println(ans);
    }
  }
  // ##########################################
}
