import java.util.Scanner;

public class p03796 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = factorial(n);
        System.out.println(result % 1000000007);
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = (result * i) % 1000000007;
        }
        return result;
    }
}