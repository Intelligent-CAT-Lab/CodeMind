import java.util.Scanner;
import java.lang.Math;

public class p01997 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B;
        A = sc.nextDouble();
        B = sc.nextDouble();
        System.out.printf("%.10f", (4.0/3.0)*Math.PI*Math.pow(B, 3));
    }
}