package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Status;

public class Thunder extends SpecialMove {
  public Thunder() {
    super(Type.ELECTRIC, 110d, 70d);
  }


  protected void applyOppEffects(Pokemon p) {
    Effect e = new Effect().chance(0.3).condition(Status.PARALYZE);
  }

   @Override
  protected String describe() {
    return "paralyze";
  }
}