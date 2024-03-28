import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int lcm = (c*d)/gcd(c,d);
        int ans = b-a+1 - ( b/c-(a-1)/c + b/d-(a-1)/d - ( b/lcm - (a-1)/lcm ) );
        System.out.println(ans);
    }
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}