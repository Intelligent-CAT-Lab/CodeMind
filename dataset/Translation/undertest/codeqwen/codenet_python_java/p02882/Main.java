import java.util.Scanner;
import java.lang.Math;

public class p02882 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);

        double h = (double) x / a * a;

        double V;
        if (h >= b / 2) {
            V = 2 * ((a * a) * b - x) / (double) a * a * a;
        } else {
            V = a * (b * b) / (2 * x);
        }

        double ans = Math.toDegrees(Math.atan(V));
        System.out.println(ans);
    }
}