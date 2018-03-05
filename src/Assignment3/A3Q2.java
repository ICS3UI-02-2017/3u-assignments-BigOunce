/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author britj5751
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a city
        City jb = new City();
        //create new robot
        RobotSE bg = new RobotSE(jb, 0, 0, Direction.EAST);
        new Thing(jb, 0, 0, Direction.NORTH);
        new Thing(jb, 0, 0, Direction.NORTH);
        new Thing(jb, 0, 0, Direction.NORTH);
        new Thing(jb, 0, 0, Direction.NORTH);
        new Thing(jb, 0, 0, Direction.NORTH);
        new Thing(jb, 0, 0, Direction.NORTH);
        new Thing(jb, 0, 0, Direction.NORTH);
        new Thing(jb, 0, 0, Direction.NORTH);
        new Thing(jb, 0, 0, Direction.NORTH);
        new Thing(jb, 0, 0, Direction.NORTH);
        
        int numberOfMoves = 10;
        while(numberOfMoves > 0){
            bg.pickThing();
            bg.move();
            bg.putThing();
            bg.turnAround();
            bg.move();
            bg.turnAround();
            
            numberOfMoves -=1;
        }
        bg.move();
        }
        
        
    }

