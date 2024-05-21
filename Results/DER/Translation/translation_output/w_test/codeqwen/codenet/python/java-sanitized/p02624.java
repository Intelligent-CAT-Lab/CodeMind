import java.util.Scanner;

public class p02624 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        return (int) (sum(n, 1) - 1);
    }

    public static double sum(int n, int k) {
        if (k > n) {
            return 0;
        }
        return k + sum(n, k + 1) + (n / k) * (k + 1);
    }
}