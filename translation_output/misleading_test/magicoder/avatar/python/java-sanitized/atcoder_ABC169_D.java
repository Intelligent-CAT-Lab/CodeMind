import java.util.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        List<List<Long>> l = factorization(x);
        l.sort(Comparator.comparingLong(o -> o.get(0)));
        long ans = 0;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).get(0) == 1) {
                continue;
            } else {
                long s = 0;
                long num = l.get(i).get(1);
                if (num == 1) {
                    long j = 1;
                } else {
                    for (long j = 1; j < num; j++) {
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

    private static List<List<Long>> factorization(long n) {
        List<List<Long>> arr = new ArrayList<>();
        long temp = n;
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                long cnt = 0;
                while (temp % i == 0) {
                    cnt += 1;
                    temp /= i;
                }
                List<Long> pair = new ArrayList<>();
                pair.add(i);
                pair.add(cnt);
                arr.add(pair);
            }
        }
        if (temp != 1) {
            List<Long> pair = new ArrayList<>();
            pair.add(temp);
            pair.add(1L);
            arr.add(pair);
        }
        if (arr.isEmpty()) {
            List<Long> pair = new ArrayList<>();
            pair.add(n);
            pair.add(1L);
            arr.add(pair);
        }
        return arr;
    }
}