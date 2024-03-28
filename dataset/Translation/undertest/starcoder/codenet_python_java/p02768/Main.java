import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int MOD = 1000000007;
        long X = (long)Math.pow(2,n)%MOD;
        long A = 1;
        long B = 1;
        for(int i=0;i<a;i++) A = (A*(n-i))%MOD;
        for(int i=0;i<b;i++) B = (B*(n-i))%MOD;
        System.out.println((X-A-B+MOD)%MOD);
    }
}