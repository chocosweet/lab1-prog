package attacks;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

public class Charm extends StatusMove {
  public Charm() {
    super(Type.FAIRY, 0d, 100d);
  }

  protected void applyOppEffects(Pokemon p) {
    final double attackStat = p.getStat(Stat.ATTACK); 
    final Effect e = new Effect().stat(Stat.ATTACK, (int) Math.max(-6d, attackStat - 2d)).turns(1);
    p.addEffect(e);
  }

  @Override
  protected String describe() {
    return "watching closely";
  }
}