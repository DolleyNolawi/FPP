
public class Prog3 {

	public static void main(String[] args) {
		float a = 1.27f;
		float b = 3.881f;
		float c = 9.6f;
		
		int sumOfFloats = (int)(a + b + c);
		System.out.println(sumOfFloats);
		
		int sumByRounding = (int) (Math.round(a+b+c));
		System.out.println(sumByRounding);
		
	}

}
