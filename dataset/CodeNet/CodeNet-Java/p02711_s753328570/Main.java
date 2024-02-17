import java.util.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws Exception
	{
		// your code goes here
		BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
		String s=bu.readLine();
		int i,flag=0;
		for(i=0;i<3;i++)
		if(s.charAt(i)=='7') {flag=1; break;}
		if(flag==1) System.out.print("Yes");
		else System.out.print("No");
	}
}