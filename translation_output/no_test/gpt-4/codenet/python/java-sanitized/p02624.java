import java.util.Scanner;

public class p02624 {

    public void solve(int tc) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long sum = 0;
        for (int k = 1; k <= n; k++) {
            sum += k / 2L * (n / k) * (1 + n / k);
        }

        System.out.println(sum);
        scanner.close();
    }

    //