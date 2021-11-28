package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC219Test {
  @Test
  @DisplayName("ABC219 A Test")
  void check() {
    assertEquals(ABC219.answer(56), "14");
    assertEquals(ABC219.answer(950), "expert");
    assertEquals(ABC219.answer(0), "40");
  }
}
