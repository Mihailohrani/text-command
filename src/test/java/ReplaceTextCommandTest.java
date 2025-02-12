import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ReplaceTextCommandTest {

  @Test
  void testReplaceAllOccurrences() {
    ReplaceTextCommand command = new ReplaceTextCommand("hello", "hi");
    assertEquals("hi world hi", command.execute("hello world hello"));
  }

  @Test
  void testNoOccurrences() {
    ReplaceTextCommand command = new ReplaceTextCommand("bye", "hi");
    assertEquals("hello world", command.execute("hello world"));
  }
}