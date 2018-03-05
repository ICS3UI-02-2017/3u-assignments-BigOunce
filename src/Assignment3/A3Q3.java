/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author britj5751
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             //Create a city
        City jb = new City();
        //create new robot
   RobotSE karel = new RobotSE(jb, 1, 1, Direction.EAST, 50);
   
   int moveCount = 4;

   
   while(moveCount > 0){
       karel.putThing();
       karel.move();
       karel.putThing();
       moveCount -=1;
   }
   karel.turnRight();
   karel.move();
   karel.turnRight();
   
 moveCount = 4;
 
    while(moveCount > 0){
       karel.putThing();
       karel.move();
       karel.putThing();
       moveCount -=1;
       
    }
    karel.turnLeft();
    karel.move();
    karel.turnLeft();
    
 moveCount = 4;
 
    while(moveCount > 0){
       karel.putThing();
       karel.move();
       karel.putThing();
       moveCount -=1;
       
    }
   karel.turnRight();
   karel.move();
   karel.turnRight();
   
    moveCount = 4;
 
    while(moveCount > 0){
       karel.putThing();
       karel.move();
       karel.putThing();
       moveCount -=1;
   
}
        karel.turnLeft();
    karel.move();
    karel.turnLeft();
    
}
}