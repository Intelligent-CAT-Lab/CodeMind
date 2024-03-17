import java.util.Scanner;

public class p02150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, x;
        a = scanner.nextInt();
        b = scanner.nextInt();
        x = scanner.nextInt();

        int d = a - b;
        int n = Math.max(0, (x - b) // d);
        long ans = x + n * b;
        System.out.println(ans % 1000000007);
    }
}