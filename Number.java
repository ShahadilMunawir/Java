// Program 12

import java.util.Scanner;

class ComplexNumber{
    int real;
    int imaginary;

    ComplexNumber(){}

    ComplexNumber(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    ComplexNumber sum(ComplexNumber a, ComplexNumber b){
        ComplexNumber result = new ComplexNumber();

        result.real = a.real + b.real;
        result.imaginary = a.imaginary + b.imaginary;

        return result;
    }
}

class Number{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter real part of first number: ");
        int realFirst = input.nextInt();
        System.out.print("Enter imaginary part of first number: ");
        int imgFirst = input.nextInt();
        System.out.print("Enter real part of second number: ");
        int realSecond = input.nextInt();
        System.out.print("Enter imaginary part of second number: ");
        int imgSecond = input.nextInt();
        ComplexNumber obj1 = new ComplexNumber(realFirst, imgFirst);
        ComplexNumber obj2 = new ComplexNumber(realSecond, imgSecond);
        ComplexNumber obj3 = new ComplexNumber();
        
        ComplexNumber result = obj3.sum(obj1, obj2);
        System.out.println("Sum of complex numbers: " + result.real +  "+" + result.imaginary + "i");
        input.close();
    }
}
