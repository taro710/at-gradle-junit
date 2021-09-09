package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC214Test {
  @Test
  @DisplayName("ABC214 A Test")
  void check() {
    assertEquals(ABC214.answer(214), 8);
    assertEquals(ABC214.answer(1), 4);
    assertEquals(ABC214.answer(126), 6);
  }
}
