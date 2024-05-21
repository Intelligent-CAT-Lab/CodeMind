import java.util.Scanner;

public class p03775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int result = Integer.MAX_VALUE;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int length = Math.max(String.valueOf(i).length(), String.valueOf(n / i).length());
                result = Math.min(result, length);
            }
        }
        System.out.println(result);
    }
}