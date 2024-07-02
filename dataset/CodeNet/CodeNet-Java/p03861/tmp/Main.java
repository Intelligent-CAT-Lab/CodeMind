
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
System.out.println("[INST]6;a;sc.nextLong();"+a);
		long b=sc.nextLong();
System.out.println("[INST]7;b;sc.nextLong();"+b);
		long x=sc.nextLong();
System.out.println("[INST]8;x;sc.nextLong();"+x);
		long count=0;
		count=b/x-a/x;
		if(a%x==0)count++;
		System.out.println(count);
	}
}
	