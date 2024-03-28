import java.util.Scanner;

public class p00575 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        int a = (int) Math.ceil(C / A);

        int s = 7 * (int) A + (int) B;
        int t = (int) C / s;
        int u = (int) C - s * t;
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