import java.util.Scanner;

public class p03681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int diff = Math.abs(N-M);
        long result;
        if (diff > 1) {
            result = 0;
        } else if (diff == 0) {
            result = factorial(N)*factorial(M)*2 % (int)Math.pow(10,9)+7;
        } else {
            result = factorial(N)*factorial(M) % (int)Math.pow(10,9)+7;
        }
        System.out.println(result);
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}