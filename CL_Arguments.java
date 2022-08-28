// Program 1

class CL_Arguments{
    public static void main(String args[]){
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("Sum: " + (num1+num2));
        System.out.println("Difference: " + (num1-num2));
        System.out.println("Product: " + (num1*num2));
        System.out.println("Quotient: " + (num1/num2));
        System.out.println("Remainder: " + (num1%num2));
    }
}
