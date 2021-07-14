package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC198Test {
  @Test
  @DisplayName("ABC198 A Test")
  void check() {
    assertEquals(ABC198.answer(2), 1);
    assertEquals(ABC198.answer(1), 0);
    assertEquals(ABC198.answer(3), 2);
    assertEquals(ABC198.answer(6), 5);
  }
}
