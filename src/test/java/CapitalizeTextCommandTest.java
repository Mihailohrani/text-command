import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CapitalizeTextCommandTest {

  private final CapitalizeTextCommand command = new CapitalizeTextCommand();

  @Test
  void testCapitalizeText() {
    assertEquals("HELLO WORLD", command.execute("hello world"));
  }

  @Test
  void testEmptyString() {
    assertEquals("", command.execute(""));
  }
}
