/**
 * Command to wrap a selected portion of text with a specified prefix and suffix.
 *
 * @see WrapTextCommand
 *
 * @author Mihailo Hranisavljevic
 * @version 1.0
 */
class WrapSelectionTextCommand extends WrapTextCommand {
  private final int startIndex;
  private final int endIndex;

  /**
   * Constructs a WrapSelectionTextCommand.
   *
   * @param prefix The string to prepend to the selected text.
   * @param suffix The string to append to the selected text.
   * @param startIndex The start index of the selection.
   * @param endIndex The end index of the selection.
   */
  public WrapSelectionTextCommand(String prefix, String suffix, int startIndex, int endIndex) {
    super(prefix, suffix);
    this.startIndex = startIndex;
    this.endIndex = endIndex;
  }

  /**
   * Wraps the selected portion of the given text with the specified prefix and suffix.
   *
   * @param text The input text.
   * @return The text with the selected portion wrapped.
   * @throws IllegalArgumentException If the indices are out of bounds or invalid.
   */
  @Override
  public String execute(String text) {
    if (startIndex < 0 || endIndex > text.length() || startIndex >= endIndex) {
      throw new IllegalArgumentException("Invalid selection range");
    }
    return text.substring(0, startIndex) + super.execute(text.substring(startIndex, endIndex)) + text.substring(endIndex);
  }
}