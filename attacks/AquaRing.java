package attacks;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class AquaRing extends StatusMove {
  public AquaRing() {
    super(Type.WATER, 0d, 100d);
  }


  protected void applySelfEffects(Pokemon p) {
    final double hp = p.getStat(Stat.HP);
    p.setMod(Stat.HP, (int) (-1d/16d * hp));
  }

  @Override
  protected String describe() {
    return "hid behind a conifer wall";
  }
}