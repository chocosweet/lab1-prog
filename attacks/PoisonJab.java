package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Status;

public class PoisonJab extends PhysicalMove {
  public PoisonJab() {
    super(Type.POISON, 80d, 100d);
  }

  protected void applyOppEffects(Pokemon p) {
    Effect e = new Effect().chance(0.3).condition(Status.POISON);
  }

  @Override
  protected String describe() {
    return "gets ready to poison";
  }
}