import java.util.Scanner;

public class p02550 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = x;
        int[] s = new int[m];
        s[x] = 1;
        int h = -1;
        int r = 0;
        for (int i = 1; i < n; i++) {
            arr[i] = (arr[i - 1] * arr[i - 1]) % m;
            if (s[arr[i]] == 0) {
                s[arr[i]] = 1;
            } else {
                h = i;
                r = arr[i];
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