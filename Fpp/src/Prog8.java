
public class Prog8 {

	public static void main(String[] args) {
		int[] arry = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		min(arry);

	}
	static int min(int[] arrayOfInts){
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arrayOfInts.length ; i++){
			if(min > arrayOfInts[i]){
				min = arrayOfInts[i];
			}
		}
		System.out.println(min);
		return min;
	}

}
