import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gcd = gcd(a,b);
		System.out.println(a+b-gcd+1);
	}
	public static int gcd(int a, int b) {
	    if (b == 0)
	        return a;
	    return gcd(b, a % b);
	}
}