package healingTest;

import enemy.Orc;
import healing.Herb;
import org.junit.Before;
import org.junit.Test;
import player.Barbarian;
import weapons.Club;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class HerbTest {

  Herb herb;
  Barbarian conan;
  Club club;
  Sword sword;
  Orc azog;

  @Before
  public void before(){
    herb = new Herb(77);
    club = new Club(30);
    sword = new Sword(25);
    conan = new Barbarian("Conan",100,club);
    azog = new Orc(70);
  }

  @Test
  public void hasHealingEffect(){
    assertEquals(77, herb.getHealingEffect());
  }

  @Test
  public void canHeal(){
    herb.heal(conan);
    assertEquals(177, conan.getHealthPoints());
  }
}
