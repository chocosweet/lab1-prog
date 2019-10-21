package units;

import units.Grubbin;
import ru.ifmo.se.pokemon.Type;
import attacks.Crunch;

public class Charjabug extends Grubbin {
  public Charjabug(int level) {
    super("Charjabug", level);
    this.setup();
  }
  protected Charjabug(String name, int level) {
    super(name, level);
    this.setup();
  }
  private void setup() {
    this.addMove(new Crunch());
  }
}