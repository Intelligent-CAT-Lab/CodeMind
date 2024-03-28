import java.util.Scanner;

public class p02398 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int ans = 0;

        for (int i = a; i <= b; i++) {
            if (c % i == 0) {
                ans++;
            }
        }

        System.out.println(ans);
        scanner.close();
    }
}