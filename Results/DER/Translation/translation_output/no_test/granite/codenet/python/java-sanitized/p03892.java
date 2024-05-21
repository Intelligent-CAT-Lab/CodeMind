import java.util.*;

public class p03892 {
    public static int gcd(int a, int b) {
        return b == 0? a : gcd(b, a % b);
    }

    public static int main() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
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