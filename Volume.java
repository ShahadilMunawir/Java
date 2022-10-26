// Program 14

import java.util.Scanner;

class Volume{    
    static int find_area(int area){
        return area*area*area;
    }

    static int find_area(int length, int width, int height){
        return length*width*height;
    }

    static double find_area(double radius, double height){
        return Math.PI*radius*radius*height;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter area of cube: ");
        int cubeArea = input.nextInt();
        System.out.print("Enter length of rectangular box: ");
        int lengthBox = input.nextInt();
        System.out.print("Enter width of rectangular box: ");
        int widthBox = input.nextInt();
        System.out.print("Enter height of rectangular box: ");
        int heightBox = input.nextInt();
        System.out.print("Enter radius of cylinder: ");
        int radiusCylinder = input.nextInt();
        System.out.print("Enter height of cylinder: ");
        int heightCylinder = input.nextInt();
        System.out.println("Volume of Cube: " + find_area(cubeArea));
        System.out.println("Volume of Rectangular Box: " + find_area(lengthBox, widthBox, heightBox));
        System.out.println("Volume of Cylinder: " + find_area(radiusCylinder, heightCylinder));
        input.close();
    }
}
