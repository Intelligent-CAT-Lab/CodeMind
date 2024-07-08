import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		long k = sc.nextLong();
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