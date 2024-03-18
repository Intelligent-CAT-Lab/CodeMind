import java.util.Scanner;

public class p02624 {

    public void solve(int n) {
        long sum = 0;
        for (int k = 1; k <= n; k++) {
            sum += k / 2 * (n / k) * (1 + n / k);
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DSumOfDivisors solver = new DSumOfDivisors();
        
        // Uncomment the following line if you want to read multiple test cases
        // int testCases = scanner.nextInt();
        // for (int tc = 0; tc < testCases; tc++) {
        //     int n = scanner.nextInt();
        //     solver.solve(n);
        // }
        
        int n = scanner.nextInt();
        solver.solve(n);
        
        scanner.close();
    }
}