/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author britj5751
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Create a city
        City jb = new City();
        //create new robot
        RobotSE bg = new RobotSE(jb, 0, 2, Direction.WEST);
    }
}
