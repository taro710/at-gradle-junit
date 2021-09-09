package at.abc.b;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC192Test {
  @Test
  @DisplayName("ABC192 B Test")
  void check() {
    assertEquals(at.abc.b.ABC192.answer("dIfFiCuLt"), "Yes");
    assertEquals(at.abc.b.ABC192.answer("eASY"), "No");
    assertEquals(at.abc.b.ABC192.answer("a"), "Yes");
  }
}
