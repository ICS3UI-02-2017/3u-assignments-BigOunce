/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author britj5751
 */
public class InputandOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("hello World");
        System.out.println("another line");
  //special Characters
        //quotation marks
        System.out.println("\"");
        
        //use a scanner
        Scanner input = new Scanner(System.in);
        
        String name = input.nextLine();
  
    }
}
