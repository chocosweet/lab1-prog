import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import units.*;
import java.io.PrintStream;

class Main {
  static public void main(String[] arguments) {
    Battle b = new Battle();
    Pokemon p3 = new Phione(1);
    Pokemon p4 = new Cubone(1);
    Pokemon p5 = new Grubbin(1);
    Pokemon p6 = new Charjabug(1);
    Pokemon p7 = new Marowak(1);
    Pokemon p8 = new Vikavolt(1);

    b.addAlly(p3);
    b.addFoe(p4);
    b.addAlly(p5);
    b.addFoe(p6);
    b.addAlly(p7);
    b.addFoe(p8);

    b.go();
  }

}