import java.util.List;

public class Script {
  private final List<TextCommand> commands;

  public Script(List<TextCommand> commands) {
    this.commands = commands;
  }

  public String execute(String text){
    for (TextCommand command : commands){
      text = command.execute(text);
    }
    return text;
  }
}
