package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC210Test {
  @Test
  @DisplayName("ABC210 A Test")
  void check() {
    assertEquals(ABC210.answer(5, 3, 20, 15), 90);
    assertEquals(ABC210.answer(10, 10, 100, 1), 1000);
  }
}
