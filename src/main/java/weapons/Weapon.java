package weapons;

import behaviours.IWeapon;

public abstract class Weapon implements IWeapon {

  private int damage;

  public Weapon(int damage) {
    this.damage =  damage;
  }

  public int damageValue() {
    return this.damage;
  }
}
