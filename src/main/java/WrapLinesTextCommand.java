/**
 * Command to wrap each line of text with a specified opening and closing string.
 *
 * @see WrapTextCommand
 *
 * @author Mihailo Hranisavljevic
 * @version 1.0
 */
class WrapLinesTextCommand extends WrapTextCommand {
  /**
   * Constructs a WrapLinesTextCommand.
   *
   * @param prefix The string to prepend to each line.
   * @param suffix The string to append to each line.
   */
  public WrapLinesTextCommand(String prefix, String suffix) {
    super(prefix, suffix);
  }

  /**
   * Wraps each line of the given text with the specified prefix and suffix.
   *
   * @param text The input text.
   * @return The text with each line wrapped separately.
   */
  @Override
  public String execute(String text) {
    String[] lines = text.split("\\n");
    StringBuilder result = new StringBuilder();

    for (String line : lines) {
      result.append(super.execute(line)).append("\n");
    }

    return result.toString().trim();
  }
}
