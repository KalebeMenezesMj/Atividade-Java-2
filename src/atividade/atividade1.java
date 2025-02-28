package atividade;

public class atividade1 {

	public static void main(String[] args) {

		int [][] matrizA = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		int [][] matrizB = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		int [] [] soma = new int [3] [3];
		
		for (int i = 0; i < 3; i++) {
			
			for (int l = 0; l < 3; l++) {
				
				soma[i] [l] = matrizA [i] [l] + matrizB [i] [l];
				
			}
		}
		
		
		for (int i = 0; i < 3; i++) {
			
			for(int l = 0; l < 3; l++) {
				
				System.out.print(soma[i] [l] + " ");
				
			}
			
			System.out.println();	
		}
		
		
	}

}
