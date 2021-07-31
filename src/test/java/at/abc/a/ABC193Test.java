package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC193Test {
  @Test
  @DisplayName("ABC193 A Test")
  void check() {
    assertEquals(ABC193.answer(100, 80), 20.0);
  }
}
