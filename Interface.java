// Program 16

import java.util.Scanner;

interface Volume{
    double pi = Math.PI;

    void readData();
    void displayVolume();
}

class Sphere implements Volume{
    int radius;
    Scanner input = new Scanner(System.in);
    @Override
    public void readData(){
        System.out.print("Radius of Sphere: ");
        radius = input.nextInt();
    }

    @Override
    public void displayVolume(){
        double volume = (4/3)*pi*(radius*radius*radius);
        System.out.println("Volume of Sphere: " + volume);
    }

}

class Cylinder implements Volume{
    int radius, height;
    Scanner input = new Scanner(System.in);

    @Override
    public void readData(){
        System.out.print("\nRadius of Cylinder: ");
        radius = input.nextInt();
        System.out.print("Height of Cylinder: ");
        height = input.nextInt();
    }

    @Override
    public void displayVolume(){
        double volume = pi*(radius*radius)*height;
        System.out.print("Volume of Cylinder: " + volume);
    }
}

class Interface{
    public static void main(String[] args){
        Sphere sphere = new Sphere();
        sphere.readData();
        sphere.displayVolume();

        Cylinder cylinder = new Cylinder();
        cylinder.readData();
        cylinder.displayVolume();
    }
}