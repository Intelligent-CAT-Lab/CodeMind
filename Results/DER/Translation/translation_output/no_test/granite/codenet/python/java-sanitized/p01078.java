import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		double PI = 3.1415926535897932384626433832795;
		int N = sc.nextInt();
		int K = sc.nextInt();
		double area = N*Math.sin(PI/N)*Math.cos(K*PI/N)/Math.cos((K-1)*PI/N);
		System.out.printf("%.8f\n", area);
	}
}