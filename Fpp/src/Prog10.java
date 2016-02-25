
public class Prog10 {
	public static void main(String[] a){
		String[] animals = {"Dog" , "Cat" , "Horse" , "Cat" , "Dog"};
	    String[] result = removeDups(animals);
	    
	    	for(int k = 0 ; k < result.length; k++){
	    		System.out.println(result[k]);
	    	}
	}
	
	public static String[] removeDups(String[] a) {
		
		String arr1[] = new String[a.length]; 
		int index = 0; 
		for (int i = 0; i < a.length; i++) { 
			boolean isDup = false; 
			for (int j = 0; j < index; j++) { 
				if (a[i].equals(arr1[j])) { 
					isDup = true;
					break;
				}
			}
			if (!isDup) {
				arr1[index] = a[i];
				index++;
			}
		}
		String[] result = new String[index]; //
		for (int i = 0; i < index; i++) { // looping
			result[i] = arr1[i]; //
		}
		return result;
}
	
}
