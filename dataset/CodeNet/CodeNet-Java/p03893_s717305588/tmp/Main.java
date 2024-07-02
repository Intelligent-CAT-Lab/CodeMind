import java.util.*;

public class    Main {
			
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);			
		long n=input.nextLong();		
System.out.println("[INST]6;n;input.nextLong();"+n);
		long s=f(n);
		System.out.println(s);
	}

	private static long f(long n) {
		if(n==0)
			return 2;
		return (f(n-1)*2)+2;
		
	}
}