package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean work1 = false;
		boolean work2 = false;
		
		if (work1 || work2) {
			if (work1 && work2) {
				System.out.println("Compra tv de 50 polegadas");
			} else {
				System.out.println("Compra tv de 35 polegadas\n");				
			}
			System.out.println("Toma sorvete");
		} else {
			System.out.println("Fica em casa");
		}
	}
}
