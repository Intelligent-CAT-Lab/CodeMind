import java.io.*;
import java.util.*;
class Main
{

    static int gcd=1;
    static int get_GCD(int a, int b, int c){
        int minimum=(Math.min(a,b)==Math.min(a,c))? a: Math.min(b,c);
        for(int i=1;i<=minimum;i++)
        {
            if (a%i==0 && b%i==0 && c%i==0)
                gcd=i;
        }
        return gcd;
    }
        public static void main(String []args)throws IOException
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int n=Integer.valueOf(br.readLine());
            int sum=0;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                    {
                    for(int k=1;k<=n;k++)
                          sum+=get_GCD(i,j,k);
                        }
                    }
                    System.out.println(sum);           
                        
        }
    }
