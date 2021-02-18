package game.towers;

import game.enemies.Enemy;
import game.projectiles.PillowProjectile;

public class BedTower extends Tower {
    public BedTower() {
        super("/towers/bed.png",1);
        this.cost = 50;
        this.range = 300;
        this.fireDelay = 2;
        scaleX = 0.2;
        setDamage(50);
        scaleY = 0.2;
        this.upgradeCost = this.cost;
    }

    @Override
    public void shoot(Enemy e) {
        //e.damage(10);
        shoot(new PillowProjectile(e.x, e.y, this.dmg));
    }
}
