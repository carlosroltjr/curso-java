package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		double exp1 = (Math.pow(6 * (3 + 2), 2)) / (3 * 2);
		double exp2 = Math.pow(((1 - 5) * (2 - 7)) / 2, 2);
		
		double result = (Math.pow((exp1 - exp2), 3)) / (Math.pow(10, 3));
		
		System.out.println(result);
		
	}
}
