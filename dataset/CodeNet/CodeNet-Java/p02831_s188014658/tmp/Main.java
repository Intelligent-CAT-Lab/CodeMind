
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
System.out.println("[INST]6;A;sc.nextInt();"+A);
        int B = sc.nextInt();
System.out.println("[INST]7;B;sc.nextInt();"+B);
        
        System.out.print(lcm(A,B));
  
        
	}
	
	  private static long gcd(long m, long n) {
	        if(m < n) return gcd(n, m);
	        if(n == 0) return m;
	        return gcd(n, m % n);
	    }
	    
	    private static long lcm(long m, long n) {
	        return m * n / gcd(m, n);
	    }
    
}

