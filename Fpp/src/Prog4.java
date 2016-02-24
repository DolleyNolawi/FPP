
public class Prog4 {
		public static void main(String[] args){
			
			String m = Data.records;
			String[] r = m.split(":");
		    for(int i = 0 ; i < m.length() ; i++){	
		    	    String row = r[i];		    		
		    		String[] token = row.split(",");
		    		for(int j=0 ; j< row.length() ; j++){
		    			if(j == row.length()-1){
		    				System.out.println(token[0]);
		    			}
		    		}
		    }
		}
}
