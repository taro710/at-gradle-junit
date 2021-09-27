package at.abc.b;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ABC196Test {
  @Test
  @DisplayName("ABC196 B Test")
  void check() {
    assertEquals(ABC196.answer("5.90"), "5");
    assertEquals(ABC196.answer("0"), "0");
    assertEquals(
        ABC196.answer("84939825309432908832902189.9092309409809091329"),
        "84939825309432908832902189");
  }
}
