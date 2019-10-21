package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Status;

public class Facade extends PhysicalMove {
  public Facade() {
    super(Type.NORMAL, 70d, 100d);
  }

  @Override
  protected double calcCriticalHit(Pokemon att, Pokemon def) {
    double factor = super.calcCriticalHit(att, def);

    if (factor < 2d && this.checkCriticalHitCondition(def.getCondition())) {
      factor = 2d;
    }

    return factor;
  }

  private boolean checkCriticalHitCondition(Status pockemonStatus) {
    for (Status status: pockemonStatus.values()) {
      if (status.equals(Status.BURN) || status.equals(Status.POISON) || status.equals(Status.PARALYZE)) {
        return true;
      }
    }

    return false;
  }

  @Override
  protected String describe() {
    return "power doubles";
  }
}