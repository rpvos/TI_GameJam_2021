package game.projectiles;

import game.enemies.Enemy;

public class PillowProjectile extends AreaProjectile{
    public PillowProjectile(double x, double y, int damage) {
        super("/projectiles/pillow.png", x, y, 200);
        speed = 25;
        scaleX = 0.6;
        scaleY = 0.6;
        freezeTime = 0.0;
        dmg = damage;
    }


    public void onHit(Enemy enemy)
    {
        enemy.damage(dmg);
    }

}
