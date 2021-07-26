package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC195Test {
  @Test
  @DisplayName("ABC195 A Test")
  void check() {
    assertEquals(ABC195.answer(10, 120), "Yes");
    assertEquals(ABC195.answer(10, 125), "No");
    assertEquals(ABC195.answer(1, 1000), "Yes");
    assertEquals(ABC195.answer(1, 1), "Yes");
    assertEquals(ABC195.answer(1000, 10), "No");
    assertEquals(ABC195.answer(1000, 125), "No");
  }
}
