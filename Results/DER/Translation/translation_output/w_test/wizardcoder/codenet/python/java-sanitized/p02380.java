import java.util.Scanner;

public class p02380 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double sine = Math.sin(Math.toRadians(c));
        double cosine = Math.cos(Math.toRadians(c));
        double hypotenuse = Math.sqrt(a*a + b*b - 2*a*b*cosine);
        double area = 0.5*a*b*sine;
        double perimeter = a + b + hypotenuse;
        System.out.println(area);
        System.out.println(perimeter);
        System.out.println(b*sine);
    }
}