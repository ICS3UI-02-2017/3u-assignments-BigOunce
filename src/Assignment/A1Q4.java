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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a city
        City jb = new City();
        //create new robot
        RobotSE bg = new RobotSE(jb, 0, 0, Direction.SOUTH);
        //create new robot
        RobotSE gb = new RobotSE(jb, 0, 1, Direction.SOUTH);
        //build wall
        new Wall(jb, 0, 1, Direction.WEST);
        //build wall
        new Wall(jb, 1, 1, Direction.WEST);
        //build wall
        new Wall(jb, 1, 1, Direction.SOUTH);
        
        bg.move();
        gb.move();
        bg.move();
        gb.turnLeft();
        bg.turnLeft();
        gb.move();
        bg.move();
        gb.turnRight();
        gb.move();
        gb.turnRight();
        gb.move();
        
    }
}
