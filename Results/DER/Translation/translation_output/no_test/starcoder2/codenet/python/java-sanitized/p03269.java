import java.util.*;

public class p03269 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int d = 0;
        while (Math.pow(2, d) <= l) {
            d++;
        }
        d--;
        int n = d + 1;
        int m = 2 * d;
        ArrayList<int[]> ans = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            ans.add(new int[]{i, i + 1, 0});
            ans.add(new int[]{i, i + 1, (int) Math.pow(2, i - 1)});
        }
        while (l > Math.pow(2, d)) {
            for (int i = n - 1; i > 0; i--) {
                if (l - Math.pow(2, i - 1) > Math.pow(2, d) - 1) {
                    ans.add(new int[]{i, n, (int) (l - Math.pow(2, i - 1))});
                    m++;
                    l -= Math.pow(2, i - 1);
                    break;
                }
            }
        }
        System.out.println(n + " " + m);
        for (int[] a : ans) {
            System.out.println(a[0] + " " + a[1] + " " + a[2]);
        }
    }
}