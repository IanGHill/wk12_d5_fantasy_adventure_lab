package playerTest;

import enemy.Orc;
import org.junit.Before;
import org.junit.Test;
import player.Barbarian;
import weapons.Club;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

  Barbarian conan;
  Club club;
  Sword sword;
  Orc azog;

  @Before
  public void before(){
    club = new Club(30);
    sword = new Sword(25);
    conan = new Barbarian("Conan",100,club);
    azog = new Orc(70);
  }

  @Test
  public void hasName() {
    assertEquals("Conan", conan.getName());
  }
    @Test
      public void hasHealthPoints(){
      assertEquals(100, conan.getHealthPoints());
    }

    @Test
  public void hasWeapon(){
    assertEquals(club, conan.getWeapon());
    }

    @Test
  public void canSwitchWeapon(){
    conan.switchWeapon(sword);
    assertEquals(sword, conan.getWeapon());
    }

    @Test
  public void canAttackEnemy(){
    conan.attack(azog);
    assertEquals(40, azog.getHitPoints());
    }



}
