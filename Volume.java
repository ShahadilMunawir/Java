// Program 14

class Volume{
    static int find_volume(int area){
        return area*area*area;
    }

    static int find_volume(int length, int width, int height){
        return length*width*height;
    }

    static double find_volume(double radius, double height){
        return Math.PI*radius*radius*height;
    }

    public static void main(String[] args){
        System.out.println("Volume of Cube: " + find_volume(10));
        System.out.println("Volume of Rectangular Box: " + find_volume(10, 20, 30));
        System.out.println("Volume of Cylinder: " + find_volume(15, 10));
    }
}
