package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC196Test {
  @Test
  @DisplayName("ABC197 A Test")
  void check() {
    assertEquals(ABC196.answer(0, 10, 0, 10), 10);
    assertEquals(ABC196.answer(-100, -100, 100, 100), -200);
    assertEquals(ABC196.answer(-100, 100, -100, 100), 200);
  }
}
