/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author britj5751
 */
public class forLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
         RobotSE bot = new RobotSE(kw, 0, 2, Direction.WEST);
         
         //counted while loop
         int numberOfMoves = 5;
         
         // if there are still moves to do
         while (numberOfMoves >0){
             bot.move();
             numberOfMoves = numberOfMoves - 1;
         }
         bot.turnAround();
         
         numberOfMoves = 0;
         while(numberOfMoves < 5){
             bot.move();
             numberOfMoves = numberOfMoves + 1;
         }
         bot.turnAround();
         // use for loop to move
         for(int count = 0; count < 5; count++){
             bot.move();
}
}
}
