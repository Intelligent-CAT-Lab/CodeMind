import java.util.Scanner;

public class p03775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = Integer.MAX_VALUE; // To store the minimum of the maximum lengths
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int length1 = String.valueOf(i).length();
                int length2 = String.valueOf(n / i).length();
                int maxLength = Math.max(length1, length2);
                result = Math.min(result, maxLength);
            }
        }
        
        System.out.println(result);
        scanner.close();
    }
}