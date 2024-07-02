import java.util.*;

public class Main {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
System.out.println("[INST]7;n;sc.nextLong();"+n);
		long x=0;
		long i=1;
		while(x<n)
		{
			x+=i;
			i++;
		}
		System.out.println(i-1);
	}
}
