package game.projectiles;

import game.enemies.Enemy;

public class TestProjectile extends DirectProjectile {
    public TestProjectile(Enemy target, int damage) {
        super("/projectiles/coronaTest.png", target);
        speed = 25;
        freezeTime = 0.1;
        scaleX = 0.1;
        scaleY = 0.1;
        dmg = damage;
    }


    public void onHit(Enemy enemy)
    {
        enemy.damage(dmg);
    }


}
