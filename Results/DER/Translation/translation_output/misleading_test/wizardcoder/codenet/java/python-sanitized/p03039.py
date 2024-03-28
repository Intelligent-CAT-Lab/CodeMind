import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;

public class p03039 {
    InputStream is;
    PrintWriter out;
    String INPUT = "";

    // static int mod = 1_000_000_007;
    int mod = 998244353;
    // long inf = Long.MAX_VALUE/2;
    int inf = Integer.MAX_VALUE/2;

    void solve(){
        int n = ni();
        int m = ni();
        int k = ni();
        int mod = 1000000007;
        int[][] fif = enumFIF(1000000, mod);

        long xsum = 0;
        long ysum = 0;

        long xa = C(n*m-2,k-2,mod,fif) * fif[0][k-2] % mod;
        long xb = 0;
        for(int i = 0; i <= m-1; i++){
            long tmp = (long)i