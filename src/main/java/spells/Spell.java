package spells;

import behaviours.ISpell;
import enemy.Enemy;

public abstract class Spell implements ISpell {

  private int damage;

  public Spell(int damage) {
    this.damage = damage;
  }

  public void cast(Enemy enemy){
    enemy.takeDamage(this.damage);
  }

  public int getDamage() {
    return damage;
  }
}
