import java.util.Scanner;

public class p02624 {
    public static void main(String[] args) {
        DSumOfDivisors solver = new DSumOfDivisors();
        Scanner input = new Scanner(System.in);
        solver.solve(input.nextInt());
    }

    public void solve(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i / 2) * (n / i) * (1 + n / i);
        }
        System.out.println(sum);
    }
}