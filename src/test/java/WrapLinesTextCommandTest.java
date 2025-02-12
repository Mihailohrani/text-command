import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class WrapLinesTextCommandTest {

  @Test
  void testWrapMultipleLines() {
    WrapLinesTextCommand command = new WrapLinesTextCommand("[", "]");
    String input = "Hello\nWorld";
    String expected = "[Hello]\n[World]";
    assertEquals(expected, command.execute(input));
  }

  @Test
  void testWrapSingleLine() {
    WrapLinesTextCommand command = new WrapLinesTextCommand("<", ">");
    assertEquals("<Hello>", command.execute("Hello"));
  }
}
