import java.util.*;
public class p02380 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(0.5*a*b*Math.sin(Math.toRadians(c)));
        System.out.println(a+b+(a*a+b*b-2*a*b*Math.cos(Math.toRadians(c)))**0.5);
        System.out.println(b*Math.sin(Math.toRadians(c)));
    }
}