import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
System.out.println("[INST]6;n;sc.nextInt();"+n);
		int k = sc.nextInt();
System.out.println("[INST]7;k;sc.nextInt();"+k);
		long count = 0;
		if (k % 2 == 0) {
			long x = n / k;
			count += (x * x * x);
			long y = (n + k / 2) / k;
			count += (y * y * y);
		} else {
			long x = n / k;
			count += (x * x * x);
		}
		System.out.println(count);
	}
}