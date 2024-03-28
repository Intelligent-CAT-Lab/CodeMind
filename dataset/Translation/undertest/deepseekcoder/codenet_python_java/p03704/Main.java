import java.util.*;

public class p03704 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += f(D, i, 0) * (10 - i % 2 * 9);
        }
        System.out.println(sum);
    }

    private static long f(int d, int x, int y) {
        long n = (long) Math.pow(10, x) * 9 + (long) Math.pow(10, y);
        long sum = 0;
        for (int i = -9; i < 10; i++) {
            if (Math.abs(d + i * (int) n) < n) {
                sum += f(d + i * (int) n, x - 2, y + 1) * (10 - Math.abs(i) - (y < 1 ? 1 : 0));
            }
        }
        return d < 1 ? sum : 0;
    }
}