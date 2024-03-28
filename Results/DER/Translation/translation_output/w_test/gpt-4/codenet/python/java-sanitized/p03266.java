import java.util.Scanner;

public class p03266 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        int ans = 0;

        if (k % 2 == 1) {
            ans = (int) Math.pow(n / k, 3);
        } else {
            ans = (int) Math.pow(n / k, 3) + (int) Math.pow((n + k / 2) / k, 3);
        }

        System.out.println(ans);
    }
    
    // In the original Python code, gcd is imported but never used, so there's no need to translate that part.
}