public class p03892 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 3;
        int d = 4;

        int h = Math.abs(b - d);
        int w = Math.abs(c - a);

        if (h == 0 || w == 0) {
            return 0;
        }

        int m = gcd(Math.max(h, w), Math.min(h, w));
        return h + w - m;
    }

    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}