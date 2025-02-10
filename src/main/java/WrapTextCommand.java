/**
 * This class is a concrete implementation of the TextCommand interface.
 * It wraps the input text with a prefix and a suffix.
 *
 * @see TextCommand
 *
 * @author Mihailo Hranisavljevic
 * @version 1.0
 */
public class WrapTextCommand implements TextCommand {
  private final String prefix;
  private final String suffix;

  /**
   * Constructs a WrapTextCommand.
   *
   * @param prefix The string to prepend to the text.
   * @param suffix The string to append to the text.
   */
  public WrapTextCommand(String prefix, String suffix) {
    this.prefix = prefix;
    this.suffix = suffix;
  }

  /**
   * Retrieves the prefix string.
   *
   * @return The prefix string.
   */
  public String getPrefix() {
    return prefix;
  }

  /**
   * Retrieves the suffix string.
   *
   * @return The suffix string.
   */
  public String getSuffix() {
    return suffix;
  }

  /**
   * Wraps the given text with the specified prefix and suffix.
   *
   * @param text The input text.
   * @return The wrapped text.
   */
  @Override
  public String execute(String text) {
    return prefix + text + suffix;
  }
}