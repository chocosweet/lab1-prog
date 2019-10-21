package units;

import attacks.StoneEdge;

public class Marowak extends Cubone {
  public Marowak(int level) {
    super("Marowak", level);
    this.setup();
  }

  private void setup() {
    this.addMove(new StoneEdge());
  }
}