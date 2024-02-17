import java.util.*;

public class a {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[3];
        a[0] = in.nextInt();
        a[1] = in.nextInt();
        a[2] = in.nextInt();
        Arrays.sort(a);
        int max = 0;
        int d[] = new int[n + 1];
        Arrays.fill(d, -500);
        d[0] = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 3; j++) {
                if (i - a[j] >= 0 && d[i - a[j]] != -1) {
                    d[i] = Math.max(d[i], d[i - a[j]] + 1);
                }
            }
        }
        System.out.println(d[n]);
    }
}