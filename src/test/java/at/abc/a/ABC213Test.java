package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC213Test {
  @Test
  @DisplayName("ABC213 A Test")
  void check() {
    assertEquals(ABC213.answer(3, 6), 5);
    assertEquals(ABC213.answer(10, 12), 6);
  }
}
