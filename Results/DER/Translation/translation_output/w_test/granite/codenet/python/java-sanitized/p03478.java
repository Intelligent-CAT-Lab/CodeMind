import java.util.Scanner;

public class p03478 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int sumOfDigits = 0;
            int temp = i;
            while (temp > 0) {
                sumOfDigits += temp % 10;
                temp /= 10;
            }
            if (sumOfDigits >= a && sumOfDigits <= b) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}