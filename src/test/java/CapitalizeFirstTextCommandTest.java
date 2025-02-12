import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CapitalizeFirstTextCommandTest {

  private final CapitalizeFirstTextCommand command = new CapitalizeFirstTextCommand();

  @Test
  void testCapitalizeFirstLetter() {
    assertEquals("Hello", command.execute("hello"));
  }

  @Test
  void testEmptyString() {
    assertEquals("", command.execute(""));
  }
}
