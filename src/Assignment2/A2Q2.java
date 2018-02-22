/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author Britj5751
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Create a city
        City jb = new City();
        //create new robot
        RobotSE bg = new RobotSE(jb, 3, 1, Direction.EAST);
        //add 9 walls
        new Wall(jb, 3, 1, Direction.SOUTH);
        new Wall(jb, 3, 2, Direction.SOUTH);
        new Wall(jb, 3, 3, Direction.SOUTH);
        new Wall(jb, 3, 4, Direction.SOUTH);
        new Wall(jb, 3, 5, Direction.SOUTH);
        new Wall(jb, 3, 6, Direction.SOUTH);
        new Wall(jb, 3, 7, Direction.SOUTH);
        new Wall(jb, 3, 8, Direction.SOUTH);
        new Wall(jb, 3, 9, Direction.SOUTH);
        //add 4 hurdles
        new Wall(jb, 3, 1, Direction.EAST);
        new Wall(jb, 3, 2, Direction.EAST);
        new Wall(jb, 3, 4, Direction.EAST);
        new Wall(jb, 3, 7, Direction.EAST);
        //add finish line
        new Thing(jb, 3, 9, Direction.NORTH);
        //while robot cannot pick something up
        while(!bg.canPickThing()){
            // if the robot is not facing a wall
        if(!bg.frontIsClear()){
            // robot turn left
            bg.turnLeft();
            //robot move 1 space forward
            bg.move();
            //robot turn right 90 degrees
            bg.turnRight();
            bg.move();
            bg.turnRight();
            bg.move();
            bg.turnLeft();
        }else bg.move();
            
        
    }
        
}
}
