import java.util.Scanner;
public class matrixoperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

 

        System.out.print("Enter rows and columns of Matrix A: ");

        int r1 = sc.nextInt();

        int c1 = sc.nextInt();

        int[][] A = new int[r1][c1];

 

        System.out.println("Enter elements of Matrix A:");

        for (int i = 0; i < r1; i++) 

            for (int j = 0; j < c1; j++)

                A[i][j] = sc.nextInt();

 

        System.out.print("Enter rows and columns of Matrix B: ");

        int r2 = sc.nextInt();

        int c2 = sc.nextInt();

        int[][] B = new int[r2][c2];

 

        System.out.println("Enter elements of Matrix B:");

        for (int i = 0; i < r2; i++)

            for (int j = 0; j < c2; j++)

                B[i][j] = sc.nextInt();

 

        // Matrix addition

        if (r1 == r2 && c1 == c2) {

            System.out.println("\\nMatrix Addition (A + B):");

            for (int i = 0; i < r1; i++) {

                for (int j = 0; j < c1; j++)

                    System.out.print((A[i][j] + B[i][j]) + " ");

                System.out.println();

            }

        } else {

            System.out.println("\\nAddition not possible: dimensions must be equal.");

        }

 

        // Matrix multiplication

        if (c1 == r2) {

            int[][] C = new int[r1][c2];

            for (int i = 0; i < r1; i++)

                for (int j = 0; j < c2; j++)

                    for (int k = 0; k < c1; k++)

                        C[i][j] += A[i][k] * B[k][j];

 

            System.out.println("\\nMatrix Multiplication (A x B):");

            for (int i = 0; i < r1; i++) {

                for (int j = 0; j < c2; j++)

                    System.out.print(C[i][j] + " ");

                System.out.println();

            }

        } else {

            System.out.println("\\nMultiplication not possible: columns of A must equal rows of B.");

        }

 

        // Transpose of Matrix A

        System.out.println("\\nTranspose of Matrix A:");

        for (int j = 0; j < c1; j++) {

            for (int i = 0; i < r1; i++)

                System.out.print(A[i][j] + " ");

            System.out.println();

        }

 

        // Row-wise sums of Matrix A

        System.out.println("\\nRow-wise sums of Matrix A:");

        for (int i = 0; i < r1; i++) {

            int sum = 0;

            for (int j = 0; j < c1; j++)

                sum += A[i][j];

            System.out.println("Row " + (i + 1) + " = " + sum);

        }

 

        // Column-wise sums of Matrix A

        System.out.println("\\nColumn-wise sums of Matrix A:");

        for (int j = 0; j < c1; j++) {

            int sum = 0;

            for (int i = 0; i < r1; i++)

                sum += A[i][j];

            System.out.println("Column " + (j + 1) + " = " + sum);

        }

 

        sc.close();

    }

}