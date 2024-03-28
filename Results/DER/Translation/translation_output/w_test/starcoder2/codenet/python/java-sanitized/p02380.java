import java.util.Scanner;
import java.lang.Math;

public class p02380 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(0.5*a*b*Math.sin(Math.toRadians(c)));
        System.out.println(a+b+(Math.pow(a,2)+Math.pow(b,2)-2*a*b*Math.cos(Math.toRadians(c))));
        System.out.println(b*Math.sin(Math.toRadians(c)));
    }
}