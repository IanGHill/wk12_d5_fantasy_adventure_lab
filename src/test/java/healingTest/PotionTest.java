package healingTest;

import enemy.Orc;
import healing.Potion;
import org.junit.Before;
import org.junit.Test;
import player.Barbarian;
import weapons.Club;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class PotionTest {

  Potion potion;
  Barbarian conan;
  Club club;
  Sword sword;
  Orc azog;

  @Before
  public void before(){
    potion = new Potion(88);
    club = new Club(30);
    sword = new Sword(25);
    conan = new Barbarian("Conan",100,club);
    azog = new Orc(70);
  }

  @Test
  public void hasHealingEffect(){
    assertEquals(88, potion.getHealingEffect());
  }

  @Test
  public void canHeal(){
    potion.heal(conan);
    assertEquals(188, conan.getHealthPoints());
  }
}
