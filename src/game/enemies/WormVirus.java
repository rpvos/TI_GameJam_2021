package game.enemies;

public class WormVirus extends Enemy{
    public WormVirus() {
        super("/enemies/worm.png");
        this.speed = 100;
        this.maxHealth = 100;
        this.gold = 25;
        this.scaleX = 0.2;
        this.scaleY = 0.2;
    }
}
