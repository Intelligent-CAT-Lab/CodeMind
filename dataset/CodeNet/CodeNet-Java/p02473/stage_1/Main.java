

import java.math.BigInteger;
import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.next();		BigInteger a = new BigInteger(newVariable_0);
var newVariable_1 = sc.next();		BigInteger b = new BigInteger(newVariable_1);
		
		a = a.subtract(b);
		
		System.out.println(a);
	}

}

