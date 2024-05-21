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
        double h = sc.nextDouble();
        double m = sc.nextDouble();
        double theta_h = 2.5 * Math.PI - ( 2 * Math.PI * ( ( h + ( m / 60 ) ) / 12 ) );
        double theta_m = 2.5 * Math.PI - ( 2 * Math.PI * ( m / 60 ) );
        double x_h = a * Math.cos(theta_h);
        double y_h = a * Math.sin(theta_h);
        double x_m = b * Math.cos(theta_m);
        double y_m = b * Math.sin(theta_m);
        System.out.println(Math.sqrt(Math.pow((x_h - x_m), 2) + Math.pow((y_h - y_m), 2)));
    }
}