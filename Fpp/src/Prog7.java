
public class Prog7 {
	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
			int x = RandomNumbers.getRandomInt(1, 99);
			int y = RandomNumbers.getRandomInt(1, 99);
			if (x != y) {
				String output = "";
				output = String.format("%16d%12d%12d%12d %n%n", x , y , x , y);
				output += String.format("%13s %2d %9s %2d %9s%2d%9s%2d%n", "+", y , "+", x,"+" , y ,"+" , x);
				output += String.format("%16s %12s %10s %10s", "____","____","____","____");
				System.out.println(output);
				System.out.println("\n");
			}

		}

	}
}
