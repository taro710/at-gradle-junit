package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC217Test {
  @Test
  @DisplayName("ABC217 A Test")
  void check() {
    assertEquals(ABC217.answer("abc", "atcoder"), "Yes");
    assertEquals(ABC217.answer("arc", "agc"), "No");
    assertEquals(ABC217.answer("a", "aaa"), "Yes");
  }
}
