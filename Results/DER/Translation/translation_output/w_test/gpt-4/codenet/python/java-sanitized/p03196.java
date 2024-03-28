import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03196 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        List<int[]> l = factorization(p);
        int ans = 1;
        for (int[] aL : l) {
            if (aL[1] >= n) {
                ans *= Math.pow(aL[0], aL[1] / n);
            }
        }
        System.out.println(ans);
    }

    private static List<int[]> factorization(int n) {
        List<int[]> arr = new ArrayList<>();
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr.add(new int[]{i, cnt});
            }
        }

        if (temp != 1) {
            arr.add(new int[]{temp, 1});
        }

        if (arr.isEmpty()) {
            arr.add(new int[]{n, 1});
        }

        return arr;
    }
}