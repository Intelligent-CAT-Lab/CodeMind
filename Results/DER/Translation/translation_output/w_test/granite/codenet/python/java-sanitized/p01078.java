import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		double ans = n * Math.sin(Math.PI / n) * Math.cos(k * Math.PI / n) / Math.cos((k - 1) * Math.PI / n);
		System.out.printf("%.10f\n", ans);
	}
}