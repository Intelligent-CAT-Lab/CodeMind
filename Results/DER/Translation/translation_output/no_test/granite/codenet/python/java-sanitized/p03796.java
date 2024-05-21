import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long fact = 1;
		for(int i = 1; i <= n; i++){
		    fact = (fact * i) % 1000000007;
		}
		System.out.println(fact);
	}
}