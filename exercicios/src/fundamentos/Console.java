package fundamentos;

import java.util.ArrayList;
import java.util.List;

public class Console {
	public static void main(String[] args) {

//		System.out.print("Bom"); // Não pula linha
//		System.out.print(" dia! \n\n");
//		
//		System.out.println("Bom");
//		System.out.println("dia!");
//		
//		System.out.printf("Megasena: d% d% d% d% d% d%",
//				1, 2, 3, 4, 5, 6);
//		
//		System.out.printf("Salário: %.2f%n", 3238.478);
	
		System.out.println(solution(10));
	}

	public static int solution(int number) {
		List<Integer> multiples = new ArrayList<>();
		for (int i = 0; i < number; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				multiples.add(i);
			}
		}

		int sum = 0;
		for (int multiple : multiples) {
			sum += multiple;
		}
		return sum;
	}
}
