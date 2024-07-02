import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
System.out.println("[INST]4;a;sc.nextLong();"+a);
		long b=sc.nextLong();
System.out.println("[INST]5;b;sc.nextLong();"+b);
		long n=sc.nextLong();
System.out.println("[INST]6;n;sc.nextLong();"+n);
		if(n>=b){
			System.out.println(a*(b-1)/b);
		}else{
			System.out.println(a*n/b);
		}
	}
}