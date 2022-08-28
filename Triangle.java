// Program 2

import java.util.Scanner;

class Triangle{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side x: ");
        int x = input.nextInt();
        System.out.print("\nEnter side y: ");
        int y = input.nextInt();
        System.out.print("Enter side z: ");
        int z = input.nextInt();
        if(x == y && y == z){
            System.out.println("The triangle is equilateral");
        }else if(x ==y || y == z || x == z){
            System.out.println("The triangle is isocelus");
        }else{
            System.out.println("The triangle is scalene");
        }
    }
}