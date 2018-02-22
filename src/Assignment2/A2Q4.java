/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author Britj5751
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a city
        City jb = new City();
        //create new robot
        RobotSE bg = new RobotSE(jb, 0, 0, Direction.EAST);
        //build tower
        new Wall(jb, 1, 1, Direction.WEST);
        new Wall(jb, 1, 1, Direction.EAST);
        new Wall(jb, 1, 1, Direction.SOUTH);
        new Wall(jb, 1, 1, Direction.NORTH);
        //build tower
        new Wall(jb, 1, 4, Direction.NORTH);
        new Wall(jb, 1, 4, Direction.EAST);
        new Wall(jb, 1, 4, Direction.SOUTH);
        new Wall(jb, 1, 4, Direction.WEST);
        //build tower
        new Wall(jb, 4, 1, Direction.NORTH);
        new Wall(jb, 4, 1, Direction.EAST);
        new Wall(jb, 4, 1, Direction.SOUTH);
        new Wall(jb, 4, 1, Direction.WEST);
        //build tower
        new Wall(jb, 4, 4, Direction.NORTH);
        new Wall(jb, 4, 4, Direction.EAST);
        new Wall(jb, 4, 4, Direction.SOUTH);
        new Wall(jb, 4, 4, Direction.WEST);
        
            //build castle
        new Wall(jb, 2, 2, Direction.WEST);
        new Wall(jb, 2, 2, Direction.NORTH);
        new Wall(jb, 2, 3, Direction.NORTH);
        new Wall(jb, 2, 3, Direction.EAST);
        new Wall(jb, 3, 3, Direction.EAST);
        new Wall(jb, 3, 3, Direction.SOUTH);
        new Wall(jb, 3, 2, Direction.SOUTH);
        new Wall(jb, 3, 2, Direction.WEST);
        //infinite loop
        while(true){
            //follow the walls of the castle
            bg.move(2);
            bg.turnRight();
            bg.move();
            bg.turnLeft();
            bg.move();
            bg.turnLeft();
            bg.move();
            bg.turnRight();
            bg.move(2);
            bg.turnRight();
        }
    }
}
