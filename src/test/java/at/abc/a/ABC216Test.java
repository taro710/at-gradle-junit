package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC216Test {
  @Test
  @DisplayName("ABC216 A Test")
  void check() {
    assertEquals(ABC216.answer("15.8"), "15+");
    assertEquals(ABC216.answer("1.0"), "1-");
    assertEquals(ABC216.answer("12.5"), "12");
  }
}
