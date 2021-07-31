package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC194Test {
  @Test
  @DisplayName("ABC194 A Test")
  void check() {
    assertEquals(ABC194.answer(10, 8), 1);
    assertEquals(ABC194.answer(1, 2), 3);
    assertEquals(ABC194.answer(0, 0), 4);
  }
}
