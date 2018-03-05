/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author britj5751
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //Create a city
        City jb = new City();
        //create new robot
        RobotSE bg = new RobotSE(jb, 0, 2, Direction.WEST);
        
         new Wall(jb, 1, 1, Direction.NORTH);
         new Wall(jb, 1, 1, Direction.WEST);
         new Wall(jb, 2, 1, Direction.SOUTH);
         new Wall(jb, 2, 1, Direction.WEST);
         new Wall(jb, 2, 2, Direction.SOUTH);
         new Wall(jb, 2, 2, Direction.EAST);
         new Wall(jb, 1, 2, Direction.NORTH);
         new Wall(jb, 1, 2, Direction.EAST);
         bg.move(2);
         for(int count = 0; count < 7; count++){
            
             bg.turnLeft();
             bg.move(3);
             
         }
  bg.turnLeft();
    }
}