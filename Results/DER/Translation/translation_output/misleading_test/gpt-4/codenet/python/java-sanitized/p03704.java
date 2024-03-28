import java.util.Scanner;

public class p03704 {

    static int f(int d, int x, int y) {
        int n = Integer.parseInt("9".repeat(x) + "0".repeat(y));
        if (x < 1) return d == 0 ? 1 : 0;
        int sum = 0;
        for (int i = -9; i <= 9; i++) {
            if (Math.abs(d + i * n) < n) {
                sum += f(d + i * n, x - 2, y + 1) * (10 - Math.abs(i) - (y < 1 ? 1 : 0));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int totalSum = 0;
        for (int i = 1; i <= 20; i++) {
            totalSum += f(D, i, 0) * (10 - i % 2 * 9);
        }
        System.out.println(totalSum);
        scanner.close();
    }
}