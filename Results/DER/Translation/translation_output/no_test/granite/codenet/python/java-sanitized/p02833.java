import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int term=1;term<=t;term++){
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