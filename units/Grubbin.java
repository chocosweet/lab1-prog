package units;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.Spark;
import attacks.PoisonJab;


public class Grubbin extends Pokemon {
  public Grubbin(int level) {
    super("Grubbin", level);
    this.setup();
  }

  protected Grubbin(String name, int level) {
    super(name, level);
    this.setup();
  }

  private void setup() {
    this.addMove(new Spark());
    this.addMove(new PoisonJab());
  }
}