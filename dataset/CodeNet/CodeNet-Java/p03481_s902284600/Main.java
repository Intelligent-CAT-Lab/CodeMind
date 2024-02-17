import java.util.Scanner;

class Main {
	public static void main(String[] $) {
		Scanner sc = new Scanner(System.in);
		long x=sc.nextLong(),y=sc.nextLong(),count=1;
		while(true) {
			x*=2;
			if(x>y)break;
			count++;
		}
		System.out.println(count);
	}
}
