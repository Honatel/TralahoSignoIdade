import java.time.LocalDate;

public class Pessoa {

	public LocalDate DataNascimento;
	public int Idade;
	public String Signo;
	
	public String VerificarIdadeESigno(LocalDate DataNascimento){

		return CalculaIdade(DataNascimento);
		
	}
	
    private String CalculaIdade(LocalDate dataNascimento2) {
		
		int idade =  LocalDate.now().getYear() - dataNascimento2.getYear();
		
		return "Sua Idade é " + idade + " e seu signo: " + GetSigno(dataNascimento2.getDayOfMonth(), dataNascimento2.getMonthValue());
	}

	private String GetSigno(int dia, int mes) {
		if ((mes == 1 && dia > 20) ||(mes == 2 && dia <= 18)) {
			return "Aquário";
		}
		else
		if((mes == 2 && dia > 18 ) ||(mes == 3 && dia < 20)) {
			return "Peixes";
		}
		else
		if((mes == 3 && dia >19 ) ||(mes == 4 && dia < 21)) {
			return "Áries";
		}
		else
		if((mes == 4 && dia >20 ) ||(mes == 5 && dia < 21)) {
			return "Touro";
		}
		else
		if((mes == 5 && dia >20 ) ||(mes == 6 && dia < 21)) {
			return "Gêmios";
		}
		else
		if((mes == 6 && dia >20 ) ||(mes == 7 && dia < 22)) {
			return "Câncer";
		}
		else
		if((mes == 7 && dia >21 ) ||(mes == 8 && dia < 23)) {
			return "Leão";
		}
		else
		if((mes == 8 && dia >22 ) ||(mes == 9 && dia < 23)) {
			return "Virgem";
		}
		else
		if((mes == 9 && dia >22 ) ||(mes == 10 && dia < 23)) {
			return "Libra";
		}
		else
		if((mes == 10 && dia >22 ) ||(mes == 11 && dia < 22)) {
			return "Escorpião";
		}
		else
		if((mes == 11 && dia >21 ) ||(mes == 12 && dia < 22)) {
			return "Ságitario";
		}
		else
		if((mes == 12 && dia >21 ) ||(mes == 1 && dia < 22)) {
			return "Capricornio";
		}
		
		return null;
	}
	
	public LocalDate getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		DataNascimento = dataNascimento;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public String getSigno() {
		return Signo;
	}
	public void setSigno(String signo) {
		Signo = signo;
	}
	
	
}




















