package recursive;

public class MinSort {
	public static void main(String[] args){
		String s = "zwxuabfkafutbbbb";
		MinSort ms = new MinSort();
		String result = ms.sort(s);
	}
	
	public String sort(String st){
		char min = st.charAt(0);
		//char nmin = 'a';
		for(int i = 1 ; i < st.length()-1 ; i++){
			if( min <= st.charAt(i)){
				 min = min ;
			}
		}
		System.out.println(min);
		return st;
	}

}
