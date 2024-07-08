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
var newVariable_0 = primes.add(i);			}
		}
var newVariable_1 = primes.stream()
			.filter(num -> num%5==1);var newVariable_2 = primes.stream();		List<Integer> primesFive = newVariable_2
			.filter(num -> num%5==1)
var newVariable_3 = Collectors.toList();			.collect(newVariable_3);

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

var newVariable_4 = primesFive.subList(0,input).stream().map(num->num.toString());var newVariable_5 = primesFive.subList(0,input).stream();var newVariable_6 = primesFive.subList(0,input);var newVariable_7 = num.toString();var newVariable_8 = Collectors.joining(" ");		String ans = primesFive.subList(0,input).stream().map(num->num.toString()).collect(newVariable_8);
		System.out.println(ans);
	}
}
