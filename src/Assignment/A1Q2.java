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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create a city
        City jb = new City();
        //create new robot
        RobotSE bg = new RobotSE(jb, 1, 2, Direction.SOUTH);
        //build wall
        new Wall(jb, 1, 2, Direction.NORTH);
        //build wall
        new Wall(jb, 1, 2, Direction.EAST);
        //build wall
        new Wall(jb, 2, 2, Direction.NORTH);
       //build wall
        new Wall(jb, 2, 1, Direction.WEST);
        //build wall
        new Wall(jb, 2, 1, Direction.SOUTH);
        //build wall
        new Wall(jb, 1, 1, Direction.WEST);
        //build wall
        new Wall(jb, 1, 1, Direction.NORTH);
        //add newspaper
        new Thing(jb, 2, 2, Direction.NORTH);
        //turn karen right 90 degrees
        bg.turnRight();
        //move karen 1 space
        bg.move();
        //turn karen left 90 degrees
        bg.turnLeft();
        //move karen 1 space
        bg.move();
        //turn karen left 90 degrees
        bg.turnLeft();
        //move karen 1 space
        bg.move();
        //make karen pick up newspaper
        bg.pickThing();
        //turn karen around
        bg.turnAround();
        //move karen 1 space
        bg.move();
        //turn karen right 90 degrees
        bg.turnRight();
        //move karen 1 space
        bg.move();
        //turn karen right 90 degrees
        bg.turnRight();
        //move karen 1 space
        bg.move();
        //turn karen right 90 degrees
        bg.turnRight();
       
    }
}
