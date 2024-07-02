import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		long x=sc.nextLong(),y=sc.nextLong(),count=1;
System.out.println("[INST]5;x;sc.nextLong();"+x);
System.out.println("[INST]5;y;sc.nextLong();"+y);
		while(true) {
			x*=2;
			if(x>y)break;
			count++;
		}
		System.out.println(count);
	}
}
