/**
* Interface defining a method used for executing commands on text.
*
* @author Mihailo Hranisavljevic
* @version 1.0
*/
public interface TextCommand {
  /**
   * Runs the command on specified text.
   *
   * @param text The input text to be processed.
   * @return The processed text after command execution.
   */
  String execute(String text);
}
