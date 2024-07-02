

import java.math.BigInteger;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
System.out.println("[INST]11;None;sc.next();"+sc.next());
		BigInteger b = new BigInteger(sc.next());
System.out.println("[INST]12;None;sc.next();"+sc.next());
		
		a = a.subtract(b);
System.out.println("[INST]14;a;a.subtract(b);"+a);
		
		System.out.println(a);
	}

}

