package at.abc.b;
// パッケージ名は含めない

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// クラス名はMain
public class ABC194 {
  // パッケージ名は含めない

  // ##########################################
  public static void main(String... args) {

    Scanner scanner = new Scanner(System.in);
    int n = Integer.parseInt(scanner.next());

    List<Integer> listA = new ArrayList<>();
    List<Integer> listB = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      int a = Integer.parseInt(scanner.next());
      int b = Integer.parseInt(scanner.next());
      listA.add(a);
      listB.add(b);
    }

    int minTimeA = Collections.min(listA);
    int minTimeB = Collections.min(listB);

    int bestStaffIdOnA = listA.indexOf(minTimeA);
    int bestStaffIdOnB = listB.indexOf(minTimeB);

    if (bestStaffIdOnA == bestStaffIdOnB
        && listA.lastIndexOf(minTimeA) == bestStaffIdOnA
        && listB.lastIndexOf(minTimeB) == bestStaffIdOnB) {
      if (minTimeA == minTimeB) {
        listA.remove(listA.indexOf(minTimeA));
        listB.remove(listB.indexOf(minTimeB));
        int nextMin = Math.min(Collections.min(listA), Collections.min(listB));
        System.out.println(nextMin);
      } else {
        System.out.println(minTimeA + minTimeB);
      }
    } else {
      System.out.println(Math.max(minTimeA, minTimeB));
    }
  }
  // ##########################################
}
