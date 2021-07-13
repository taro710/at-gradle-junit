package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC201Test {
  @Test
  @DisplayName("ABC201 A Test")
  void check() {
    assertEquals(ABC201.answer(5, 1, 3), "Yes");
    assertEquals(ABC201.answer(1, 4, 3), "No");
    assertEquals(ABC201.answer(5, 5, 5), "Yes");
  }
}
