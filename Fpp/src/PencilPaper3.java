
public class PencilPaper3 {

	public static void main(String[] args) {
		double radius = 4;
		double width = 3;
		double height = 5;
		double A = Math.PI * (radius * radius);
		double diag = Math.sqrt((width * width) + (height * height));
		
		//System.out.println(A + " " + diag );
		int r = 3*5/9%2;
		int x = 4 ^ 3 & 5;
		int y = 13>>2<<2^4;
		int q = 13|16/3>>2&5;
		
		//int a = (b=5);
		System.out.println(q);
	}

}
