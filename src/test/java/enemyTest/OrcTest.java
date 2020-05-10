package enemyTest;

import enemy.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

  Orc azog;

  @Before
  public void before(){
    azog = new Orc(70);
  }

  @Test
  public void canGetHitPoints(){
    assertEquals(70, azog.getHitPoints());
  }

  @Test
  public void canTakeDamage(){
    azog.takeDamage(30);
    assertEquals(40, azog.getHitPoints());
  }

}
