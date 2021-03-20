package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		double a = 1; // conversão implícita
		System.out.println(a);
		
		float b = (float) 1.12345688888; // conversão explícita (CAST)
		System.out.println(b);
		
		int c = 134; // suporta 4 vezes mais armazenamento do que o byte
		byte d = (byte) c; // conversão explícita (CAST)
		System.out.println(c);
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e; // conversão explícita (CAST)
		System.out.println(e);
		System.out.println(f);
	}
}
