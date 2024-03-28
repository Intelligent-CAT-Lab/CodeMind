import java.util.*;

public class atcoder_ABC169_D {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        
        List<int[]> l = factorization(x);
        Collections.sort(l, Comparator.comparingInt(arr -> arr[0]));
        
        long ans = 0;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i)[0] == 1) {
                continue;
            } else {
                int s = 0;
                int num = l.get(i)[1];
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

    public static List<int[]> factorization(long n) {
        List<int[]> arr = new ArrayList<>();
        long temp = n;
        for (long i = 2; i <= Math.ceil(Math.sqrt(n)); i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr.add(new int[]{(int)i, cnt});
            }
        }
        if (temp != 1) {
            arr.add(new int[]{(int)temp, 1});
        }
        if (arr.isEmpty()) {
            arr.add(new int[]{(int)n, 1});
        }
        return arr;
    }
}