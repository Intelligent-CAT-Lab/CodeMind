import java.util.Scanner;

public class Main{
	static long sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
System.out.println("[INST]7;n;sc.nextLong();"+n);
		long x = sc.nextLong();
System.out.println("[INST]8;x;sc.nextLong();"+x);
		
		long a = Math.max(x, n-x);
System.out.println("[INST]10;a;Math.max(x, n-x);"+a);
		long b = Math.min(x, n-x);
System.out.println("[INST]11;b;Math.min(x, n-x);"+b);

		sum = a + b;
		while(true){
			long c = refrect(a, b);
			if(c==0) break;
			a = b;
			b = c;
		}

		System.out.println(sum);
	}

	static long refrect(long a, long b){
		long rest = a%b;
		long times = a/b;

		sum += b*times*2;
		if(rest==0) sum -= b;

		return rest;
	}
}