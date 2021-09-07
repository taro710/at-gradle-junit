package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC211Test {
  @Test
  @DisplayName("ABC210 A Test")
  void check() {
    assertEquals(ABC211.answer(130, 100), 110);
    assertEquals(ABC211.answer(300, 50), 133.33333333333331);
    assertEquals(ABC211.answer(123, 123), 123);
  }
}
