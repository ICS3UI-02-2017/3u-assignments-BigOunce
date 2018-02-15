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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          //Create a city
        City jb = new City();
        //create new robot
        RobotSE bg = new RobotSE(jb, 0, 1, Direction.WEST);
        //create new robot
        RobotSE gb = new RobotSE(jb, 3, 3, Direction.EAST);
        //build wall
        new Thing(jb, 0, 0, Direction.NORTH);
        new Thing(jb, 1, 0, Direction.NORTH);
        new Thing(jb, 1, 1, Direction.NORTH);
        new Thing(jb, 1, 2, Direction.NORTH);
        new Thing(jb, 2, 2, Direction.NORTH);
        new Wall(jb, 2, 3, Direction.NORTH);
        new Wall(jb, 2, 3, Direction.WEST);
        new Wall(jb, 2, 3, Direction.EAST);
        new Wall(jb, 3, 3, Direction.EAST);
        new Wall(jb, 3, 3, Direction.SOUTH);
        bg.setLabel("M");
        gb.setLabel("K");
        gb.turnAround();
        bg.move();
        gb.move();
        bg.turnLeft();
        bg.pickAllThings();
        gb.pickAllThings();
        gb.turnRight();
        gb.move();
        bg.move();
        gb.pickThing();
        bg.pickThing();
        bg.turnLeft();
        gb.move();
        bg.move();
        gb.pickThing();
        bg.pickThing();
        gb.turnLeft();
        
        
        
    }
}
