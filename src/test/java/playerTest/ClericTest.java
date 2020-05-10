package playerTest;

import enemy.Orc;
import healing.Herb;
import healing.Potion;
import org.junit.Before;
import org.junit.Test;
import player.Barbarian;
import player.Cleric;
import weapons.Club;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class ClericTest {

  Potion potion;
  Herb herb;
  Barbarian conan;
  Club club;
  Sword sword;
  Orc azog;
  Cleric cleric;

  @Before
  public void before(){
    potion = new Potion(88);
    herb = new Herb(77);
    club = new Club(30);
    sword = new Sword(25);
    conan = new Barbarian("Conan",100,club);
    azog = new Orc(70);
    cleric = new Cleric("Albus",350,potion);
  }

  @Test
  public void hasName(){
    assertEquals("Albus", cleric.getName());
  }

  @Test
  public void hasHealthPoints(){
    assertEquals(350, cleric.getHealthPoints());
  }

  @Test
  public void hasHealingItem(){
    assertEquals(potion, cleric.getHealingItem());
  }

  @Test
  public void canSwitchHealingIItem(){
    cleric.switchHealingItem(herb);
    assertEquals(herb, cleric.getHealingItem());
  }
  @Test
  public void canHealPlayer(){
    cleric.healPlayer(conan);
    assertEquals(188, conan.getHealthPoints());
  }
}
