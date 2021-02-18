package game.powerups;

import game.towers.Tower;
import java.util.ArrayList;

public class CritPowerUp extends PowerUp {

    public CritPowerUp()
    {
        super("/powerups/time.png", 10, 250, 100, 100);
        this.rechargeTime = 15;
        this.activeTime = 3;
        this.button.setRound();
    }

    @Override
    public void effect()
    {
        this.game.GetEnemies().clear();
    }

}
