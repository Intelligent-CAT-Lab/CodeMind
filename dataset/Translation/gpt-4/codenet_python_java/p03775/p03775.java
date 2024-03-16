import java.util.Scanner;

public class p03775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = Integer.MAX_VALUE;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result = Math.min(result, Math.max(Integer.toString(i).length(), Integer.toString(n / i).length()));
            }
        }
        System.out.println(result);

        scanner.close();
    }
}