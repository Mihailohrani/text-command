/**
 * Command to replace all text to a new text.
 *
 * @author Mihailo Hranisavljevic
 * @version 1.0
 */
class ReplaceTextCommand implements TextCommand {
  private final String from;
  private final String to;

  /**
   * Constructs a ReplaceTextCommand.
   *
   * @param from The substring to be replaced.
   * @param to The replacement substring.
   */
  public ReplaceTextCommand(String from, String to) {
    this.from = from;
    this.to = to;
  }

  /**
   * Returns the substring to be replaced.
   *
   * @return The target substring.
   */
  public String getFrom() {
    return from;
  }

  /**
   * Retrieves the replacement substring.
   *
   * @return The replacement substring.
   */
  public String getTo() {
    return to;
  }

  /**
   * Runs the command on the input text.
   *
   * @param text The input text.
   * @return The text with all occurrences of 'from' replaced by 'to'.
   */
  @Override
  public String execute(String text) {
    return text.replace(from, to);
  }
}