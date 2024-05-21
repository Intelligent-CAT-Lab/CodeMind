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
        double h = x/Math.pow(a,2);
        if(h>=b/2){
            double V = 2*((Math.pow(a,2))*b - x)/Math.pow(a,3);
            ans = Math.toDegrees(Math.atan(V));
        }
        else{
            double V = a*(Math.pow(b,2))/(2*x);
            ans = Math.toDegrees(Math.atan(V));
        }
        System.out.println(ans);
    }
}