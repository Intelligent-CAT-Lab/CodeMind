import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03196 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        List<int[]> factors = factorization(p);
        int ans = 1;
        for (int[] factor : factors) {
            if (factor[1] >= n) {
                ans *= Math.pow(factor[0], factor[1] / n);
            }
        }
        System.out.println(ans);
    }

    private static List<int[]> factorization(int n) {
        List<int[]> arr = new ArrayList<>();
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
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