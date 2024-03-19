import java.util.*;

public class p03048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R, G, B, n;
        n = sc.nextInt();
        R = sc.nextInt();
        G = sc.nextInt();
        B = sc.nextInt();
        int cnt = 0;
        for (int r = n / R; r >= 0; r--) {
            for (int g = (n - r * R) / G; g >= 0; g--) {
                int b = (n - r * R - g * G) / B;
                if (r * R + g * G + b * B == n) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}