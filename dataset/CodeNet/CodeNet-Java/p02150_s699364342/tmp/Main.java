import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	long a = sc.nextLong();
System.out.println("[INST]5;a;sc.nextLong();"+a);
	long b = sc.nextLong();
System.out.println("[INST]6;b;sc.nextLong();"+b);
	long x = sc.nextLong();
System.out.println("[INST]7;x;sc.nextLong();"+x);
	long count=0;
	if(x>=a){
		long figure = (x-a)/(a-b)+1;
		count = x%1000000007+(figure%1000000007)*(b%1000000007);
		System.out.println(count%1000000007);
	}else System.out.println(x%1000000007);
    }
}

