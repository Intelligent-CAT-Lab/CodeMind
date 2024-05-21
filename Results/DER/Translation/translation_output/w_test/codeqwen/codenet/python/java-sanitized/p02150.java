import java.util.Scanner;

public class p02150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();

        int d = a - b;
        int n = (int) Math.max(0, (x - b) / (double) d);
        int ans = x + n * b;
        System.out.println(ans % 1000000007);
    }
}