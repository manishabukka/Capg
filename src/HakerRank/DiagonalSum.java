package HakerRank;

import java.util.Scanner;

public class DiagonalSum {

	public static int arraySum(int[][] array, int r, int c) {
		int total = 0, total1 = 0;
		int f = r - 1;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (i == j) {
					total += array[i][j];

				}
			}
		}
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {

				 if ((i + j) == f) {
					total1 += array[i][j];

				}

			}

		}

		System.out.println(total);
		System.out.println(total1);
		int a = Math.abs(total - total1);

		return a;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num, row, cols;
		System.out.println("enter size of row");
		System.out.println("enter size of cols");

		row = sc.nextInt();
		cols = sc.nextInt();
		int mat[][] = new int[row][cols];
		if (row != cols) {
			System.out.println("It is not possible");
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("enter elements");
				num = sc.nextInt();
				mat[i][j] = num;

			}

		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {

				System.out.print(mat[i][j] + " ");

			}
			System.out.println();

		}
		DiagonalSum d = new DiagonalSum();
		System.out.println(d.arraySum(mat, row, cols));

	}

}
