// Program 4

import java.util.Scanner;

class BaseConverter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        System.out.print("Convert to: (1)Binary, (2)Octal, (3)Hexadecimal: ");
        int option = input.nextInt();
        if(option == 1){
            System.out.print(num + " in Binary: " + Integer.toBinaryString(num));
        }else if(option == 2){
            System.out.print(num + " in Octal: " + Integer.toOctalString(num));
        }else if(option == 3){
            System.out.print(num + " in Hexadecimal: " + Integer.toHexString(num));
        }else{
            System.out.println("Invalid Option");
        }
        input.close();
    }
}