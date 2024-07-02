import java.util.*;
public class Main{
	public static void main(String[]i){
		long s=Long.parseLong(new Scanner(System.in).next());
System.out.println("[INST]3;s;Long.parseLong(new Scanner(System.in).next());"+s);
System.out.println("[INST]3;None;new Scanner(System.in).next();"+new Scanner(System.in).next());
		int a=1000000000;
		System.out.println("0 0 "+a+" 1 "+(a-s%a)%a+" "+((s-1)/a+1));
	}
}
