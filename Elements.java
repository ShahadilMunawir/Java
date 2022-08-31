// Program 3

import java.util.Scanner;

class Elements{
    public static void main(String args[]){
        int arr[] = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 elements: ");
        
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter element " + (i+1) + ": ");
            arr[i] = input.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int temp = 0;
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        System.out.println("Smallest Element in the array: " + arr[0]);
        System.out.println("Largest element in the array: " + arr[arr.length-1]);
        System.out.println("Second largest element in the array: " + arr[arr.length-2]);

    }
}
