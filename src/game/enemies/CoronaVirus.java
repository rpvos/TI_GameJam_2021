package game.enemies;

/**
 * Created by johan on 2017-04-10.
 */
public class CoronaVirus extends Enemy {

	public CoronaVirus() {
		super("/enemies/coronaVirus.png");
		this.speed = 100;
		this.maxHealth = 100;
		this.gold = 25;
		this.scaleX = 0.2;
		this.scaleY = 0.2;
	}
}
