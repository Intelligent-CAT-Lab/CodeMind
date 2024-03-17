import java.util.Scanner;

public class atcoder_ABC149_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        while (true) {
            if (isPrime(N)) {
                System.out.println(N);
                break;
            }
            N++;
        }
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int x = 2; x <= Math.sqrt(n) + 1; x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }
}