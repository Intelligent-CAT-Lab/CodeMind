import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
System.out.println("[INST]4;a;sc.nextLong();"+a);
		long b = sc.nextLong();
System.out.println("[INST]5;b;sc.nextLong();"+b);
		long c = sc.nextLong();
System.out.println("[INST]6;c;sc.nextLong();"+c);
		long k = sc.nextLong();
System.out.println("[INST]7;k;sc.nextLong();"+k);
		long answer = 0;
		if(a>=k) {
			answer=k;
		}
		else {
			answer+=a;
			k=k-a;
			k=k-b;
			answer-=(k*1);
		}
		System.out.println(answer);
	}
}