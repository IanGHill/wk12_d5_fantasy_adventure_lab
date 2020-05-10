package player;

import behaviours.IHeal;

public class Cleric extends Player  {

  private IHeal healingItem;

  public Cleric(String name, int healthPoints, IHeal healingItem) {
    super(name, healthPoints);
    this.healingItem = healingItem;
  }

  public IHeal getHealingItem() {
    return healingItem;
  }

  public void switchHealingItem(IHeal newHealingItem){
    this.healingItem = newHealingItem;
  }

  public void healPlayer(Player player){
    this.healingItem.heal(player);
  }

}
