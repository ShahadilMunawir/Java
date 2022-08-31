// Program 11

import java.util.Scanner;

class Student{
    String name;
    String major;
    int id;
    public static void main(String args[]){
        Student student = new Student();
        Marks mk = new Marks();
        Scanner input = new Scanner(System.in);

        System.out.print("Name: ");
        student.name = input.nextLine();
        System.out.print("Major: ");
        student.major = input.nextLine();
        System.out.print("ID: ");
        student.id = input.nextInt();


        mk.read_marks();
        System.out.println("\n<--RESULT-->");
        System.out.println("Name: " + student.name);
        System.out.println("ID: " + student.id);
        System.out.println("Major: " + student.major);
        mk.find_total();
        mk.find_average();
    }
}

class Marks extends Student{
    int marks[] = new int[5];
    String subjects[] = {"Java", "Software Engineering", "Computer Organization and Architecture", "PhP", "E-Commerce"};

    int sum = 0;
    int avg = 0;
    void read_marks(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the marks of your subjects:");
        for(int i=0;i<5;i++){
            System.out.print(subjects[i] + ": ");
            marks[i] = input.nextInt();
            sum += marks[i];
            avg += marks[i];
        }
    }
    void find_total(){
        System.out.println("\nTotal mark: " + sum);
    }
    void find_average(){
        avg = avg/5;
        System.out.println("Average mark: " + avg);
    }
}
