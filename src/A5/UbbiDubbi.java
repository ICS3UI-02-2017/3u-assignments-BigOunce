/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A5;

import java.util.Scanner;

/**
 *
 * @author britj5751
 */
public class UbbiDubbi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic heregay

        Scanner input = new Scanner(System.in);
        //infinite repeat
        while (true) {
            // get the word to be translated
            System.out.println("Enter a word into the translator");
            String englishWord = input.nextLine();


            englishWord = englishWord.toLowerCase();


            int length = englishWord.length();

            String transWord = "";

            int i = 0;

            if (englishWord.startsWith("a") || englishWord.startsWith("e") || englishWord.startsWith("i") || englishWord.startsWith("o") || englishWord.startsWith("u")) {

                transWord = "ub" + englishWord.charAt(i) + transWord;
                i += 1;


                for (i = i; i < length; i++) {
                    if (englishWord.charAt(i) == 'a' || englishWord.charAt(i) == 'e' || englishWord.charAt(i) == 'i' || englishWord.charAt(i) == 'o' || englishWord.charAt(i) == 'u') {
                        if (englishWord.charAt(i - 1) == 'a' || englishWord.charAt(i - 1) == 'e' || englishWord.charAt(i - 1) == 'i' || englishWord.charAt(i - 1) == 'o' || englishWord.charAt(i - 1) == 'u') {


                            transWord = transWord + englishWord.charAt(i);
                        } else {
                            transWord = transWord + "ub" + englishWord.charAt(i);
                        }
                    } else {
                        transWord = transWord + englishWord.charAt(i);


                    }
                    
                   
                }

 
            }
             System.out.println(englishWord + " translated to ubbi dubbi is " + transWord);
                    break;
        }





    }
}

        
