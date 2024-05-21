import java.util.*;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int start = 0;
        int next = 0;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (count < k) {
                    if (j == next) {
                        sb.append(" L ");
                        count++;
                        next = (next + 2) % n;
                        if (next == 0) {
                            start = 1;
                        }
                    } else {
                        sb.append(" S ");
                    }
                } else {
                    sb.append(" S ");
                }
            }
            ans[i] = sb.toString();
        }
        if (count < k) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (String s : ans) {
                System.out.println(s);
            }
        }
    }
}