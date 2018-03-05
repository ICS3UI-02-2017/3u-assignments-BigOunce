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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                 //Create a city
        City jb = new City();
        //create new robot
        RobotSE bg = new RobotSE(jb, 3, 3, Direction.SOUTH);
        
         new Wall(jb, 1, 1, Direction.NORTH);
         new Wall(jb, 1, 1, Direction.WEST);
         new Wall(jb, 2, 1, Direction.SOUTH);
         new Wall(jb, 2, 1, Direction.WEST);
         new Wall(jb, 2, 2, Direction.SOUTH);
         new Wall(jb, 2, 2, Direction.EAST);
         new Wall(jb, 1, 2, Direction.NORTH);
         new Wall(jb, 1, 2, Direction.EAST);
         new Wall(jb, 1, 4, Direction.NORTH);
         new Wall(jb, 1, 4, Direction.WEST);
         new Wall(jb, 2, 4, Direction.SOUTH);
         new Wall(jb, 2, 4, Direction.WEST);
         new Wall(jb, 2, 5, Direction.SOUTH);
         new Wall(jb, 2, 5, Direction.EAST);
         new Wall(jb, 1, 5, Direction.NORTH);
         new Wall(jb, 1, 5, Direction.EAST);
         
         new Wall(jb, 4, 1, Direction.NORTH);
         new Wall(jb, 4, 1, Direction.WEST);
         new Wall(jb, 5, 1, Direction.SOUTH);
         new Wall(jb, 5, 1, Direction.WEST);
         new Wall(jb, 5, 2, Direction.SOUTH);
         new Wall(jb, 5, 2, Direction.EAST);
         new Wall(jb, 4, 2, Direction.NORTH);
         new Wall(jb, 4, 2, Direction.EAST);
         new Wall(jb, 4, 4, Direction.NORTH);
         new Wall(jb, 4, 4, Direction.WEST);
         new Wall(jb, 5, 4, Direction.SOUTH);
         new Wall(jb, 5, 4, Direction.WEST);
         new Wall(jb, 5, 5, Direction.SOUTH);
         new Wall(jb, 5, 5, Direction.EAST);
         new Wall(jb, 4, 5, Direction.NORTH);
         new Wall(jb, 4, 5, Direction.EAST);
         
         for(int numberOfMoves =4; numberOfMoves >0; numberOfMoves--){
             for(int loop = 3; loop >0; loop--){
                 bg.move(3);
                 bg.turnLeft();
             
             }
          bg.move(3);
        
    }
}
}
