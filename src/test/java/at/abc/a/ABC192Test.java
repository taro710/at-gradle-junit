package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC192Test {
  @Test
  @DisplayName("ABC192 A Test")
  void check() {
    assertEquals(ABC192.answer(80), 20);
    assertEquals(ABC192.answer(1100), 100);
  }
}
