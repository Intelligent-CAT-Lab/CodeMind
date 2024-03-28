import java.util.Scanner;

public class p02380 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double result1 = 0.5*a*b*Math.sin(Math.toRadians(c));
        double result2 = a+b+(a*a+b*b-2*a*b*Math.cos(Math.toRadians(c)))**0.5;
        double result3 = b*Math.sin(Math.toRadians(c));
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}