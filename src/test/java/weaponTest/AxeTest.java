package weaponTest;

import org.junit.Before;
import org.junit.Test;
import weapons.Axe;

import static org.junit.Assert.assertEquals;

public class AxeTest {

  Axe axe;

  @Before
  public void before(){
    axe = new Axe(20);
  }

  @Test
  public void canDealDamage(){
    assertEquals(20, axe.damageValue());
  }
}
