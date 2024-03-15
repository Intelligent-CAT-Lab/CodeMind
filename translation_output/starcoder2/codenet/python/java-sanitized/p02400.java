import java.util.Scanner;
import java.lang.Math;

public class p02400 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double s = r * r * Math.PI;
        double l = r * 2 * Math.PI;
        System.out.printf("%.5f %.5f", s, l);
    }
}

/2019-09-16/README.md
# 2019-09-16