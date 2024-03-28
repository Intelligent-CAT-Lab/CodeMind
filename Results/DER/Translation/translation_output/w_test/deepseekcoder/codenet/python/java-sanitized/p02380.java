import java.util.Scanner;
import java.lang.Math;

public class p02380 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        double radians = Math.toRadians(c);
        System.out.printf("%.8f\n", 0.5*a*b*Math.sin(radians));
        System.out.printf("%.8f\n", a+b+Math.sqrt(a*a+b*b-2*a*b*Math.cos(radians)));
        System.out.printf("%.8f\n", b*Math.sin(radians));
    }
}