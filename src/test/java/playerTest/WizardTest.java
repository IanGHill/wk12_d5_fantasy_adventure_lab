package playerTest;

import defence.Dragon;
import defence.Ogre;
import enemy.Troll;
import org.junit.Before;
import org.junit.Test;
import player.Wizard;
import spells.Fireball;
import spells.LightningBolt;

import static org.junit.Assert.assertEquals;

public class WizardTest {

  Wizard wizard;
  Dragon dragon;
  Ogre ogre;
  Troll thuk;
  Fireball fireball;
  LightningBolt lightningBolt;

  @Before
  public void before(){
    dragon = new Dragon(100);
    ogre = new Ogre(50);
    fireball = new Fireball(50);
    lightningBolt = new LightningBolt(60);
    thuk = new Troll(300);
    wizard = new Wizard("Gandalf", 500, ogre, fireball);
  }

  @Test
  public void hasName(){
    assertEquals("Gandalf", wizard.getName());
  }

  @Test
  public void hasHitPoints(){
    assertEquals(500, wizard.getHealthPoints());
  }

  @Test
  public void hasSpell(){
    assertEquals(fireball, wizard.getSpell());
  }

  @Test
  public void hasDefender(){
    assertEquals(ogre, wizard.getDefender());
  }

  @Test
  public void canSwitchSpell(){
    wizard.switchSpell(lightningBolt);
    assertEquals(lightningBolt, wizard.getSpell());
  }

  @Test
  public void canSwitchDefender(){
    wizard.switchDefender(dragon);
    assertEquals(dragon, wizard.getDefender());
  }
}
