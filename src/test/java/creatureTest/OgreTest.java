package creatureTest;

import defence.Ogre;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {

  Ogre ogre;
  Troll thuk;

  @Before
  public void before(){
    ogre = new Ogre(50);
    thuk = new Troll (300);
  }
  @Test
  public void hasDamage(){
    assertEquals(50, ogre.getDamage());
  }

  @Test
  public void canDefend(){
    ogre.defend(thuk);
    assertEquals(250, thuk.getHitPoints());
  }

}
