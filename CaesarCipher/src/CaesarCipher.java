import java.util.Scanner;
 
class CaesarCipher {
	// Encrypts text using a shift od s
	public static StringBuffer encrypt (String text, int s) {
		StringBuffer result = new StringBuffer();

		for (int i = 0; i < text.length(); i++) {
			if (Character.isUpperCase(text.charAt(i))) {
				char ch = (char) (((int) text.charAt(i) + s - 65) % 26 + 65);
				result.append(ch);
			} else {
				char ch = (char) (((int) text.charAt(i) + s - 97) % 26 + 97);
				result.append(ch);
			}
		}
		return result;
	}

	public static StringBuffer decrypt (String text, int s) {
		StringBuffer result = new StringBuffer();

		for (int i = 0; i < text.length(); i++) {
			if (Character.isUpperCase(text.charAt(i))) {
				char ch = (char) (((int) text.charAt(i) - s - 65) % 26 + 65);
				result.append(ch);
			} else {
				char ch = (char) (((int) text.charAt(i) - s - 97) % 26 + 97);
				result.append(ch);
			}
		}
		return result;
	}
	
	// Driver code
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o texto a ser Encriptado ou Desencriptado: ");
		String texto = entrada.nextLine();
		
		System.out.println("");
		
		System.out.println("Digite a Chave: ");
		int chave = entrada.nextInt();
				
		System.out.println("");
			
		System.out.println("Digite 1 para Encriptar ou 2 para Desencriptar: ");
		int opcao = entrada.nextInt();
		
		System.out.println("");
		
		if (opcao==1) {
			//int chave = 4;
			System.out.println("Texto Inserido: " + texto);
			System.out.println("Chave: " + chave);
			System.out.println("Texto Encriptado: " + encrypt(texto, chave));
		} else {
			System.out.println("Texto Inserido: " + texto);
			System.out.println("Chave: " + chave);
			System.out.println("Texto Desencriptado: " + decrypt(texto, chave));	
		}
	}	
}
