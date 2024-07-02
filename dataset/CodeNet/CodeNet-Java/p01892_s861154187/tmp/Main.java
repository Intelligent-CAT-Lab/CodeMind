import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
System.out.println("[INST]5;a;sc.nextLong();"+a);
		long b = sc.nextLong();
System.out.println("[INST]6;b;sc.nextLong();"+b);
		int n = sc.nextInt();
System.out.println("[INST]7;n;sc.nextInt();"+n);
		long min = Long.MAX_VALUE;
		for (int i = 1; i <= n; i++) {
		    if (b % i != 0) {
		        continue;
		    }
		    long x = b / i;
		    long y = a / x;
		    if (y > n || y == 0) {
		        min = Math.min(min, Math.abs(n * x - a));
System.out.println("[INST]16;min;Math.min(min, Math.abs(n * x - a));"+min);
System.out.println("[INST]16;None;Math.abs(n * x - a);"+Math.abs(n * x - a));
		    } else {
		        min = Math.min(min, Math.abs(y * x - a));
System.out.println("[INST]18;min;Math.min(min, Math.abs(y * x - a));"+min);
System.out.println("[INST]18;None;Math.abs(y * x - a);"+Math.abs(y * x - a));
		    }
		    if (y + 1 > n) {
		        min = Math.min(min, Math.abs(n * x - a));
System.out.println("[INST]21;min;Math.min(min, Math.abs(n * x - a));"+min);
System.out.println("[INST]21;None;Math.abs(n * x - a);"+Math.abs(n * x - a));
		    } else {
		        min = Math.min(min, Math.abs((y + 1) * x - a));
System.out.println("[INST]23;min;Math.min(min, Math.abs((y + 1) * x - a));"+min);
System.out.println("[INST]23;None;Math.abs((y + 1) * x - a);"+Math.abs((y + 1) * x - a));
		    }
		    if (y - 1 == 0 || y - 1 > n) {
		        min = Math.min(min, Math.abs(n * x - a));
System.out.println("[INST]26;min;Math.min(min, Math.abs(n * x - a));"+min);
System.out.println("[INST]26;None;Math.abs(n * x - a);"+Math.abs(n * x - a));
		    } else {
		        min = Math.min(min, Math.abs((y - 1) * x - a));
System.out.println("[INST]28;min;Math.min(min, Math.abs((y - 1) * x - a));"+min);
System.out.println("[INST]28;None;Math.abs((y - 1) * x - a);"+Math.abs((y - 1) * x - a));
		    }
		}
		System.out.println(min);
	}
}

