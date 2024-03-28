import java.util.Scanner;
import java.lang.Math;

public class p00575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
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