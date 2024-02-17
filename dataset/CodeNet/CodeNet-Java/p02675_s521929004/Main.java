/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;



/* Name of the class has to be "Main" only if the class is public. */
public class Main
 
 
{
    static Scanner in = new Scanner(System.in);
   
    public static void solve()
    {
        int n=in.nextInt();
        
        int x=n%10;
        
        if(x==2 ||x==4 ||x==5 ||x==7 ||x==9)
        {
            System.out.println("hon");
        }
        else if(x==0 ||x==1 ||x==6 ||x==8 )
        {
            System.out.println("pon");
        }
        else
        {
            System.out.println("bon");
        }
        
    }
    

    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int t=1;
		//in.nextLine();
		
		while(t>0)
		{
		    
		    solve();
		    t--;
		}
		
		
	
	//	System.out.println(x);
	}
}
