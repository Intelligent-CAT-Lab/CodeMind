import java.util.Scanner;
import java.lang.Math;

public class p00575 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();

        int a = (int) Math.ceil(C / A);

        float s = 7 * A + B;
        int t = (int) Math.floor(C / s);
        float u = C - s * t;
        int v = (int) Math.ceil(u / A);

        int b;
        if (v <= 7) {
            b = 7 * t + v;
        } else {
            b = 7 * t + 7;
        }

        if (a > b) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }
    }
}