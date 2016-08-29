package structural.composite;

import java.util.ArrayList;
import java.util.List;

class Main {

  String returnAllShapes() {
    StringBuilder shapeNames = new StringBuilder();
    List<IShape> iShapes = new ArrayList<>();
    iShapes.add(new Circle());
    iShapes.add(new Rectangle());
    iShapes.forEach((iShape) -> shapeNames.append(iShape.Name()).append(" "));
    return String.valueOf(shapeNames);
  }
}
