import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class p02550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        Set<Integer> s = new HashSet<>();
        s.add(x);
        int h = -1;
        int r = 0;
        for (int i = 0; i < n - 1; i++) {
            int val = arr[i] * arr[i] % m;
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
            int[] newArr = new int[n - h - 1];
            System.arraycopy(arr, h + 1, newArr, 0, newArr.length);
            int rest = n - (h + 1);
            int c = newArr.length;
            int q = rest / c;
            int ssum = 0;
            for (int i = 0; i < c; i++) {
                ssum += newArr[i] * q;
            }
            for (int i = 0; i < rest % c; i++) {
                ssum += newArr[i];
            }
            res += ssum;
        }

        System.out.println(res);
    }
}