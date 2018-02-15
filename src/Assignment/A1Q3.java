/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author britj5751
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a city
        City jb = new City();
        //create new robot
        RobotSE bg = new RobotSE(jb, 3, 0, Direction.EAST);
        //build mountain from walls
        new Wall(jb, 1, 3, Direction.NORTH);
        new Wall(jb, 1, 3, Direction.WEST);
        new Wall(jb, 1, 3, Direction.EAST);
        new Wall(jb, 2, 3, Direction.WEST);
        new Wall(jb, 3, 2, Direction.NORTH);
        new Wall(jb, 2, 3, Direction.WEST);
        new Wall(jb, 3, 2, Direction.WEST);
        new Wall(jb, 2, 4, Direction.NORTH);
        new Wall(jb, 2, 4, Direction.EAST);
        new Wall(jb, 3, 4, Direction.EAST);
        new Thing(jb, 3, 1, Direction.NORTH);
        //make robot pick up flag, scale mountain, place flag and climb down
        bg.move();
        bg.pickThing();
        bg.turnLeft();
        bg.move();
        bg.turnRight();
        bg.move();
        bg.turnLeft();
        bg.move(2);
        bg.turnRight();
        bg.move();
        bg.putThing();
        bg.move();
        bg.turnRight();
        bg.move();
        bg.turnLeft();
        bg.move();
        bg.turnRight();
        bg.move(2);
        bg.turnLeft();
        
    }
}
