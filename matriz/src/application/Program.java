package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, c;
		System.out.println("Escolha a linha;");
		n = sc.nextInt();
		System.out.println("Escolha a coluna;");
		c = sc.nextInt();
		int[][] mat = new int[n][c];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.print("Escolha numero na linha" + (i+1) + "e coluna" + (j+1));
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x =0;
		System.out.println("Digite numero");
		x = sc.nextInt();
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] == x) {
					System.out.println("Position:" + i + "," + j);
					if(j>0) {
						System.out.println("Left:" + mat[i][j - 1]);
					}
					if(i>0) {
						System.out.println("Up:" + mat[i - 1][j]);
					}
					if(j<mat[i].length-1) {
						System.out.println("Right:" + mat[i][j + 1]);
					}
					if(i<mat.length-1) {
						System.out.println("Down:" + mat[i + 1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
