import java.util.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
System.out.println("[INST]5;n;sc.nextLong();"+n);
		long p = sc.nextLong();
System.out.println("[INST]6;p;sc.nextLong();"+p);
		if (n == 1) {
			System.out.println(p);
			return;
		}
		long res = 1;
		for (int i = 2; Math.pow(i, n) <= p; i++) {
System.out.println("[INST]12;None;Math.pow(i, n);"+Math.pow(i, n));
			if (p % Math.pow(i, n) == 0) res = i;
System.out.println("[INST]13;None;Math.pow(i, n);"+Math.pow(i, n));
		}
		System.out.println(res);
	}
}
