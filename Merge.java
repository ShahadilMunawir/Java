//Program 5

import java.util.Scanner;

class Merge{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter array 1 length: ");
        int l1 = input.nextInt();
        int arr1[] = new int[l1];
        System.out.println("Enter array 1 elements:-");
        for(int i=0;i<l1;i++){
            System.out.print("Element " + (i+1) + ": ");
            arr1[i] = input.nextInt();
        }

        System.out.println("Enter array 2 length: ");
        int l2 = input.nextInt();
        int arr2[] = new int[l2];
        System.out.println("Enter array 2 elements:-");
        for(int i=0;i<l2;i++){
            System.out.print("Element " + (i+1) + ": ");
            arr2[i] = input.nextInt();
        }

        System.out.println("The array after merging is...");
        int l3[] = new int[l1+l2];
        int p = 0;

        for(int element: arr1){
            l3[p] = element;
            p++;
        }

        for(int element: arr2){
            l3[p] = element;
            p++;
        }

        for(int i=0;i<l3.length;i++){
            System.out.println(l3[i]);
        }
    }

}
