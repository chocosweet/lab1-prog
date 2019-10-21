package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class AerialAce extends PhysicalMove {
  public AerialAce() {
    super(Type.FAIRY, 60d, 100d);
  }

  @Override
  protected boolean checkAccuracy(Pokemon att, Pokemon def) {
    return true;
  }

  @Override
  protected String describe() {
    return "does not miss";
  }
}

