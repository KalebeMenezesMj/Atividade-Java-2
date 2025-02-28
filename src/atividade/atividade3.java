package atividade;

import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int [] [] matriz = {
				{1, 2},
				{3, 4},
				{5, 6}
		};
		
		int linha = matriz.length;
		int coluna = matriz[0].length;
		
		int [] [] transposta = new int [coluna] [linha];
		
		for (int i = 0; i < linha; i++) {
			
			for(int l = 0; l < coluna; l++) {
				
				transposta[l] [i] = matriz [i] [l];
				
			}
		}
		
		for (int i = 0; i < coluna; i++) {
			
			for(int l = 0; l < linha; l++) {
				
				System.out.print(transposta[i][l] + " ");
				
			}
			
			System.out.println();
		}
		
	}

}
