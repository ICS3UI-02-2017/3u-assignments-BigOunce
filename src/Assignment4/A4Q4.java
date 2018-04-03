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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("How much does the food for prom cost? ");
        int food = input.nextInt();
        
            System.out.print("How much does the DJ for prom cost? ");
        int DJ = input.nextInt();
        
            System.out.print("How much does it cost to rent the hall? ");
        int rent = input.nextInt();
        
            System.out.print("How much do the decorations cost? ");
        int decorations = input.nextInt();
        
            System.out.print("How much does it cost for staff? ");
        int staff = input.nextInt();
        
            System.out.print("How much for misc costs? ");
        int misc = input.nextInt();
        
        int total = misc + staff + decorations + rent + DJ + food;
        
        
        int tickets = total / 35;
        System.out.print("your total is " + total + " you must sell " + tickets);
        System.out.println("to break even.");
    }
}
