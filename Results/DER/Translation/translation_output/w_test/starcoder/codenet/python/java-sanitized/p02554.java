import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long ant=1,bnt=1,cnt=1;
		for(int i=0;i<n;i++)
		{
			ant=(ant*10)%1000000007;
			bnt=(bnt*9)%1000000007;
			cnt=(cnt*8)%1000000007;
		}
		long ans=(ant-(bnt*2-cnt))%1000000007;
		if(ans>=0)
			System.out.println(ans);
		else
			System.out.println(1000000007+ans);
	}
}