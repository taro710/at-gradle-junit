package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC203Test {
  @Test
  @DisplayName("ABC203 A Test")
  void check() {
    assertEquals(ABC203.answer(2, 5, 2), 5);
    assertEquals(ABC203.answer(4, 5, 6), 0);
    assertEquals(ABC203.answer(1, 1, 1), 1);
  }
}
