package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC202Test {
  @Test
  @DisplayName("ABC202 A Test")
  void check() {
    assertEquals(ABC202.answer(1, 4, 3), 13);
    assertEquals(ABC202.answer(5, 6, 4), 6);
  }
}
