import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
System.out.println("[INST]7;a;sc.nextDouble();"+a);
        b = sc.nextDouble();
System.out.println("[INST]8;b;sc.nextDouble();"+b);
        c = sc.nextDouble();
System.out.println("[INST]9;c;sc.nextDouble();"+c);
        System.out.println(0.5 * a * b * Math.sin(Math.toRadians(c)));
        System.out.println(a + b + Math.sqrt(a*a+b*b - (2 * (a * b * Math.cos(Math.toRadians(c))))));
        System.out.println(b * Math.sin(Math.toRadians(c)));
    }
}
