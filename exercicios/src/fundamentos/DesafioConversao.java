package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite aqui: ");
		String str1 = scanner.nextLine().replace(',', '.');
		
		System.out.println("Digite aqui: ");
		String str2 = scanner.nextLine().replace(',', '.');
		
		System.out.println("Digite aqui: ");
		String str3 = scanner.nextLine().replace(',', '.');
		
		System.out.println((Double.parseDouble(str1) + Double.parseDouble(str2) + Double.parseDouble(str3)) / 3);
		
		scanner.close();
	}
}
