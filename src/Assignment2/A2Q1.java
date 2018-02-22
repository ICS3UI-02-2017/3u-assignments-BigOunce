/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author britj5751
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //Create a city
        City jb = new City();
        //create new robot
        RobotSE bg = new RobotSE(jb, 1, 1, Direction.EAST);
        //build wall
        
        new Thing(jb, 1, 2, Direction.NORTH);
        new Thing(jb, 1, 3, Direction.NORTH);
        new Thing(jb, 1, 4, Direction.NORTH);
        new Thing(jb, 1, 5, Direction.NORTH);
        new Thing(jb, 1, 6, Direction.NORTH);
        new Thing(jb, 1, 7, Direction.NORTH);
        new Thing(jb, 1, 8, Direction.NORTH);
        new Thing(jb, 1, 9, Direction.NORTH);
        new Thing(jb, 1, 10, Direction.NORTH);
        new Thing(jb, 1, 11, Direction.NORTH);
        
        
        while(bg.countThingsInBackpack()<7){
            bg.move();
            bg.pickThing();
        }
            
            bg.move(4);
            
           
       
        
        }
        
        
        }
        
      
    
        



       
        
    

