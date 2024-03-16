import java.util.Scanner;

public class p02150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        scanner.close();

        int d = a - b;
        int n = Math.max(0, (x - b) / d);
        long ans = (long)x + (long)n * (long)b;

        System.out.println(ans % 1000000007);
    }
}