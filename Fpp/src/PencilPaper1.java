
public class PencilPaper1 {

	public static void main(String[] args) {
		
		int x = Integer.parseInt(args[0]);
		String socialSecurityStatus = (x > 65)? "ineligible" : "eligible";
		System.out.println(socialSecurityStatus);
		
	}

}
