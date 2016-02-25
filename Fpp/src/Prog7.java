
public class Prog7 {
	public static void main(String[] args) {

		for (int i = 0; i < 2; i++) {

			int[] anArray = new int[8];
			for (int j = 0; j < anArray.length; j++) {
				anArray[j] = RandomNumbers.getRandomInt(1, 99);
			}

			String output = "";
			output = String.format("%16d%12d%12d%12d %n%n", anArray[0], anArray[1], anArray[2], anArray[3]);
			output += String.format("%13s %2d %9s %2d %9s%2d%9s%2d%n", "+", anArray[4], "+", anArray[5], "+",
					anArray[6], "+", anArray[7]);
			output += String.format("%16s %12s %10s %10s", "____", "____", "____", "____");
			System.out.println(output);
			System.out.println("\n");

		}

	}
}
