/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author britj5751
 */
public class RobotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //
        City jb = new City();
        
        //put robot in city
        RobotSE bigounce = new RobotSE(jb, 1, 1, Direction.EAST);
        
        bigounce.setColor(Color.blue);
        
        new Wall(jb, 6, 7, Direction.NORTH);
        new Wall(jb, 6, 8, Direction.NORTH);
        new Wall(jb, 6, 9, Direction.NORTH);
        new Wall(jb, 6, 10, Direction.NORTH);
        new Wall(jb, 6, 11, Direction.NORTH);
    }
}
