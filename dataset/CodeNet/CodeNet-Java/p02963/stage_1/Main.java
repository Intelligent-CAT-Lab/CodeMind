import java.util.*;
public class Main{
	public static void main(String[]i){
var newVariable_0 = new Scanner(System.in).next();		long s=Long.parseLong(newVariable_0);
		int a=1000000000;
		System.out.println("0 0 "+a+" 1 "+(a-s%a)%a+" "+((s-1)/a+1));
	}
}
