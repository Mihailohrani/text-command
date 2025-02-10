/**
 * Command to capitalize the first letter of each word in the text.
 *
 * @see TextCommand
 *
 * @author Mihailo Hranisavljevic
 * @version 1.0
 */
class CapitalizeWordsTextCommand implements TextCommand {
  /**
   * Capitalizes the first letter of each word in the text.
   *
   * @param text The input text.
   * @return The text with each word capitalized.
   */
  @Override
  public String execute(String text) {
    String[] words = text.split(" ");
    StringBuilder result = new StringBuilder();

    for (String word : words) {
      if (!word.isEmpty()) {
        result.append(Character.toUpperCase(word.charAt(0)))
            .append(word.substring(1).toLowerCase())
            .append(" ");
      }
    }
    return result.toString().trim();
  }
}