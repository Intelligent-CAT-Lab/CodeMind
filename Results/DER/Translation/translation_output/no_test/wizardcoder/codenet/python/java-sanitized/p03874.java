import java.util.*;

public class p03874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int n = 512;
        int pattern = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int val = (int) Math.factorial(7 + i) / (int) Math.factorial(i) / (int) Math.factorial(7);
            a[i] = val;
        }
        Arrays.sort(a);
        Collections.reverse(Arrays.asList(a));

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
        Arrays.sort(ans);
        System.out.println(Arrays.toString(ans));
    }
}