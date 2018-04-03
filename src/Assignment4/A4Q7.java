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
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          Scanner input = new Scanner(System.in);
          
           int restingPlace = 1;
           while (restingPlace < 100){
               System.out.println("Please enter the number you rolled");
               int roll = input.nextInt();
               if (roll < 2 || roll > 12) {
                   System.out.println("you quit");
                   System.exit(roll);
               }else {
                   restingPlace = roll + restingPlace;
                   
                   //add snakes
                   
                   if (restingPlace == 54) {
                       restingPlace = 19 ; 
                   }
                  if (restingPlace == 90) {
                    restingPlace = 48 ; 
                   }
                  if (restingPlace == 98) {
                    restingPlace = 77 ; 
                   }
                  
                  //add ladders
                   if (restingPlace == 9) {
                       restingPlace = 34 ; 
                   }
                   if (restingPlace == 40) {
                       restingPlace = 64 ; 
                   }
                  if (restingPlace == 54) {
                       restingPlace = 19 ; 
                   }
                       if (restingPlace  > 100) {
                       restingPlace = restingPlace - roll;
                   }
                       System.out.println("you are on square" + restingPlace);
                       if (restingPlace == 100) {
                           System.out.println("you win");
                               
                  
                   }
               }
               } 
           
           
           }
    
    
    }



