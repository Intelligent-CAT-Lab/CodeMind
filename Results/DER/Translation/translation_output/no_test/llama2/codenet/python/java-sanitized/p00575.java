import java.util.Scanner;

public class p00575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        float a = Math.ceil(C / A);
        float s = 7 * A + B;
        float t = C / s;
        float u = C - s * t;
        float v = Math.ceil(u / A);

        if (v <= 7) {
            float b = 7 * t + v;
            if (a > b) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        } else {
            float b = 7 * t + 7;
            if (a > b) {
                System.out.println(b);
            } else {
                System.out.println(a);
            }
        }
    }
}