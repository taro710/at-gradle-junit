package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC212Test {
  @Test
  @DisplayName("ABC212 A Test")
  void check() {
    assertEquals(ABC212.answer(50, 50), "Alloy");
    assertEquals(ABC212.answer(100, 0), "Gold");
    assertEquals(ABC212.answer(0, 100), "Silver");
    assertEquals(ABC212.answer(100, 2), "Alloy");
  }
}
