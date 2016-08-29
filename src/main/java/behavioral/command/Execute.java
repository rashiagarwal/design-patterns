package behavioral.command;

import lombok.Getter;
import lombok.Setter;

abstract class Execute {
  @Getter
  @Setter
  private String command;

  public abstract String execute();
}
