package player;

import behaviours.IWeapon;

public class Barbarian extends Fighter {

  public Barbarian(String name, int healthPoints, IWeapon weapon) {
    super(name, healthPoints, weapon);
  }

  public int damageValue() {
    return this.weapon.damageValue();
  }
}
