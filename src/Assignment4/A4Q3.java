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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner input = new Scanner(System.in);
            
            System.out.println("Please give me a number");
        // make a String to store a name
        String One = input.nextLine();
        
        System.out.println("Please give me another number");
        // make a String to store a name
        String Two = input.nextLine();
        
        System.out.println("Please give me a  third number");
        // make a String to store a name
        String Three = input.nextLine();
        
        System.out.println("Please give me one more number");
        // make a String to store a name
        String Four = input.nextLine();
        
        System.out.println("Your numbers were" + One + "," + Two + "," + Three + "and" + Four + ".");
    }
}
