import java.util.Scanner;
import java.lang.Math;

public class p02380 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        double area = 0.5 * a * b * Math.sin(Math.toRadians(c));
        System.out.println(area);
        
        double length = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(c)));
        System.out.println(length);
        
        double height = b * Math.sin(Math.toRadians(c));
        System.out.println(height);
        
        scanner.close();
    }
}