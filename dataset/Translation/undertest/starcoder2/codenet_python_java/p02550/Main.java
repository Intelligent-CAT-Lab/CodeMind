import java.util.*;

public class p02550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = x;
        Set<Integer> s = new HashSet<>();
        s.add(x);
        int h = -1;
        int r = 0;
        for (int i = 1; i < n; i++) {
            int val = (arr[i - 1] * arr[i - 1]) % m;
            if (!s.contains(val)) {
                arr[i] = val;
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
            int[] new_arr = new int[n - h - 1];
            for (int i = 0; i < n - h - 1; i++) {
                new_arr[i] = arr[h + 1 + i];
            }
            int rest = n - (h + 1);
            int c = new_arr.length;
            int q = rest / c;
            int ssum = 0;
            for (int i = 0; i < c; i++) {
                ssum += new_arr[i];
            }
            ssum *= q;
            int r1 = rest % c;
            for (int i = 0; i < r1; i++) {
                ssum += new_arr[i];
            }
            res += ssum;
        }
        System.out.println(res);
    }
}