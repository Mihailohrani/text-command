/**
 * Command to replace only the first occurrence of a specified substring.
 * Subclass of ReplaceTextCommand
 *
 * @see ReplaceTextCommand
 *
 * @author Mihailo Hranisavljevic
 * @version 1.0
 */
class ReplaceFirstTextCommand extends ReplaceTextCommand {
  /**
   * Constructs a ReplaceFirstTextCommand.
   *
   * @param from The substring to be replaced.
   * @param to The replacement substring.
   */
  public ReplaceFirstTextCommand(String from, String to) {
    super(from, to);
  }

  /**
   * Executes the replacement command on the given text, replacing only the first occurrence.
   *
   * @param text The input text.
   * @return The text with the first occurrence of 'from' replaced by 'to'.
   */
  @Override
  public String execute(String text) {
    return text.replaceFirst(getFrom(), getTo());
  }
}
