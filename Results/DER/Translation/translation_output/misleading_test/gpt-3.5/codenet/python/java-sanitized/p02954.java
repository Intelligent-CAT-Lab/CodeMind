import java.util.Scanner;

public class p02954 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int n = input.length();
        int rc = 0;
        int lc = 0;
        int p = 0;
        int state = 1; // 1 for 'R', 0 for 'L'
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
            char current = input.charAt(i);
            if (state == 1) {
                if (current == 'R') {
                    rc++;
                    if (i < n - 1 && input.charAt(i + 1) == 'L') {
                        ans[i] += (rc + 1) / 2;
                        ans[i + 1] += rc / 2;
                        state = 0;
                        p = i;
                        rc = 0;
                    }
                }
            } else {
                if (current == 'L') {
                    lc++;
                    if (i == n - 1 || input.charAt(i + 1) == 'R') {
                        ans[p + 1] += (lc + 1) / 2;
                        ans[p] += lc / 2;
                        state = 1;
                        lc = 0;
                    }
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}