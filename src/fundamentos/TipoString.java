package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat(" kkkk"));
		System.out.println(s + " kkkk");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		String nome = "Carlos";
		String sobrenome = "Rolt";
		int idade = 28;
		double salario = 1730.75;
		
		System.out.println("Nome: " + nome
				+ "\nSobrenome: " + sobrenome
				+ "\nIdade: " + idade
				+ "\nSalario: " + salario
				+ "\n\n");
		
		System.out.printf("O senhor %s %s tem %d anos e seu salário é de %.2f reais", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e seu salário é de %.2f reais", nome, sobrenome, idade, salario);
		System.out.println(frase);
	}
}
