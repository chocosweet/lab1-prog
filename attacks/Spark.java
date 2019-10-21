package attacks;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Status;

public class Spark extends PhysicalMove {
  public Spark() {
    super(Type.ELECTRIC, 65d, 100d);
  }


  protected void applyOppEffects(Pokemon p) {
    Effect e = new Effect().chance(0.3).condition(Status.PARALYZE);
  }

  @Override
  protected String describe() {
    return "get ready to paralyze";
  }
}