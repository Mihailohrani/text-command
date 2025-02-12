import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class WrapTextCommandTest {

  @Test
  void testWrapText() {
    WrapTextCommand command = new WrapTextCommand("[", "]");
    assertEquals("[Hello]", command.execute("Hello"));
  }

  @Test
  void testWrapEmptyString() {
    WrapTextCommand command = new WrapTextCommand("<", ">");
    assertEquals("<>", command.execute(""));
  }
}