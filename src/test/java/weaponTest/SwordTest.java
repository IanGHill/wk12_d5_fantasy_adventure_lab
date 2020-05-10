package weaponTest;

import org.junit.Before;
import org.junit.Test;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class SwordTest {

  Sword sword;

  @Before
  public void before(){
    sword = new Sword(25);
  }

  @Test
  public void canDealDamage(){
    assertEquals(25, sword.damageValue());
  }
}
