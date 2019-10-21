package attacks;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Status;
import utils.RandomGen;

public class SuperSonic extends StatusMove {
  public SuperSonic() {
    super(Type.NORMAL, 0d, 55d);
  }


  protected void applyOppEffects(Pokemon p) {
    Effect.confuse(p);
  }
  @Override
  protected String describe() {
    return "confuse";
  }
}