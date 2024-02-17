import java.io.*;
import java.util.*;

public class Main {
	
	static Map<Long, Long> check = new HashMap<Long, Long>();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;
		String[] input;
		long N;
		
		N = Long.parseLong(br.readLine());
		
		System.out.println(solve(N));
	}
	
	static long solve(long n) {
		long a, b;
		
		if(n == 0) return 1;
		if(n == 1) return 2;
		
		if(check.containsKey(n/2)) {
			a = check.get(n/2);
		} else {
			a = solve(n/2) % 1000000007;
			check.put(n/2, a);
		}
		
		if(check.containsKey(n/2-1)) {
			b = check.get(n/2-1);
		} else {
			b = solve(n/2-1) % 1000000007;
			check.put(n/2-1, b);
		}
		
		if(n % 2 == 1) {
			return (2*a + b) % 1000000007;
		} else {
			return (2*b + a) % 1000000007;
		}
	}
}
