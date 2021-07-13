package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC209Test {
  @Test
  @DisplayName("ABC209 A Test")
  void check() {
    assertEquals(ABC209.answer(2, 4), 3);
    assertEquals(ABC209.answer(10, 100), 91);
    assertEquals(ABC209.answer(2, 2), 1);
    assertEquals(ABC209.answer(2, 1), 0);
  }
}
