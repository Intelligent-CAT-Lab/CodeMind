import java.util.*;

public class p02550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x, m;
        n = sc.nextInt();
        x = sc.nextInt();
        m = sc.nextInt();
        int[] arr = new int[n];
        Set<Integer> s = new HashSet<>();
        s.add(x);
        int h = -1;
        int r = 0;
        for (int i = 0; i < n - 1; i++) {
            int val = (int) Math.pow(arr[i], 2) % m;
            if (!s.contains(val)) {
                arr[i + 1] = val;
                s.add(val);
            } else {
                h = i;
                r = val;
                break;
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += arr[i];
        }
        if (h != -1) {
            int new_arr = Arrays.copyOfRange(arr, arr.indexOf(r), n);
            int rest = n - (h + 1);
            int c = new_arr.length;
            int q = rest / c;
            int ssum = 0;
            for (int i = 0; i < c; i++) {
                ssum += new_arr[i];
            }
            res += ssum * q;
            for (int i = rest % c; i < c; i++) {
                res += new_arr[i];
            }
        }
        System.out.println(res);
    }
}