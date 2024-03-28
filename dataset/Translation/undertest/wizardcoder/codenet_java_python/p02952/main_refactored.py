class main:
    import java.util.*;
    
    public class p02952
    {
    	public static void main(String args[])
    	{
    		Scanner sc=new Scanner(System.in);
    		int a,b,c=0;
    		a=sc.nextInt();
    		for(int i=1;i<=a;i++)
    		{
    			if(len(str(i))%2!= 0)
    			{c++;}
    		}
    		System.out.println(c);
    	}
    }