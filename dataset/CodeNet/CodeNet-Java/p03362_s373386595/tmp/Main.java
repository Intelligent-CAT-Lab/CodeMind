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
System.out.println("[INST]13;None;primes.add(i);"+primes.add(i));
			}
		}
		List<Integer> primesFive = primes.stream()
System.out.println("[INST]16;primesFive;primes.stream()
			.filter(num -> num%5==1)
			.collect(Collectors.toList());"+primesFive);
System.out.println("[INST]16;None;primes.stream()
			.filter(num -> num%5==1);"+primes.stream()
			.filter(num -> num%5==1));
System.out.println("[INST]16;None;primes.stream();"+primes.stream());
			.filter(num -> num%5==1)
			.collect(Collectors.toList());
System.out.println("[INST]18;None;Collectors.toList();"+Collectors.toList());

		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
System.out.println("[INST]21;input;scan.nextInt();"+input);

		String ans = primesFive.subList(0,input).stream().map(num->num.toString()).collect(Collectors.joining(" "));
System.out.println("[INST]23;ans;primesFive.subList(0,input).stream().map(num->num.toString()).collect(Collectors.joining(' '));"+ans);
System.out.println("[INST]23;None;primesFive.subList(0,input).stream().map(num->num.toString());"+primesFive.subList(0,input).stream().map(num->num.toString()));
System.out.println("[INST]23;None;primesFive.subList(0,input).stream();"+primesFive.subList(0,input).stream());
System.out.println("[INST]23;None;primesFive.subList(0,input);"+primesFive.subList(0,input));
System.out.println("[INST]23;None;num.toString();"+num.toString());
System.out.println("[INST]23;None;Collectors.joining(' ');"+Collectors.joining(" "));
		System.out.println(ans);
	}
}
