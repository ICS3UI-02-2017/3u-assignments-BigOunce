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
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the speed limit");
        int limit = input.nextInt();
        System.out.println("Please enter the recorded speed");
        int speed = input.nextInt();
        
        if (speed < limit){
            System.out.println("you are within the speed limit");
        }
        
        if (speed >= limit + 1 && speed <= limit + 20){
            System.out.println("the fine is 100 dollars");
        }
        
        if (speed >= limit + 21 && speed <= limit + 30){
            System.out.println("the fine is 270 dollars");
        }
        
                if (speed >= limit + 31){
            System.out.println("the fine is 500 dollars");
        }
    }
}
