import java.util.*;
import java.io.*;

public class p01989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int N = S.length();
        int cnt = 0;
        for (int a = 1; a <= N; a++) {
            for (int b = a + 1; b <= N; b++) {
                for (int c = b + 1; c <= N; c++) {
                    String A = S.substring(0, a);
                    String B = S.substring(a, b);
                    String C = S.substring(b, c);
                    String D = S.substring(c);
                    int x = Integer.parseInt(A);
                    int y = Integer.parseInt(B);
                    int z = Integer.parseInt(C);
                    int w = Integer.parseInt(D);
                    if (x > 255 || y > 255 || z > 255 || w > 255) {
                        continue;
                    }
                    if (x == 0 && A.length()!= 1) {
                        continue;
                    }
                    if (y == 0 && B.length()!= 1) {
                        continue;
                    }
                    if (z == 0 && C.length()!= 1) {
                        continue;
                    }
                    if (w == 0 && D.length()!= 1) {
                        continue;
                    }
                    if (x == 0 && y == 0 && z == 0 && w == 0) {
                        continue;
                    }
                    if (x == 0 && y == 0 && z == 0) {
                        continue;
                    }
                    if (x == 0 && y == 0) {
                        continue;
                    }
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}