package creatureTest;

import defence.Dragon;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

  Dragon dragon;
  Troll thuk;

  @Before
  public void before(){
    dragon = new Dragon(100);
    thuk = new Troll (300);
  }
  @Test
  public void hasDamage(){
    assertEquals(100, dragon.getDamage());
  }

  @Test
  public void canDefend(){
    dragon.defend(thuk);
    assertEquals(200, thuk.getHitPoints());
  }

}
