import java.util.Scanner;

public class p03874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = 512;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.factorial(7 + i) / Math.factorial(i) / Math.factorial(7));
        }
        a = a.clone();
        a.reverse();
        int cnt = 600 * 7;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
            for (int j = 0; j < k / a[i]; j++) {
                ans[i] += "L";
            }
            k %= a[i];
        }
        ans = ans.clone();
        ans.reverse();
        System.out.println("".join(ans));
    }
}