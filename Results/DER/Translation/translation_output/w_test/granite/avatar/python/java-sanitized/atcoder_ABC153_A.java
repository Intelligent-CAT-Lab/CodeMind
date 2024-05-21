import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int a = sc.nextInt();
		System.out.println((int)Math.ceil((double)h/a));
	}
}