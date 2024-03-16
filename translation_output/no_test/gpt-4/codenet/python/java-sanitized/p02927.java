import java.util.Scanner;

public class p02927 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        int ans = 0;

        for (int i = 22; i <= d; i++) {
            int d0 = i % 10;
            int d1 = i / 10;

            if (d0 == 1 || d0 == 0) {
                continue;
            }

            if (m >= d0 * d1) {
                ans++;
                // System.out.println(i); // Uncomment to print the value of 'i'
            }
        }

        System.out.println(ans);
    }
}