import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class WrapSelectionTextCommandTest {

  @Test
  void testWrapValidSelection() {
    WrapSelectionTextCommand command = new WrapSelectionTextCommand("[", "]", 6, 11);
    String input = "Hello World";
    String expected = "Hello [World]";
    assertEquals(expected, command.execute(input));
  }

  @Test
  void testInvalidSelectionRange() {
    WrapSelectionTextCommand command = new WrapSelectionTextCommand("(", ")", 5, 3);
    assertThrows(IllegalArgumentException.class, () -> command.execute("Hello"));
  }
}
