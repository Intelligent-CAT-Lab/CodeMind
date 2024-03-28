import java.util.Scanner;

public class p03281 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(countNumbersWithEightDivisors(n));
    }

    private static int countDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    private static int countNumbersWithEightDivisors(int n) {
        int count = 0;
        for (int j = 1; j <= n; j++) {
            if (j % 2 == 0) {
                continue;
            }
            if (countDivisors(j) == 8) {
                count++;
            }
        }
        return count;
    }
}