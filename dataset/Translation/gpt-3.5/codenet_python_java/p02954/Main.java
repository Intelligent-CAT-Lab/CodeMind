import java.util.Scanner;

public class p02954 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int rc = 0;
        int lc = 0;
        int p = 0;
        int state = 1; // 1 stands for R, 0 stands for L
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            if (state == 1) {
                if (s.charAt(i) == 'R') {
                    rc += 1;
                    if (i < n-1 && s.charAt(i+1) == 'L') {
                        ans[i] += (rc + 1) / 2;
                        ans[i+1] += rc / 2;
                        state = 0;
                        p = i;
                        rc = 0;
                    }
                }
            } else {
                if (s.charAt(i) == 'L') {
                    lc += 1;
                    if (i == n-1 || s.charAt(i+1) == 'R') {
                        ans[p+1] += (lc + 1) / 2;
                        ans[p] += lc / 2;
                        state = 1;
                        lc = 0;
                    }
                }
            }
        }

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}