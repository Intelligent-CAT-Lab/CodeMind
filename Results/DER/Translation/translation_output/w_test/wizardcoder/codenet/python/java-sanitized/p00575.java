import java.util.Scanner;

public class p00575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        float a = (float) Math.ceil(C / A);

        float s = 7 * A + B;
        int t = (int) Math.floor(C / s);
        //sã¯1é±éã«ããããã³ã¤ã³ã®ææ°
        float u = C - s * t;
        //uã¯ç«¯æ°
        float v = (float) Math.ceil(u / A);

        int b;
        if (v <= 7) {
            b = 7 * t + (int) v;
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