import java.util.*;
import java.util.stream.*;

class Main{
	public static void main(String[] args) {
		List<Integer> primes = new ArrayList<>(1<<16);
		for(int i = 2; i < 55555; i++) {
			boolean primeFlag = true;
			for(int prime : primes) {
				if(prime*prime>i) break;
				primeFlag &= (i%prime!=0);
			}
			if(primeFlag) {
				primes.add(i);
			}
		}
		List<Integer> primesFive = primes.stream()
			.filter(num -> num%5==1)
			.collect(Collectors.toList());

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		String ans = primesFive.subList(0,input).stream().map(num->num.toString()).collect(Collectors.joining(" "));
		System.out.println(ans);
	}
}
