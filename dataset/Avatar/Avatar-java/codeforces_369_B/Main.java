import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int l = scan.nextInt();
        int r = scan.nextInt();
        int sAll = scan.nextInt();
        int sk = scan.nextInt();
        int[] ans = getPoints(n, k, l, r, sAll, sk);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] getPoints(int n, int k, int l, int r, int sAll, int sk) {
        int[] ans = new int[n];
        Arrays.fill(ans, l);
        sAll -= sk + (n - k) * l;
        sk -= k * l;
        while (sk > 0) {
            int idx = n - 1;
            while (sk > 0 && idx >= n - k) {
                ans[idx--]++;
                sk--;
            }
        }
        while (sAll > 0) {
            int idx = 0;
            while (sAll > 0 && idx < n - k) {
                ans[idx++]++;
                sAll--;
            }
        }
        return ans;
    }
}