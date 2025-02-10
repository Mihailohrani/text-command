/**
 * Command to capitalize only the first letter of the text.
 *
 * @see TextCommand
 *
 * @author Mihailo Hranisavljevic
 * @version 1.0
 */
class CapitalizeFirstTextCommand implements TextCommand {
  /**
   * Capitalizes only the first letter of the text.
   *
   * @param text The input text.
   * @return The text with the first letter capitalized.
   */
  @Override
  public String execute(String text) {
    if (text.isEmpty()) {
      return text;
    }
    return Character.toUpperCase(text.charAt(0)) + text.substring(1);
  }
}