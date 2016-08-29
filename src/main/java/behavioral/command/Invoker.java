package behavioral.command;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Invoker {

  private ArrayList<Execute> list = new ArrayList<>();

  Invoker() {
    list.add(new ExecuteFile());
    list.add(new ExecutePrint());
  }

  Execute getCommand(String commandName) {
    List<Execute> collect = list.stream().filter(x -> x.getCommand().equalsIgnoreCase(commandName)).collect(Collectors.toList());
    return collect.get(0);
  }
}
