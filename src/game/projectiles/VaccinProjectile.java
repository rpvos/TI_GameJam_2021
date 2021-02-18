package game.projectiles;

import game.enemies.Enemy;

/**
 * Created by johan on 11-4-2017.
 */
public class VaccinProjectile extends DirectProjectile {
	public VaccinProjectile(Enemy target, int damage) {
		super("/projectiles/vaccin.png", target);
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
