import java.util.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        List<List<Integer>> l = factorization(x);
        l.sort(Comparator.comparingInt(o -> o.get(0)));
        int ans = 0;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).get(0) == 1) {
                continue;
            } else {
                int s = 0;
                int num = l.get(i).get(1);
                int j;
                if (num == 1) {
                    j = 1;
                } else {
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
    }

    private static List<List<Integer>> factorization(int n) {
        List<List<Integer>> arr = new ArrayList<>();
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                List<Integer> pair = new ArrayList<>();
                pair.add(i);
                pair.add(cnt);
                arr.add(pair);
            }
        }
        if (temp != 1) {
            List<Integer> pair = new ArrayList<>();
            pair.add(temp);
            pair.add(1);
            arr.add(pair);
        }
        if (arr.isEmpty()) {
            List<Integer> pair = new ArrayList<>();
            pair.add(n);
            pair.add(1);
            arr.add(pair);
        }
        return arr;
    }
}