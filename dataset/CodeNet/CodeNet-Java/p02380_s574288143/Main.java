import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        System.out.println(0.5 * a * b * Math.sin(Math.toRadians(c)));
        System.out.println(a + b + Math.sqrt(a*a+b*b - (2 * (a * b * Math.cos(Math.toRadians(c))))));
        System.out.println(b * Math.sin(Math.toRadians(c)));
    }
}
