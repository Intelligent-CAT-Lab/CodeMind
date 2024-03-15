import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int MOD = 1000000007;
        int ans = 0;
        if(L > R) ans = 0;
        else if(L == 1) ans = (1 + solve(2, R)) % MOD;
        else ans = (solve(L/2,(R-1)/2) + solve((L+1)/2,R/2) + solve((L+1)/2,(R-1)/2)) % MOD;
        System.out.println(ans);
    }
}