package defence;

import behaviours.IDefend;
import enemy.Enemy;

public abstract class Creature implements IDefend {

  private int damage;

  public Creature(int damage) {
    this.damage = damage;
  }

  public void defend(Enemy enemy) {
    enemy.takeDamage(this.damage);
  }

  public int getDamage() {
    return damage;
  }
}
