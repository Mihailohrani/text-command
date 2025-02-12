import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class ScriptTest {

  @Test
  void testExecuteWithMultipleCommands() {
    TextCommand capitalize = new CapitalizeFirstTextCommand();
    TextCommand replace = new ReplaceTextCommand("hello", "hi");

    Script script = new Script(List.of(replace, capitalize));

    assertEquals("Hi world", script.execute("hello world"));
  }

  @Test
  void testExecuteWithNoCommands() {
    Script script = new Script(List.of());
    assertEquals("hello world", script.execute("hello world"));
  }
}
