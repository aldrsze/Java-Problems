import java.io.*;

public class AnagramChecker {
    public static void main(String[] args) {
        Console con = System.console();
        boolean isAnagram = true;
        
        System.out.print("\033[H\033[2J");
        String w1 = con.readLine("Enter first word: ");
        String w2 = con.readLine("Enter second word: ");

        if (w1.length() != w2.length()) {
            System.out.println("Not an Anagaram!");
            System.exit(1);
        }
        
        String s1 = w1.toLowerCase();
        String s2 = w2.toLowerCase();

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        // SORTING C1 CHAR ARRAYS
        for (int i = 0; i < c1.length -1; i++) {
            for (int j = 0; j < c1.length -i -1 ; j++) {
                if (c1[j] > c1[j+1]) {
                    
                    char temp = c1[j];
                    c1[j] = c1[j + 1];
                    c1[j + 1] = temp;
                } // END IF 
            } // END j
        } // END i

        // SORTING C2 CHAR ARRAYS
        for (int i = 0; i < c2.length -1; i++) {
            for (int j = 0; j < c2.length -i -1 ; j++) {
                if (c2[j] > c2[j+1]) {
                    
                    char temp = c2[j];
                    c2[j] = c2[j + 1];
                    c2[j + 1] = temp;
                } // END IF 
            } // END j
        } // END i
       
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                isAnagram = false;
                break;
            }
        }
        
        System.out.println("\n---------------------------------");
        if (isAnagram) {
            System.out.println("The two words are anagrams! ");
        } else {
            System.out.println("The two words are not anagrams! ");
        }
        System.out.println("---------------------------------");

    } // MAIN

} // CLASS
