package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC199Test {
  @Test
  @DisplayName("ABC199 A Test")
  void check() {
    assertEquals(ABC199.answer(2, 2, 4), "Yes");
    assertEquals(ABC199.answer(10, 10, 10), "No");
    assertEquals(ABC199.answer(3, 4, 5), "No");
  }
}
