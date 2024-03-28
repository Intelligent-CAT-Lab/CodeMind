import java.util.*;

public class p03874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = 512;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int val = (int) Math.pow(7, i) / (int) Math.pow(7 + i, 2);
            a[i] = val;
        }
        int cnt = 600 * 7;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
            int item = a[i];
            while (k >= item) {
                ans[i] += "L";
                k -= item;
            }
        }
        for (String item : ans) {
            System.out.print(item);
        }
    }
}