// Program 10

import java.util.Scanner;

class Vovels{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.nextLine();
        String formattedStr = "";
      
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e'
                || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                || str.charAt(i) == 'u' || str.charAt(i) == 'A'
                || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                || str.charAt(i) == 'O'
                || str.charAt(i) == 'U'){
                continue;
            }else{
                formattedStr = formattedStr + str.charAt(i);
            }
        }

        if(formattedStr.length() == 0){
            System.out.println("The string is full of vovels");
        }else{
            System.out.println("The String without vovels: " + formattedStr);
        }
    }
}
