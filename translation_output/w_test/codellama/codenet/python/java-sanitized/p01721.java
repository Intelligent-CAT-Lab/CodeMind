import java.util.Scanner;

public class p01721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int v = sc.nextInt();
        int t = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();

        int ans = 0;
        for (int a = p; a <= 2*w-p; a++) {
            for (int b = q; b <= 2*h-q; b++) {
                ans += count(a, b);
            }
        }
        System.out.println(ans);
    }

    private static int count(int a, int b) {
        int res = 0;
        int C = v*t;
        int ky = 0;
        while (true) {
            int B = b + 2*h*ky;
            int D = C*C - (B - y)*(B - y);
            if (D < 0) {
                break;
            }
            double SQ = Math.sqrt(D) + 1e-7;
            int k0 = (int)((x - a - SQ) / (2*w));
            int k1 = (int)((x - a + SQ) / (2*w));
            res += Math.max(k1 - k0, 0);
            ky += 1;
        }
        ky = -1;
        while (true) {
            int B = b + 2*h*ky;
            int D = C*C - (B - y)*(B - y);
            if (D < 0) {
                break;
            }
            double SQ = Math.sqrt(D) + 1e-7;
            int k0 = (int)((x - a - SQ) / (2*w));
            int k1 = (int)((x - a + SQ) / (2*w));
            res += Math.max(k1 - k0, 0);
            ky -= 1;
        }
        return res;
    }
}