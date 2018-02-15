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
public class conditionsexample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City northkorea = new City();
        
        RobotSE kim = new RobotSE(northkorea, 2, 1, Direction.EAST);
        
        new Wall(northkorea, 2, 5, Direction.EAST);
        new Wall(northkorea, 5, 5, Direction.SOUTH);
        new Wall(northkorea, 5, 1, Direction.WEST);
        new Wall(northkorea, 2, 1, Direction.NORTH);
       
        while(true){
        while(kim.frontIsClear()){
        kim.move();}
        if(!kim.frontIsClear()){
            kim.turnRight();}
    }
        }
        
        
    }

