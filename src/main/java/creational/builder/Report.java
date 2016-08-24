package creational.builder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
class Report {

  public String type;
  public String header;
  public String footer;
}