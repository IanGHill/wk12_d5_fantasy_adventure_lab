package player;

import behaviours.IDefend;
import behaviours.ISpell;

public class Wizard extends Mage{
  public Wizard(String name, int healthPoints, IDefend defender, ISpell spell) {
    super(name, healthPoints, defender, spell);
  }
}
