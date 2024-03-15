import java.util.Scanner;

public class p01751 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        int t = 0;
        for (int i = 0; i < 61; i++) {
            if (t % 60 <= c && t % 60 + a <= c) {
                System.out.println(t / 60 * 60 + c);
                break;
            }
            t += a + b;
        }
        if (t % 60 > c) {
            System.out.println(-1);
        }
    }
}