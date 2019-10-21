package units;

import units.Charjabug;
import ru.ifmo.se.pokemon.Type;
import attacks.Thunder;

public class Vikavolt extends Charjabug {
  public Vikavolt(int level) {
    super("Vikavolt", level);
    this.setup();
  }
  private void setup() {
    this.addMove(new Thunder());
  }
}