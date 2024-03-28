import java.io.*;
import java.util.*;
import java.util.Map.Entry;

@SuppressWarnings("unused")
public class p02927 {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    final int MOD = (int)1e9+7;
    void printlnYN(boolean b){out.println((b? "Yes" : "No"));}

    void solve() throws Exception{
        int M = in.nextInt(), D = in.nextInt();
        int ans = 0;
        for(int m = 1; m <= M; m++){
            for(int d = 1; d <= D; d++){
                int d1 = d % 10, d2 = d // 10;
                if(d1 >= 2 and d2 >= 2 and d1 * d2 == m) ans++;
            }
        }
        out.println(ans);
    }

    public static void main(String[] args) throws Exception {
        new p02927().m();
    }

    void m() throws Exception {
        solve();
        out.flush();
    }

    static class FastScanner {
        Reader input;

        FastScanner() {this(System.in);}
        FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}

        int nextInt() {return (int) nextLong();}

        long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b!= '-' && b!= '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign = -1;
                    b = input.read();
                } else if (b == '+') {
                    b = input.read();
                }
                long ret = b - '0';
                while (true) {
                    b = input.read();
                    if (b < '0' || '9' < b) return ret * sign;
                    ret *= 10;
                    ret += b - '0';
                }
            } catch (IOException e)