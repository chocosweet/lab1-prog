package units;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.AerialAce;
import attacks.FireBlast;
import attacks.Facade;

public class Cubone extends Pokemon {
  public Cubone(int level) {
    super("Cubone", level);
    this.setup();
  }

  protected Cubone(String name, int level) {
    super(name, level);
    this.setup();
  }

  private void setup() {
    this.setType(Type.GROUND);
    this.setStats(50d, 50d, 95d, 40d, 50d, 35d);
    this.addMove(new AerialAce());
    this.addMove(new FireBlast());
    this.addMove(new Facade());
  }
}