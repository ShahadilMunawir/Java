//Program 8

import java.util.Scanner;

public class Sum_Reverse {
    public static void main(String args[]){
        Sum sumObj = new Sum();
        Reverse revObj = new Reverse();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Sum: " + sumObj.find_sum(num));
        System.out.println("Reverse: " + revObj.find_reverse(num));

    }
}

class Sum{
    int find_sum(int number){
        int sum=0;
        while(number != 0){
            sum += number%10;
            number /=10;
        }
        return sum;
    }
}

class Reverse{
    int find_reverse(int number){
        int reverse=0, remainder;
        while(number != 0){
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        return reverse;
    }
}