package game.towers;

import game.enemies.Enemy;
import game.projectiles.MaskProjectile;
import game.projectiles.VaccinProjectile;

public class MarkRutteTower extends Tower {
    public MarkRutteTower() {
        super("/towers/markRutte.png",1);
        this.cost = 150;
        this.range = 100;
        this.fireDelay = 0.2;
        this.upgradeCost = this.cost;
        this.scaleX = 0.4;
        setDamage(15);
        this.scaleY = 0.4;
    }

    @Override
    public void shoot(Enemy e) {

        shoot(new MaskProjectile(e, this.dmg));

    }
}
