package enemy;

public class Enemy {

  private int hitPoints;

  public Enemy(int hitPoints) {
    this.hitPoints = hitPoints;
  }

  public int getHitPoints() {
    return hitPoints;
  }

  public void takeDamage(int damage){
    this.hitPoints -= damage;
  }
}
