package spellTest;

import enemy.Troll;
import org.junit.Before;
import org.junit.Test;
import spells.LightningBolt;

import static org.junit.Assert.assertEquals;

public class LightningBoltTest {

  LightningBolt lightningBolt;
  Troll thuk;

  @Before
  public void before(){
    lightningBolt = new LightningBolt(40);
    thuk = new Troll(300);
  }

  @Test
  public void haslDamage(){
    assertEquals(40, lightningBolt.getDamage());
  }

  @Test
  public void canCast() {
    lightningBolt.cast(thuk);
    assertEquals(260, thuk.getHitPoints());
  }
}
