package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		Byte b = 10;
		Short s = 100;
		
		Integer i = 1000;
		Long l = 10000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.4F;
		System.out.println(f);
		
		Double d = 12345.678;
		System.out.println(d);
		
		Boolean bool = Boolean.parseBoolean("true");
		System.out.println(bool);
		System.out.println(bool.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");
	}
}
