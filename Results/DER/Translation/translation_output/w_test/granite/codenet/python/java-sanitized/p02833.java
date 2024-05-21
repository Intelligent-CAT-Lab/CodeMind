import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int div=10;
		    int tot=0;
		    if(n%2==1){
		        System.out.println(0);
		    }
		    else{
		        while(n>=div){
		            // System.out.println(n//div);
		            tot+=(n/div);
		            div*=5;
		        }
		        System.out.println(tot);
		    }
		}
	}
}