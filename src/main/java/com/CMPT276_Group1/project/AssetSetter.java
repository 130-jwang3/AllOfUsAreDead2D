package com.CMPT276_Group1.project;

import com.CMPT276_Group1.project.entity.Zombie;
import com.CMPT276_Group1.project.object.*;

public class AssetSetter {
    GamePanel gamePanel;

    public AssetSetter(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    public void setObject(){
        //Creating regular rewards (students) which must be collected to complete the game
        gamePanel.obj[0]=new RegularReward(gamePanel);
        gamePanel.obj[0].x=gamePanel.tileSize;
        gamePanel.obj[0].y=14*gamePanel.tileSize;
        gamePanel.obj[1]=new RegularReward(gamePanel);
        gamePanel.obj[1].x= 10*gamePanel.tileSize;
        gamePanel.obj[1].y=2*gamePanel.tileSize;
        gamePanel.obj[2]=new RegularReward(gamePanel);
        gamePanel.obj[2].x=5*gamePanel.tileSize;
        gamePanel.obj[2].y=7*gamePanel.tileSize;

        gamePanel.obj[3]=new SpecialReward(gamePanel);
        gamePanel.obj[3].x=13*gamePanel.tileSize;
        gamePanel.obj[3].y=3*gamePanel.tileSize;
        gamePanel.obj[4]=new SpecialReward(gamePanel);
        gamePanel.obj[4].x=8*gamePanel.tileSize;
        gamePanel.obj[4].y=1*gamePanel.tileSize;

        gamePanel.obj[5]=new Exit(gamePanel);
        gamePanel.obj[5].x=19*gamePanel.tileSize;
        gamePanel.obj[5].y=14*gamePanel.tileSize;
        gamePanel.obj[5].collision=true;
    }
    public void setTrap(){
        gamePanel.traps[0] = new Trap(gamePanel);
        gamePanel.traps[0].x=6*gamePanel.tileSize;
        gamePanel.traps[0].y=7*gamePanel.tileSize;
        gamePanel.traps[1] = new Trap(gamePanel);
        gamePanel.traps[1].x=11*gamePanel.tileSize;
        gamePanel.traps[1].y=12*gamePanel.tileSize;
        gamePanel.traps[2] = new Trap(gamePanel);
        gamePanel.traps[2].x=13*gamePanel.tileSize;
        gamePanel.traps[2].y=5*gamePanel.tileSize;
        gamePanel.traps[3] = new Trap(gamePanel);
        gamePanel.traps[3].x=4*gamePanel.tileSize;
        gamePanel.traps[3].y=9*gamePanel.tileSize;
        gamePanel.traps[4] = new Trap(gamePanel);
        gamePanel.traps[4].x=17*gamePanel.tileSize;
        gamePanel.traps[4].y=12*gamePanel.tileSize;
    }

    public void setZombie(){
        gamePanel.zombies[0]=new Zombie(gamePanel);
        gamePanel.zombies[0].x=14*gamePanel.tileSize;
        gamePanel.zombies[0].y=3*gamePanel.tileSize;
        gamePanel.zombies[0].direction="down";

        gamePanel.zombies[1]=new Zombie(gamePanel);
        gamePanel.zombies[1].x=8*gamePanel.tileSize;
        gamePanel.zombies[1].y=7*gamePanel.tileSize;
        gamePanel.zombies[1].direction="down";
    }
}
