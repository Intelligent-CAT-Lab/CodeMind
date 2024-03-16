import java.util.Scanner;
import static java.lang.Math.*;

public class p02400 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double s = pow(r, 2, PI);
        double l = 2 * pow(r, PI);
        System.out.printf("%.5f %.5f%n", s, l);
    }
}