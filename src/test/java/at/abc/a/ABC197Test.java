package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC197Test {
  @Test
  @DisplayName("ABC197 A Test")
  void check() {
    assertEquals(ABC197.answer("abc"), "bca");
    assertEquals(ABC197.answer("aab"), "aba");
    assertEquals(ABC197.answer("123"), "231");
  }
}
