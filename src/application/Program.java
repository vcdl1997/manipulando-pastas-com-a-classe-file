package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "C:\\temp\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
//			A Classe FileWriter verificar� o caminho e o nome do arquivo informado, caso exista o mesmo ser� substituido,
//			caso n�o exista o mesmo ser� criado.
			
//			Para contornar isso e manter o conte�do do arquivo intacto, basta passar um segundo par�metro com o valor true.
//			Desta forma o novo conteudo ser� inserido no final do arquivo.
			
			for(String str : lines) {
				bw.write(str);
				bw.newLine(); // Quebra a linha
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
