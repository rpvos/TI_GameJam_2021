package game.level;

import java.util.ArrayList;

/**
 * Abstract level container
 */
public abstract class Level{

	public int levelNumber;
	public String map;
	public ArrayList<Wave> waves = new ArrayList<>();
	public int startingGold = 100;
	public int lives = 5;

	Level(int levelNumber)
	{
		this.levelNumber = levelNumber;
	}


}
