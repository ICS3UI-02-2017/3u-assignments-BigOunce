/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author britj5751
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner input = new Scanner(System.in);
            System.out.println("Please input a length");
            
            double inches = input.nextDouble();
            double cm = 2.54 * inches;
            System.out.println(inches + "inches is the same as" + cm + "cm");
    }
}
