
public class Prog5 {

	public static void main(String[] args) {
		String msg = "Hello";
		int len = msg.length();
		for(int i = len-1 ; i >= 0 ; i-- ){
			System.out.print(msg.charAt(i));
		}
	}

}
