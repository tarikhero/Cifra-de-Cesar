
public class Decrypt {

	public static StringBuffer decrypt(String texto, int chave){ 
		StringBuffer result= new StringBuffer(); 

		for (int i=0; i<texto.length(); i++) { 
						
			if (Character.isUpperCase(texto.charAt(i))) { 
				char ch = (char)(((int)texto.charAt(i) + chave - 65) % 26 + 65); 
				result.append(ch); 
			} else { 
				char ch = (char)(((int)texto.charAt(i) + chave - 97) % 26 + 97); 
				result.append(ch); 
			} 
		} 
		return result; 
	}
}
