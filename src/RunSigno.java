import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.senac.SimpleJava.Console;

public class RunSigno {
	public void run(){
		
		Pessoa pessoa = new Pessoa();
	
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
		String date = "24/02/1993";
		pessoa.DataNascimento = LocalDate.parse(date, formatter);
		
		Console.println(pessoa.VerificarIdadeESigno(pessoa.DataNascimento)); 
		
	
	}
	
	

}
