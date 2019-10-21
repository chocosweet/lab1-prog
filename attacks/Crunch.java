package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.PhysicalMove;

public class Crunch extends PhysicalMove {
  public Crunch() {
    super(Type.DARK, 80d, 100d);
  }


  protected void applyOppEffects(Pokemon p) {
    double defense = p.getStat(Stat.DEFENSE);
    Effect e = new Effect().chance(0.2).stat(Stat.DEFENSE, (int) Math.max(-6d, defense - 1d));
    p.addEffect(e);
  }

  @Override
  protected String describe() {
    return "deals damage";
  }
}