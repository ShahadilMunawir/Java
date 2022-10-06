// Program 15

import java.util.Scanner;

abstract class Shape{
    Scanner input = new Scanner(System.in);
    double PI = Math.PI;
    abstract void find_area();
}

class TwoDim extends Shape{
    void find_area(){}
}

class ThreeDim extends Shape{
    void find_area(){}
}

class Square extends TwoDim{
    void find_area(){
        System.out.print("Enter side of the Square: ");
        int side = input.nextInt();
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }
}

class Triangle extends TwoDim{
    void find_area(){
        System.out.print("\nEnter height of Triange: ");
        int height = input.nextInt();
        System.out.print("Enter base of Triangle: ");
        int base = input.nextInt();
        int area = (height*base)/2;
        System.out.println("Area of Triangle: " + area);
    }
}

class Sphere extends ThreeDim{
    void find_area(){
        System.out.print("\nEnter radius of Sphere: ");
        int radius = input.nextInt();
        System.out.println("Area of Sphere: " + 4*PI*radius*radius);
    }
}

class Cube extends ThreeDim{
    void find_area(){
        System.out.print("\nEnter edge of Cube: ");
        int edge = input.nextInt();
        int area = 6*edge*edge;
        System.out.println("Area of Cube: " + area);
    }
}

class Abstract{
    public static void main(String[] args){
        Square square = new Square();
        Triangle triangle = new Triangle();
        Sphere sphere = new Sphere();
        Cube cube = new Cube();

        square.find_area();
        triangle.find_area();
        sphere.find_area();
        cube.find_area();
    }
}