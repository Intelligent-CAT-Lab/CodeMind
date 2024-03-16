import java.util.*;
import java.io.*;
import java.math.*;

public class atcoder_ABC155_E {
    static Scanner sc = new Scanner(System.in);
    static int INF = Integer.MAX_VALUE;
    static long LINF = Long.MAX_VALUE;
    static int MOD = 1000000007;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[] dx8 = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy8 = {1, 1, 0, -1, -1, -1, 0, 1};
    static int[] dx4 = {1, 0, -1, 0};
    static int[] dy4 = {0, 1, 0, -1};

    public static void main(String[] args) {
        String s = sc.next();
        int pp = 0;
        int na = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int c = s.charAt(i) - '0';
            int cc = na + c;
            na = 0;
            if (cc <= 4) {
                pp += cc;
            } else {
                na = 1;
                if (i == s.length() - 1) {
                    pp += 1;
                }
                pp += 10 - cc;
            }
        }
        System.out.println(pp);
    }
}