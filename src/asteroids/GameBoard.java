/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;

import java.util.ArrayList;

/**
 *
 * @author archit08jain
 */
public class GameBoard {
    
    private Spaceship spaceship;
    private ArrayList<Rock> rocks;
    private ArrayList<Bullet> bullets = null;
    private int score = 0;
    
    GameBoard() {
 
       GameObjectFactory factory = GameObjectFactory.getInstance();
       spaceship = (Spaceship) factory.getNewGameObject(GameObjectEnum.SPACESHIP);
       
       for(int i = 0; i<Constants.INITIAL_ROCKS_COUNT; i++) {
           rocks.add((Rock) factory.getNewGameObject(GameObjectEnum.ROCK));
       }
    }
    
    
    
    
}
