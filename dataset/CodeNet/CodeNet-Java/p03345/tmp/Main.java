import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a  = sc.nextLong();
System.out.println("[INST]6;a;sc.nextLong();"+a);
		long b = sc.nextLong();
System.out.println("[INST]7;b;sc.nextLong();"+b);
		long c = sc.nextLong();
System.out.println("[INST]8;c;sc.nextLong();"+c);
		long k = sc.nextLong();
System.out.println("[INST]9;k;sc.nextLong();"+k);
		long ans = a-b;
		if(Math.abs(ans)>Math.pow(10, 18)) {
System.out.println("[INST]11;None;Math.abs(ans);"+Math.abs(ans));
System.out.println("[INST]11;None;Math.pow(10, 18);"+Math.pow(10, 18));
			System.out.println("Unfair");
			return;
		}
		if(k%2 == 0) {
			System.out.println(ans);
		}
		else {
			System.out.println(ans*-1);
		}
	}
}
