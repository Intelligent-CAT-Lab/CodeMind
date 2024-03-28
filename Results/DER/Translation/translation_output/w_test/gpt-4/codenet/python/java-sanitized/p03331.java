import java.util.Scanner;

public class p03331 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < N; i++) {
            ans = Math.min(ans, sumOfDigits(i) + sumOfDigits(N - i));
        }

        System.out.println(ans);
    }

    private static int sumOfDigits(int number) {
        int total = 0;
        while (number > 0) {
            total += number % 10;
            number /= 10;
        }
        return total;
    }
}