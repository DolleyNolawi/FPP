
public class Prog6 {

	public static void main(String[] args) {
		String[] animals = {"Dog" , "Cat" , "Horse" , "Cat" , "Dog"};
	    String[] result = removeDups(animals);
	    for(String i : result){ 
	    	System.out.println(i);
	    }
	}
	
	static String[] removeDups(String[] a){
		
		int count = 0;
		for(int i = 0 ; i < a.length-2; i++){
			for(int j = i+1 ; j < a.length-1; j++){
				if(a[i].equals(a[j])){
					count++;
					a[j] = null;
				}	
			}
		}
		int len = a.length-count;
		String[] nonDupAnimals = new String[len];
		for(int k = 0 ; k < a.length-1; k++){
				if(a[k] != null) nonDupAnimals[k] = a[k];
		}		

		return nonDupAnimals;		
	}

}
