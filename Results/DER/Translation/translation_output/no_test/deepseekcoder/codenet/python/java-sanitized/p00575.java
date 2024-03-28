import java.util.Scanner;
import java.lang.Math;

public class p00575 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float A = scanner.nextFloat();
        float B = scanner.nextFloat();
        float C = scanner.nextFloat();

        float a = (float) Math.ceil(C / A);

        float s = 7 * A + B;
        float t = (float) (C / s);
        //sã¯1é±éã«ããããã³ã¤ã³ã®ææ°
        float u = C - s * t;
        //uã¯ç«¯æ°
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