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
        System.out.println("Volume of Cube: " + find_area(10));
        System.out.println("Volume of Rectangular Box: " + find_area(10, 20, 30));
        System.out.println("Volume of Cylinder: " + find_area(15, 10));
    }
}
