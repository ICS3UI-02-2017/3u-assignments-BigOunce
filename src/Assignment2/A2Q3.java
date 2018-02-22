/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author Britj5751
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a city
        City jb = new City();
        //create new robot
        RobotSE bg = new RobotSE(jb, 0, 2, Direction.WEST);
        //robot turns around to orient itself facing north
        if(bg.getDirection()==Direction.SOUTH){
            bg.turnAround();}
        if(bg.getDirection()==Direction.EAST){
            bg.turnLeft();}
        if(bg.getDirection()==Direction.WEST){
            bg.turnRight();}
        //if the street number is greater then 0, the robot moves forward
        while(bg.getStreet()>0){
            bg.move();
    }
        //robot turn left 90 degrees
        bg.turnLeft();
        //as long as the avenue is greater than 0, the robot moves forward
        while(bg.getAvenue()>0){
            bg.move();
        }
}
}
