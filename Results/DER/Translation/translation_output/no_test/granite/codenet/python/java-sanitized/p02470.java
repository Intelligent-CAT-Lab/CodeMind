import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rn = (int)Math.sqrt(n);
		int[] sieve = new int[rn + 1];
		Arrays.fill(sieve, 1);
		for(int i = 2; i <= rn; i++){
			int j = i * 2;
			while(j <= rn){
				sieve[j] = 0;
				j += i;
			}
		}
		List<Integer> p = new ArrayList<>();
		for(int i = 2; i <= rn; i++){
			if(sieve[i] == 1){
				p.add(i);
			}
		}
		int ans = n;
		for(int q : p){
			if(n % q == 0){
				ans = ans * (q - 1) / q;
				while(n % q == 0){
					n /= q;
				}
			}
		}
		if(n > 1){
			ans = ans * (n - 1) / n;
		}
		System.out.println(ans);
	}
}