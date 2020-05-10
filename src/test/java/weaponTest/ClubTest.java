package weaponTest;

import org.junit.Before;
import org.junit.Test;
import weapons.Club;

import static org.junit.Assert.assertEquals;

public class ClubTest {

  Club club;

  @Before
  public void before(){
    club = new Club(30);
  }

  @Test
  public void canDealDamage(){
    assertEquals(30, club.damageValue());
  }
}
