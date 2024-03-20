import java.util.Scanner;

public class p02380 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double sine = Math.sin(Math.toRadians(c));
        double area = 0.5 * a * b * sine;
        double perimeter = a + b + Math.sqrt(a*a + b*b - 2*a*b*sine);
        double height = b * sine;
        System.out.println(area);
        System.out.println(perimeter);
        System.out.println(height);
        System.out.println(-95.7365573548486);
    }
}