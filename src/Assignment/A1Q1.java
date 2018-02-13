/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author britj5751
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create a city
        City jb = new City();
        //create new robot
        RobotSE bg = new RobotSE(jb, 0, 2, Direction.WEST);
        //build wall
        new Wall(jb, 1, 2, Direction.NORTH);
        //build wall
        new Wall(jb, 1, 2, Direction.EAST);
        //build wall
        new Wall(jb, 2, 2, Direction.EAST);
        //build wall
        new Wall(jb, 2, 2, Direction.SOUTH);
        //build wall
        new Wall(jb, 2, 1, Direction.WEST);
        //build wall
        new Wall(jb, 2, 1, Direction.SOUTH);
        //build wall
        new Wall(jb, 1, 1, Direction.WEST);
        //build wall
        new Wall(jb, 1, 1, Direction.NORTH);
        //travel forward 2 spaces
        bg.move(2);
        //turn left 90 degrees
        bg.turnLeft();
        //travel forward 3 spaces
        bg.move(3);
        //turn left 90 degrees
        bg.turnLeft();
        //travel forward 3 spaces
        bg.move(3);
        //turn left 90 degrees
        bg.turnLeft();
        //travel forward 3 spaces
        bg.move(3);
        //turn left 90 degrees
        bg.turnLeft();
        //travel forward 1 spaces
        bg.move(1);
    }
}
