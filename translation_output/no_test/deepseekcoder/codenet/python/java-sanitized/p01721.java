import java.util.Scanner;

public class p01721 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int v = scanner.nextInt();
        int t = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();
        int ans = 0;
        for (int a : new int[]{p, 2*w-p}) {
            for (int b : new int[]{q, 2*h-q}) {
                ans += count(w, h, v, t, x, y, a, b);
            }
        }
        System.out.println(ans);
    }

    private static int count(int w, int h, int v, int t, int x, int y, int a, int b) {
        int res = 0;
        int C = v*t;
        int ky = 0;
        while (true) {
            int B = b + 2*h*ky;
            double D = Math.pow(C, 2) - Math.pow(B - y, 2);
            if (D < 0) {
                break;
            }
            double SQ = Math.sqrt(D) + 1e-7;
            int k0 = (int) Math.floor((x - a - SQ) / (2*w));
            int k1 = (int) Math.floor((x - a + SQ) / (2*w));
            res += Math.max(k1 - k0, 0);
            ky += 1;
        }
        ky = -1;
        while (true) {
            int B = b + 2*h*ky;
            double D = Math.pow(C, 2) - Math.pow(B - y, 2);
            if (D < 0) {
                break;
            }
            double SQ = Math.sqrt(D) + 1e-7;
            int k0 = (int) Math.floor((x - a - SQ) / (2*w));
            int k1 = (int) Math.floor((x - a + SQ) / (2*w));
            res += Math.max(k1 - k0, 0);
            ky -= 1;
        }
        return res;
    }
}