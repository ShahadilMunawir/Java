// Program 2

import java.util.Scanner;
import java.lang.Math;

class Triangle{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side x: ");
        int x = input.nextInt();
        System.out.print("Enter side y: ");
        int y = input.nextInt();
        System.out.print("Enter side z: ");
        int z = input.nextInt();
        
        if(x == y && y == z){
            System.out.println("The triangle is equilateral");
        }else if(x == y || y == z || x == z){
            System.out.println("The triangle is isocelus");
        }else{
            System.out.println("The triangle is scalene");
        }
        
        int s = (x+y+z)/2;
        double area = Math.pow((s*(s-x)*(s-y)*(s-z)), 0.5);
        if(area == 0){
            System.out.println("The sum of two side lengths has to exceed the length of the third side");
        }
        else{
            System.out.println("Area: " + area);
        }
    }
}
