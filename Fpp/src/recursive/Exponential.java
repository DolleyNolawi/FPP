package recursive;

public class Exponential {

	public static void main(String[] args) {
		Exponential e = new Exponential();
		System.out.println(e.power(2,10));
     
	}
	
	public double power(double x,int n){
		if(n < 1) return 1;
		return x * power(x , n-1);
			
	}

}
