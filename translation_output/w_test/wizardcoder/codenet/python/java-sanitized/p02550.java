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
            int val = arr[i - 1] * arr[i - 1] % m;
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
            res = (res + arr[i]) % m;
        }
        if (h!= -1) {
            int[] new_arr = Arrays.copyOfRange(arr, arr.length - h - 1, arr.length);
            int rest = n - (h + 1);
            int c = new_arr.length;
            int q = rest / c;
            int ssum = 0;
            for (int i = 0; i < c; i++) {
                ssum = (ssum + new_arr[i]) % m;
            }
            ssum = (ssum * q) % m;
            int r = rest % c;
            for (int i = 0; i < r; i++) {
                ssum = (ssum + new_arr[i]) % m;
            }
            res = (res + ssum) % m;
        }
        System.out.println(res);
    }
}