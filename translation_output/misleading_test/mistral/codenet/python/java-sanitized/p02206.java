import java.util.*;

public class p02206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
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

    public static boolean ok(int m) {
        int s = 0;
        int cnt = 0;
        while (m != 0) {
            s += m;
            cnt += 1;
            if (s > k) {
                return false;
            }
            m >>= 1;
        }
        return true;
    }
}