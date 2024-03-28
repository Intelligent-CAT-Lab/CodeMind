import java.util.Scanner;

public class p02927 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, d;
        m = sc.nextInt();
        d = sc.nextInt();
        int ans = 0;
        for (int i = 22; i <= d; i++) {
            int d0 = i % 10;
            int d1 = i / 10;
            if (d0 == 1 || d0 == 0) {
                continue;
            }
            if (m >= d0 * d1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}