package enemyTest;

import enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

  Troll thuk;

  @Before
  public void before(){
    thuk = new Troll(300);
  }

  @Test
  public void canGetHitPoints(){
    assertEquals(300, thuk.getHitPoints());
  }

  @Test
  public void canTakeDamage(){
    thuk.takeDamage(30);
    assertEquals(270, thuk.getHitPoints());
  }

}
