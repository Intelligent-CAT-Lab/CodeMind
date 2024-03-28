import java.util.Scanner;

public class p03362 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] primeNumbers = new int[2000];
        primeNumbers[0] = 2;
        for (int i = 3; i <= 2000; i++) {
            for (int j = 0; j < primeNumbers.length; j++) {
                if (primeNumbers[j] >= Math.sqrt(i) + 1) {
                    primeNumbers[j + 1] = i;
                    break;
                }
                if (i % primeNumbers[j] == 0) {
                    break;
                }
            }
        }

        int[] ans = new int[n];
        int count = 0;
        for (int i = 0; i < primeNumbers.length; i++) {
            if (primeNumbers[i] % 10 == 1) {
                ans[count++] = primeNumbers[i];
            }
            if (count == n) {
                break;
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}