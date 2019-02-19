import java.util.Scanner;

public class TokenTelefone {

	public static void main(String[] args) {
		
		String numeroTelefone;
		String[] token;
		String numeroConcatenado = "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira um numero no formato (555)555-5555:");
		numeroTelefone = input.nextLine();
		numeroTelefone = numeroTelefone.substring(1);
		
		token = numeroTelefone.split("\\D");
		
		System.out.printf("Código de área: %s%n", token[0]);
		System.out.printf("Primeira parte do telefone: %s%n", token[1]);
		System.out.printf("Segunda parte do telefone: %s%n", token[2]);
		
		for(String numero : token) {
			
			numeroConcatenado += numero;
			
		}
		
		System.out.printf("Númerdo concatenado: %s", numeroConcatenado);
	}

}
