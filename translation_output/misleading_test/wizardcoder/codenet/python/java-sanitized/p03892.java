import java.util.*;

public class p03892 {
    public static int gcd(int a, int b) {
        return b == 0? a : gcd(b, a % b);
    }

    public static int main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int h = Math.abs(b - d);
        int w = Math.abs(c - a);
        if (h == 0 || w == 0) {
            return 0;
        }
        int m = gcd(Math.max(h, w), Math.min(h, w));
        return h + w - m;
    }

    public static void main(String[] args) {
        System.out.println(main());
    }
}