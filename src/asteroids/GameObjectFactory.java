/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;

/**
 *
 * @author archit08jain
 */
public class GameObjectFactory {
   
    private GameObjects gameObject;
    private static GameObjectFactory gameObjectFactory= new GameObjectFactory();
    
    //singelton + factory pattern
    private GameObjectFactory(){};
    
    public static GameObjectFactory getInstance() {
        return gameObjectFactory;
    }
    
    public GameObjects getNewGameObject(GameObjectEnum type) {
        
        switch (type) {
            
            case SPACESHIP:
                //instantiate game object to a new spaceship
                break;
            case ROCK:
                //instantiate game object to a new rock
                break;
            case UFO:
                //instantiate game object to a new UFO
                break;
            case BULLET:
                //instantiate game object to a new bullet
                break;
        }
        
        return gameObject;
    }
        
}
