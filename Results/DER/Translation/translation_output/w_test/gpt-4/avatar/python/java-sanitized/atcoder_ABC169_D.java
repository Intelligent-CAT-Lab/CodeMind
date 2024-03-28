import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC169_D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        List<int[]> l = factorization(x);
        Collections.sort(l, (a, b) -> Integer.compare(a[0], b[0]));
        int ans = 0;
        for (int[] pair : l) {
            if (pair[0] == 1) {
                continue;
            } else {
                int s = 0;
                int num = pair[1];
                int j = 1;
                if (num != 1) {
                    for (j = 1; j < num; j++) {
                        s += j;
                        if (s == num) {
                            break;
                        } else if (s > num) {
                            j--;
                            break;
                        }
                    }
                }
                ans += j;
            }
        }
        System.out.println(ans);
        scanner.close();
    }

    public static List<int[]> factorization(long n) {
        List<int[]> arr = new ArrayList<>();
        long temp = n;
        for (int i = 2; i <= (int) Math.sqrt(n) + 1; i++) {
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
            arr.add(new int[]{(int) temp, 1});
        }
        if (arr.isEmpty()) {
            arr.add(new int[]{(int) n, 1});
        }
        return arr;
    }
}