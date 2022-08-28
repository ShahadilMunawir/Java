// Program 6

import java.util.Scanner;
class HCF_LCM{
    public static void main(String args[]){
        int gcd=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Number 1: ");
        int num1 = input.nextInt();

        System.out.print("Number 2: ");
        int num2 = input.nextInt();
        
        int min = (num1<num2)?num1:num2;
        for(int i=1;i<min;i++){
            if(num1 % i == 0 && num2%i == 0){
                gcd = i;
            }
        }
        int lcm = (num1*num2) / gcd;

        System.out.println("LCM: " + lcm);
        System.out.println("GCD: " + gcd);
    }
}