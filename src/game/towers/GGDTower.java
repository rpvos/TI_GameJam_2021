package game.towers;

import game.enemies.Enemy;
import game.projectiles.BombProjectile;
import game.projectiles.TestProjectile;
import game.projectiles.VaccinProjectile;

public class GGDTower extends Tower{
    public GGDTower() {
        super("/towers/ggd.png",1);
        this.cost = 50;
        this.range = 300;
        this.fireDelay = 0.5;
        scaleX = 0.2;
        this.setDamage(10);
        scaleY = 0.2;
        this.upgradeCost = this.cost;
    }

    @Override
    public void shoot(Enemy e) {
        shoot(new TestProjectile(e, this.dmg));
    }
}