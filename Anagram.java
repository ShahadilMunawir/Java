// Program 9

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("String 1: ");
        String str1 = input.nextLine();
        System.out.print("String 2: ");
        String str2 = input.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){
            char array1[] = str1.toCharArray();
            char array2[] = str2.toCharArray();
            
            Arrays.sort(array1);
            Arrays.sort(array2);

            boolean anagram = Arrays.equals(array1, array2);

            if(anagram){
                System.out.println(str1 + " and " + str2 + " are Anagram");
            }else{
                System.out.println(str1 + " and " + str2 + " are not Anagram");

            }
        }else{
            System.out.println(str1 + " and " + str2 + " are not Anagram");

        }
    }
}