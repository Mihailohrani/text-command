/**
 * A class that capitalizes the first letter of each word in the given text.
 *
 * @see TextCommand
 *
 * @author Mihailo Hranisavljevic
 * @version 1.0
 *
 */
public class CapitalizeTextCommand implements TextCommand{

  /**
   * Capitalizes the entire text.
   *
   * @param text The input text.
   * @return The capitalized text.
   */
  @Override
  public String execute(String text) {
    return text.toUpperCase();
  }
}
