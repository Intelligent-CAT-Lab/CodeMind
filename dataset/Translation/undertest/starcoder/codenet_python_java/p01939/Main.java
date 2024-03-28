import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    static int MOD = 1000000007;

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int s = 0;
        if(n == 1)
            s = m+1;
        else{
            s = (m+1)*((2*m+(n-1)*(-n+1))/(2*(n-1)));
            s *= 2;
            s -= (m+1);
        }

        System.out.println(s%MOD);
    }
}