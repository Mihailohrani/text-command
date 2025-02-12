import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ReplaceFirstTextCommandTest {

  @Test
  void testReplaceFirstOccurrence() {
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("hello", "hi");
    assertEquals("hi world hello", command.execute("hello world hello"));
  }

  @Test
  void testNoOccurrence() {
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("bye", "hi");
    assertEquals("hello world", command.execute("hello world"));
  }
}