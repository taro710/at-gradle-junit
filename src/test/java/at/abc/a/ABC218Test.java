package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC218Test {
  @Test
  @DisplayName("ABC218 A Test")
  void check() {
    assertEquals(ABC218.answer(4, "oooxoox"), "No");
    assertEquals(ABC218.answer(7, "ooooooo"), "Yes");
  }
}
