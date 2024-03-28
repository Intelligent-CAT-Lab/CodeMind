import java.util.Scanner;

public class p03817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = 0;
        int[] qr = divmod(x, 11);
        ans += 2 * qr[0];
        qr = divmod(qr[1], 6);
        ans += qr[0];
        if (qr[1] > 0) {
            ans += 1;
        }
        System.out.println(ans);
    }

    private static int[] divmod(int x, int y) {
        int q = x / y;
        int r = x % y;
        return new int[]{q, r};
    }
}