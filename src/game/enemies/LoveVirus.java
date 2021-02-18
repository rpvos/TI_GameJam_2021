package game.enemies;

public class LoveVirus extends Enemy {
    public LoveVirus() {
        super("/enemies/LoveVirus.png");
        this.speed = 100;
        this.maxHealth = 15;
        this.health = 15;
        this.gold = 25;
        this.scaleX = 0.2;
        this.scaleY = 0.2;
    }
}
