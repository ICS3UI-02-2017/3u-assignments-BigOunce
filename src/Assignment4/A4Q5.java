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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input = new Scanner(System.in);
         
          System.out.print("How much was the first test out of? ");
        double testTotalOne = input.nextInt();
         
          System.out.print("what was your first mark? ");
        double testOneresult = input.nextInt();
        
                  System.out.print("How much was the second test out of? ");
       double testTotalTwo = input.nextInt();
         
          System.out.print("what was your second mark? ");
        double testresultTwo = input.nextInt();
        
                  System.out.print("How much was the third test out of? ");
        double testTotalThree = input.nextInt();
         
          System.out.print("what was your third mark? ");
        double testThreeresult = input.nextInt();
        
                  System.out.print("How much was the fourth test out of? ");
        double testTotalFour = input.nextInt();
         
          System.out.print("what was your fourth mark? ");
        double testFourresult = input.nextInt();
        
                  System.out.print("How much was the final test out of? ");
        double testTotalFive = input.nextInt();
         
          System.out.print("what was your final mark? ");
        double testFiveresult = input.nextInt();
        
        double testOnePercent = testOneresult / testTotalOne * 100;
        System.out.println("your first result was " + testOnePercent + "%");
        
        double testTwoPercent = testresultTwo / testTotalTwo * 100;
        System.out.println("your second result was " + testTwoPercent + "%");
        
        double testThreePercent = testThreeresult / testTotalThree * 100;
        System.out.println("your third result was " + testThreePercent + "%");
        
        double testFourPercent = testFourresult / testTotalFour * 100;
        System.out.println("your fourth result was " + testFourPercent + "%");
        
        double testFivePercent = testFiveresult / testTotalFive * 100;
        System.out.println("your fith result was " + testFivePercent + "%");
        
        double total = testOnePercent + testTwoPercent + testThreePercent + testFourPercent + testFivePercent;
        
        double average = total / 5;
         System.out.println("your average mark was " + average + "%");
              
        

    }
}
