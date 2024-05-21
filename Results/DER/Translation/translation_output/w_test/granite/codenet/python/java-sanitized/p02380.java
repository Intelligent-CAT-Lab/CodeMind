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
        double c = sc.nextDouble();
        System.out.println(0.5*a*b*Math.sin(Math.toRadians(c)));
        System.out.println(a+b+(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(c)))*1.0);
        System.out.println(b*Math.sin(Math.toRadians(c)));
    }
}