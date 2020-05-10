package spellTest;

import enemy.Troll;
import org.junit.Before;
import org.junit.Test;
import spells.Fireball;
import spells.LightningBolt;

import static org.junit.Assert.assertEquals;

public class FireballTest {

  Fireball fireball;
  Troll thuk;

  @Before
  public void before(){
    fireball = new Fireball(30);
    thuk = new Troll(300);
  }

  @Test
  public void hasDamage(){
    assertEquals(30, fireball.getDamage());
  }

  @Test
  public void canCast() {
    fireball.cast(thuk);
    assertEquals(270, thuk.getHitPoints());
  }
}
