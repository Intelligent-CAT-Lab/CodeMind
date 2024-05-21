import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

public class p00575 {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        double A = in.nextDouble();
        double B = in.nextDouble();
        double C = in.nextDouble();
        double a = Math.ceil(C/A);
        double s = 7*A+B;
        double t = C/s;
        double u = C-s*t;
        double v = Math.ceil(u/A);
        double b;
        if(v<=7){
            b = 7*t+v;
        }else{
            b = 7*t+7;
        }
        if(a>b){
            System.out.println((int)b);
        }else{
            System.out.println((int)a);
        }
    }
}