package player;

import behaviours.IDefend;
import behaviours.ISpell;
import defence.Dragon;
import enemy.Enemy;
import spells.LightningBolt;

public abstract class Mage extends Player {

  private IDefend defender;
  private ISpell spell;

  public Mage(String name, int healthPoints, IDefend defender, ISpell spell) {
    super(name, healthPoints);
    this.defender = defender;
    this.spell = spell;
  }

  public void defend(Enemy enemy){
    this.defender.defend(enemy);
  }

  public IDefend getDefender() {
    return defender;
  }

  public ISpell getSpell() {
    return spell;
  }

  public void switchSpell(ISpell newSpell) {
    this.spell = newSpell;
  }

  public void switchDefender(IDefend newDefender) {
    this.defender = newDefender;
  }
}
