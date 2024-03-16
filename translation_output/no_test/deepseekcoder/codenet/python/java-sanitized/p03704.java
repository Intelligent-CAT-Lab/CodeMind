import java.util.Scanner;

public class p03704 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        long sum = 0;
        for (int i = 1; i <= 21; i++) {
            sum += f(D, i, 0) * (10 - i % 2 * 9);
        }
        System.out.println(sum);
    }

    private static long f(int d, int x, int y) {
        int n = (int) (Math.pow(10, x) * 9 + Math.pow(10, y));
        long sum = 0;
        for (int i = -9; i < 10; i++) {
            if (Math.abs(d + i * n) < n) {
                sum += f(d + i * n, x - 2, y + 1) * (10 - Math.abs(i) - (y < 1 ? 1 : 0));
            }
        }
        return d < 1 ? sum : 0;
    }
}