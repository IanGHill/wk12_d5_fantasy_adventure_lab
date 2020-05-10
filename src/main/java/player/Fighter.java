package player;

import behaviours.IWeapon;
import enemy.Enemy;


public abstract class Fighter extends Player implements IWeapon {

  protected IWeapon weapon;
  public Fighter(String name, int healthPoints, IWeapon weapon) {

    super(name, healthPoints);
    this.weapon = weapon;
  }

  public IWeapon getWeapon() {
    return weapon;
  }

  public void switchWeapon(IWeapon newWeapon){
    this.weapon = newWeapon;
  }

  public void attack(Enemy enemy){
    enemy.takeDamage(weapon.damageValue());
  };
}
