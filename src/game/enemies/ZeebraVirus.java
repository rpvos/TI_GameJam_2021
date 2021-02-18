package game.enemies;

public class ZeebraVirus extends Enemy {

    public ZeebraVirus(){
        super("/enemies/ZeebraVirus.png");
        this.speed = 200;
        this.maxHealth = 10;
        this.health = 10;
        this.gold = 25;
        this.scaleX = 0.2;
        this.scaleY = 0.2;
    }

}
