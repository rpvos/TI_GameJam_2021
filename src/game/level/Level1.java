package game.level;

import game.enemies.CoronaVirus;
import game.enemies.LoveVirus;
import game.enemies.WormVirus;
import game.enemies.ZeebraVirus;

/**
 * Created by johan on 2017-04-10.
 */
public class Level1 extends Level {

    public Level1() {
        super(1);

        map = "map1.json";


        //todo add other virussus
        waves.add(new Wave(1, 10, ZeebraVirus.class));
        waves.add(new Wave(0.25f, 10, LoveVirus.class));
        waves.add(new Wave(0.1f, 100, ZeebraVirus.class));

        waves.add(new Wave(1, 5, CoronaVirus.class));
        waves.add(new Wave(0.25f, 20, LoveVirus.class));
        waves.add(new Wave(0.1f, 10, CoronaVirus.class));

    }
}
