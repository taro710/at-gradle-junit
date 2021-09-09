package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC215Test {
  @Test
  @DisplayName("ABC215 A Test")
  void check() {
    assertEquals(ABC215.answer("Hello,World!"), "AC");
    assertEquals(ABC215.answer("Hello,world!"), "WA");
    assertEquals(ABC215.answer("Hello!World!"), "WA");
  }
}
