import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p03196 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        List<int[]> list = factorization(p);
        int ans = 1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)[1] >= n) {
                ans *= Math.pow(list.get(i)[0], list.get(i)[1] / n);
            }
        }
        System.out.println(ans);
    }

    public static List<int[]> factorization(int n) {
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