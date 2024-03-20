import java.util.Scanner;

public class p03209 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long x = sc.nextLong();

		System.out.println(calc(n, x));
	}

	static long calc(int n, long x){
		if(n == 0)
			return 1;
		long sum = 0;
		x--;
		long length = length(n-1);
		long p = p(n-1);
		if(x > 0){
			if(length <= x)
				sum += p;
			else
				sum += calc(n-1, x);
			x -= length;
		}
		if(x > 0){
			x--;
			sum++;
		}
		if(x > 0){
			if(length <= x)
				sum += p;
			else
				sum += calc(n-1, x);
		}

		return sum;
	}

	static long length(int n){
		return 1 + 4 * ((long)Math.pow(2, n) -1);
	}

	static long p(int n){
		return 1 +2 * ((long)Math.pow(2, n) -1);
	}
}