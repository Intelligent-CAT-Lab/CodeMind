import java.util.Scanner;

public class p03129 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading two integers N and K
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        // Calculate half of N rounded up
        int halfN = (N + 1) / 2;

        // Check if K is less than or equal to halfN
        if (K <= halfN) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}