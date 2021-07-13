package at.abc.a;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC200Test {
  @Test
  @DisplayName("ABC200 A Test")
  void check() {
    assertEquals(ABC200.answer(1), 1);
    assertEquals(ABC200.answer(99), 1);
    assertEquals(ABC200.answer(100), 1);
    assertEquals(ABC200.answer(101), 2);
    assertEquals(ABC200.answer(200), 2);
    assertEquals(ABC200.answer(1000), 10);
    assertEquals(ABC200.answer(1100), 11);
    assertEquals(ABC200.answer(2000), 20);
    assertEquals(ABC200.answer(2021), 21);
  }
}
