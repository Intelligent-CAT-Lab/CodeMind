import java.util.*;
import java.io.*;

public class p03209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] l = new int[51];
        int[] p = new int[51];
        l[0] = 1;
        p[0] = 1;
        for (int i = 1; i < 51; i++) {
            l[i] = l[i - 1] * 2 + 3;
            p[i] = p[i - 1] * 2 + 1;
        }
        int ans = 0;
        for (int i = n; i >= 0; i--) {
            if (i == 0 && x >= 1) {
                ans++;
                break;
            }
            if (x <= 1) {
                break;
            } else if (x <= l[i - 1] + 1) {
                x--;
                continue;
            } else if (x == l[i - 1] + 2) {
                ans++;
                x -= 2;
            } else {
                ans += p[i - 1] + 1;
                x -= l[i - 1] + 2;
            }
        }
        System.out.println(ans);
    }
}