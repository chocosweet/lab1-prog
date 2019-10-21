package units;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.DazzlingGleam;
import attacks.AquaRing;
import attacks.Charm;
import attacks.SuperSonic;



public class Phione extends Pokemon {
  public Phione(int level) {
    super("Phione", level);
    this.setup();
  }

  private void setup() {
    this.setType(Type.WATER);
    this.setStats(80d, 80d, 80d, 80d, 80d, 80d);
    this.addMove(new DazzlingGleam());
    this.addMove(new AquaRing());
    this.addMove(new SuperSonic());
    this.addMove(new Charm());
  }
}
