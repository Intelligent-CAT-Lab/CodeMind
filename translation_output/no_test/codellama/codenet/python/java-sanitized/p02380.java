import java.util.Scanner;
import java.lang.Math;

public class p02380 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double area = 0.5 * a * b * Math.sin(Math.toRadians(c));
        double perimeter = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(c)));
        double height = b * Math.sin(Math.toRadians(c));
        System.out.println(area);
        System.out.println(perimeter);
        System.out.println(height);
    }
}