import java.util.Scanner;

public class p02206 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int l = 0;
        int r = k + 1;
        while (l + 1 < r) {
            int m = (l + r) / 2;
            if (ok(m)) {
                l = m;
            } else {
                r = m;
            }
        }
        System.out.println(l);
    }

    private static boolean ok(int m) {
        int s = 0;
        int cnt = 0;
        while (m > 0) {
            s += m;
            cnt++;
            if (s > k) {
                return false;
            }
            if (cnt == n) {
                break;
            }
            m >>= 1;
        }
        return true;
    }
}