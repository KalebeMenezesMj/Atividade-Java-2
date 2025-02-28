package atividade;

import java.util.Scanner;

public class atividade2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String [] [] loginSenha = new String [6] [2];
		String [] [] loginSenhaUser = new String [1] [2];
		Boolean userEncontrado = false;

		
		for(int i = 0; i < 6; i++) {
			
			System.out.println("Insira o " + (i+1) + "° login: ");
			loginSenha[i] [0] = scan.next();
			
			System.out.println("Insira a " + (i+1) + "° Senha: ");
			loginSenha[i] [1] = scan.next();
			
		}
		
		
		System.out.println("Insira o login para busca: ");
		loginSenhaUser[0] [0] = scan.next();
		
		System.out.println("Insira a senha para busca: ");
		loginSenhaUser[0] [1] = scan.next();
		
		
		for(int i = 0; i < 6; i++) {
			
			if(loginSenha[i] [0].equals(loginSenhaUser [0] [0]) && loginSenha[i] [0].equals(loginSenhaUser [0] [1]) ) {
					
					System.out.println("Usuario e senha CORRETOS!!");
				    
					userEncontrado = true;
					
					break;
			}				
		}
		
		if (userEncontrado == false) {
			
			System.out.println("Usuario ou senha incorreto!!");
			
		}
			
	}			
	
}