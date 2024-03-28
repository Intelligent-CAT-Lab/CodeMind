import java.util.Scanner;

public class p03775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] result = new int[(int) Math.sqrt(n) + 1];
        for (int i = 1; i < (int) Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                result[i] = Math.max(String.valueOf(i).length(), String.valueOf(n / i).length());
            }
        }

        int min = Integer.MAX_VALUE;
        for (int length : result) {
            if (length > 0) {
                min = Math.min(min, length);
            }
        }

        System.out.println(min);
    }
}