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
        ComplexNumber obj1 = new ComplexNumber(10, 15);
        ComplexNumber obj2 = new ComplexNumber(20, 25);
        ComplexNumber obj3 = new ComplexNumber();
        
        ComplexNumber result = obj3.sum(obj1, obj2);
        System.out.println("Sum of complex numbers: " + result.real +  "+" + result.imaginary + "i");
    }
}