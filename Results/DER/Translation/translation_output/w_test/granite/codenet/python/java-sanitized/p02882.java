import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double x = sc.nextDouble();
        double ans = 0;
        double h = x/(a*a);
        if(h>=(b/2)){
            double V = 2*(a*a*b-x)/(a*a*a);
            ans = Math.atan(V);
        }
        else{
            double V = a*(b*b)/(2*x);
            ans = Math.atan(V);
        }
        System.out.println(ans);
    }
}