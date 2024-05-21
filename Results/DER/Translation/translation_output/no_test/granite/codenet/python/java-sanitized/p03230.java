import java.io.*;
import java.util.*;

public class p03230 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int k = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i * (i - 1) / 2 == n) {
                k = i;
                break;
            }
        }

        if (k == 0) {
            System.out.println("No");
            return;
        }

        int[][] s = new int[k][k];
        int i = 1, cnt = 0;
        for (int j = 0; j < k; j++) {
            for (; i <= n; i++) {
                s[j][cnt] = i;
                cnt++;
                if (cnt == k - j - 1) {
                    break;
                }
            }
            cnt = 0;
        }

        int j = i, col = 0;
        for (; j <= n; j++) {
            s[col][cnt] = j;
            cnt++;
            col++;
            if (cnt == k - col) {
                cnt = 0;
                col = 0;
            }
        }

        System.out.println("Yes");
        System.out.println(k);
        for (int[] row : s) {
            System.out.print(k - 1);
            for (int num : row) {
                System.out.print(" " + num);
            }
            System.out.println();
        }
    }
}