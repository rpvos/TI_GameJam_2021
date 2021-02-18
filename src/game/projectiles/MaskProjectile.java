package game.projectiles;

import game.enemies.Enemy;

public class MaskProjectile extends DirectProjectile{
    public MaskProjectile(Enemy target, int damage) {
        super("/projectiles/mask.png", target);
        speed = 25;
        freezeTime = 0.1;
        scaleX = 0.2;
        scaleY = 0.2;

        dmg = damage;
    }

    public void onHit(Enemy enemy)
    {
        enemy.damage(dmg);
    }
}
