import java.util.Scanner;

public class p01751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int t = 0;
        for (int loop = 0; loop < 61; loop++) {
            if (t % 60 <= c && c <= t % 60 + a) {
                System.out.println((t / 60 * 60 + c));
                break;
            }
            t += a + b;
        } else {
            System.out.println(-1);
        }
    }
}