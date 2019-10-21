package attacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Status;


public class FireBlast extends SpecialMove {
  public FireBlast() {
    super(Type.FIRE, 110d, 85d);
  }

  protected void applyOppEffects(Pokemon p) {
    Effect e = new Effect().chance(0.1).turns(1).condition(Status.BURN);
  }

  @Override
  protected String describe() {
    return "blows up";
  }
}