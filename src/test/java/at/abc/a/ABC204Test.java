package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC204Test {
  @Test
  @DisplayName("euler.Problem2 Test")
  void check() {
    assertEquals(ABC204.answer(2, 1), 0);
    assertEquals(ABC204.answer(0, 0), 0);
    assertEquals(ABC204.answer(2, 2), 2);
    assertEquals(ABC204.answer(0, 2), 1);
  }
}
