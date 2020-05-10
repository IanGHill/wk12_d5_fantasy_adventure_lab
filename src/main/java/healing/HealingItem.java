package healing;

import behaviours.IHeal;
import player.Player;

public abstract class HealingItem implements IHeal {

  public int healingEffect;

  public HealingItem(int healingEffect) {
    this.healingEffect = healingEffect;
  }

  public void heal(Player player) {
    player.setHealthPoints( player.getHealthPoints() + this.healingEffect);
  }

  public int getHealingEffect() {
    return this.healingEffect;
  }
}
