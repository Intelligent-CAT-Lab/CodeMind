import java.util.*;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        System.out.println(factorization(x));
    }

    public static int factorization(long n) {
        List<int[]> arr = new ArrayList<>();
        long temp = n;
        for (int i = 2; i <= (int) Math.sqrt(-(-n * 1.0)) + 1; i++) {
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
        arr.sort(Comparator.comparingInt(a -> a[0]));
        int ans = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i)[0] == 1) {
                continue;
            } else {
                int s = 0;
                int num = arr.get(i)[1];
                if (num == 1) {
                    int j = 1;
                } else {
                    for (int j = 1; j < num; j++) {
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
        return ans;
    }
}