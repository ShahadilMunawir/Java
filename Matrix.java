// Program 7

import java.util.Scanner;

class Matrix{
    public static void main(String[] args){
        int i, j;
        double sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("No of Rows: ");
        int rows = input.nextInt();
        System.out.print("No of Columns: ");
        int columns = input.nextInt();
        int originalArray[][] = new int[rows][columns];
        int transposeArray[][] = new int[columns][rows];

        System.out.println("Enter the elements of the matrix:- ");
        for(i=0; i<rows; i++){
            for(j=0; j<columns; j++){
                System.out.printf("Element [%d][%d]: ", i, j);
                originalArray[i][j] = input.nextInt();
                transposeArray[j][i] = originalArray[i][j];
            }
        }

        for(i=0; i<rows; i++){
            for(j=0; j<columns; j++){
                if(i == j){
                    sum = sum + (originalArray[i][j]);
                }
            }
        }
        System.out.printf("Trace of the matrix: %f\n", sum);

        System.out.println("Your matrix:-");
        for(i=0; i<rows; i++){
            for(j=0; j<columns; j++){
                System.out.print(originalArray[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println("Transpose of Matrix:-");
        for(i=0; i<columns; i++){
            for(j=0; j<rows; j++){
                System.out.print(transposeArray[i][j] + " ");
            }
            System.out.println("");
        }
        input.close();
    }
}
