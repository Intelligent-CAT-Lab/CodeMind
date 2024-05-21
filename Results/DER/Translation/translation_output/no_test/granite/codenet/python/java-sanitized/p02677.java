import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double H = sc.nextDouble();
		double M = sc.nextDouble();
		double l = H*360/12 + M*30/60;
		double s = M*360/60;
		double ang = Math.abs(l-s);
		double c = Math.pow(A,2) + Math.pow(B,2) -2*B*A*Math.cos(Math.toRadians(ang));
		System.out.println(Math.sqrt(c));
	}
}