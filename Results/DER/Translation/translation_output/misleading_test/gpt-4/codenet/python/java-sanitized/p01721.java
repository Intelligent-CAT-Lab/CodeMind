import java.util.Scanner;

public class p01721 {
    
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int w = inputScanner.nextInt();
        int h = inputScanner.nextInt();
        int v = inputScanner.nextInt();
        int t = inputScanner.nextInt();
        int x = inputScanner.nextInt();
        int y = inputScanner.nextInt();
        int p = inputScanner.nextInt();
        int q = inputScanner.nextInt();
        System.out.println(solve(w, h, v, t, x, y, p, q));
        inputScanner.close();
    }

    private static int solve(int w, int h, int v, int t, int x, int y, int p, int q) {
        int ans = 0;
        int[] aa = {p, 2*w - p};
        int[] bb = {q, 2*h - q};
        for (int a : aa) {
            for (int b : bb) {
                ans += count(w, h, v, t, x, y, a, b);
            }
        }
        return ans;
    }

    private static int count(int w, int h, int v, int t, int x, int y, int a, int b) {
        int res = 0;
        double C = v * t;
        int ky = 0;
        while (true) {
            double B = b + 2 * h * ky;
            double D = C * C - (B - y) * (B - y);
            if (D < 0) {
                break;
            }
            double SQ = Math.sqrt(D) + 1e-7;
            int k0 = (int) ((x - a - SQ) / (2 * w));
            int k1 = (int) ((x - a + SQ) / (2 * w));
            res += Math.max(k1 - k0, 0);
            ky++;
        }
        ky = -1;
        while (true) {
            double B = b + 2 * h * ky;
            double D = C * C - (B - y) * (B - y);
            if (D < 0) {
                break;
            }
            double SQ = Math.sqrt(D) + 1e-7;
            int k0 = (int) ((x - a - SQ) / (2 * w));
            int k1 = (int) ((x - a + SQ) / (2 * w));
            res += Math.max(k1 - k0, 0);
            ky--;
        }
        return res;
    }
}