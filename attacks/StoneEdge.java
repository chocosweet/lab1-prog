package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Stat;

public class StoneEdge extends PhysicalMove {
  public StoneEdge() {
    super(Type.ROCK, 100d, 80d);
  }


  protected void applySelfEffects(Pokemon p) {
    Effect e = new Effect().stat(Stat.SPEED, 2);
    p.addEffect(e);
  }

  @Override
  protected String describe() {
    return "accelerates";
  }
}