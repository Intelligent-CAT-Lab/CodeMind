import java.util.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        List<long[]> l = factorization(x);
        Collections.sort(l, (a, b) -> Long.compare(a[0], b[0]));
        int ans = 0;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i)[0] == 1) {
                continue;
            } else {
                int s = 0;
                long num = l.get(i)[1];
                int j;
                if (num == 1) {
                    j = 1;
                } else {
                    for (j = 1; j < num; j++) {
                        s += j;
                        if (s == num) {
                            break;
                        } else if (s > num) {
                            j -= 1;
                            break;
                        }
                    }
                }
                ans += j;
            }
        }
        System.out.println(ans);
    }

    public static List<long[]> factorization(long n) {
        List<long[]> arr = new ArrayList<>();
        long temp = n;
        for (long i = 2; i < Math.ceil(Math.sqrt(n)) + 1; i++) {
            if (temp % i == 0) {
                long cnt = 0;
                while (temp % i == 0) {
                    cnt += 1;
                    temp /= i;
                }
                arr.add(new long[]{i, cnt});
            }
        }
        if (temp != 1) {
            arr.add(new long[]{temp, 1});
        }
        if (arr.isEmpty()) {
            arr.add(new long[]{n, 1});
        }
        return arr;
    }
}