import java.util.Scanner;

public class p00575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        float a = (float) Math.ceil(C / A);

        float s = 7 * A + B;
        float t = (float) Math.floor(C / s);
        float u = C - s * t;
        float v = (float) Math.ceil(u / A);

        float b;
        if (v <= 7) {
            b = 7 * t + v;
        } else {
            b = 7 * t + 7;
        }

        if (a > b) {
            System.out.println((int) b);
        } else {
            System.out.println((int) a);
        }
    }
}