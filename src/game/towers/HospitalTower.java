package game.towers;

import game.enemies.Enemy;
import game.projectiles.VaccinProjectile;

/**
 * Created by johan on 2017-04-10.
 */
public class HospitalTower extends Tower {
	public HospitalTower() {
		super("/towers/hospital.png",1);
		this.cost = 100;
		this.range = 300;
		this.fireDelay = 0.25;
		this.upgradeCost = this.cost;
		this.scaleX = 0.2;
		setDamage(15);
		this.scaleY = 0.2;
	}

	@Override
	public void shoot(Enemy e) {

		shoot(new VaccinProjectile(e, this.dmg));

	}
}
