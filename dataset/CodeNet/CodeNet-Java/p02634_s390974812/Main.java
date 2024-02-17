import java.util.*;
import java.io.*;
public class Main {
    int A, B, C, D;
    long[][] DP;
    long MOD = 998244353;
    long solve(int a, int b) {
        if(DP[a][b] != -1) {
            return DP[a][b];
        }
        long v = 0;
        boolean leftA = (C - a) > 0;
        boolean leftB = (D - b) > 0;
        if(leftA) {
            v += b*solve(a+1, b);
        }
        if(leftB) {
            v += a*solve(a, b+1);
        }
        if(leftA && leftB) {
            v -= (a*b)*solve(a+1, b+1);
        }
        long ov = v;
        v = (v%MOD + MOD)%MOD;
        DP[a][b] = v;
        return v;

    }
    void solve(BufferedReader in) throws Exception {
        int[] xx = toInts(in.readLine());
        A=xx[0];B=xx[1];C=xx[2];D=xx[3];
        DP = new long[C+1][D+1];
        for(int i = 0; i<=C;i++){
            for(int j = 0; j<=D; j++){
                DP[i][j] = -1;
            }
        }
        DP[C][D] = 1;
        for(int i = C-1; i>=A; i--) solve(i, B);
        System.out.println(solve(A, B));
    }
    int toInt(String s) {return Integer.parseInt(s);}
    int[] toInts(String s) {
        String[] a = s.split(" ");
        int[] o = new int[a.length];
        for(int i = 0; i<a.length; i++) o[i] = toInt(a[i]);
        return o;
    }
    void e(Object o) {
        System.err.println(o);
    }
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        (new Main()).solve(in);
    }
}
