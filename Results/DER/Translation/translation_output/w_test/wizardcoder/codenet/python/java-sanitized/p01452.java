import java.util.*;

public class p01452 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, k;
        List<Integer> rr = new ArrayList<>();
        while (true) {
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();
            if (n == 0) break;
            rr.add(f(n, m, k));
        }
        for (int r : rr) {
            System.out.println(r);
        }
    }

    public static int f(int n, int m, int k) {
        int[] cm = new int[1000001];
        cm[0] = 1;
        for (int i = 1; i <= 1000000; i++) {
            cm[i] = (cm[i-1] * i) % 1000000007;
        }
        int r = 0;
        for (int i = 0; i <= k; i++) {
            int j = k - i;
            int mt = (int) ((Math.pow(i+j, n+m+k*2) * Math.pow(i, n+i*2) * Math.pow(j, m+j*2)) % 1000000007);
            int lk = (int) ((Math.pow(i+j, n+i*2) * Math.pow(i, i-1)) % 1000000007);
            int rk = (int) ((Math.pow(i+j, m+j*2) * Math.pow(j, j-1)) % 1000000007);
            r += mt * lk * rk;
            r %= 1000000007;
        }
        return r;
    }
}