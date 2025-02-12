import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CapitalizeWordsTextCommandTest {

  private final CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();

  @Test
  void testCapitalizeWords() {
    assertEquals("Hello World", command.execute("hello world"));
  }

  @Test
  void testAlreadyCapitalized() {
    assertEquals("Hello World", command.execute("Hello World"));
  }
}
