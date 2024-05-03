import java.util.Scanner;

public class p02624 {
    public void solve() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println((int) (sum(k/2.0 * (n/k) * (1 + n/k) for k in range(1, n + 1))));
    }

    public static double sum(double... values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        DSumOfDivisors solver = new DSumOfDivisors();
        solver.solve();
    }
}