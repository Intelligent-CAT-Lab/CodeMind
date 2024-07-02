import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
System.out.println("[INST]8;n;sc.nextLong();"+n);
		long k = sc.nextLong();
System.out.println("[INST]9;k;sc.nextLong();"+k);
		long ans = n;
		long num = n % k;
		long num2 = 0;

		while(true) {
			num2 = Math.abs(num);
System.out.println("[INST]15;num2;Math.abs(num);"+num2);
			ans = Math.min(ans, num2);
System.out.println("[INST]16;ans;Math.min(ans, num2);"+ans);
			if(num < 0) {
				break;
			}
			num = num -k;
		}
		
		System.out.println(ans);

	}
}
