import java.util.Scanner;
import java.lang.Math;

public class p02380 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        double result1 = 0.5 * a * b * Math.sin(Math.toRadians(c));
        double result2 = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(c)));
        double result3 = b * Math.sin(Math.toRadians(c));
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}