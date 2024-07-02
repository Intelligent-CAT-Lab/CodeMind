import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static InputStream is;
    static PrintWriter out;
    static String INPUT = "";

    static void solve() {
        long n = nl();
        long mod = 1000000007;
        long total = modpow(10, n, mod);
        long partial = 2 * modpow(9, n, mod);
        long both = modpow(8, n, mod);
        long ans = (total - partial + both) % mod;
        ans = (ans + mod) % mod;
        System.out.println(ans);
    }

    public static long modpow(long a, long n, long mod) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            n >>= 1;
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        long S = System.currentTimeMillis();
System.out.println("[INST]35;S;System.currentTimeMillis();"+S);
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
System.out.println("[INST]36;None;INPUT.isEmpty();"+INPUT.isEmpty());
System.out.println("[INST]36;None;INPUT.getBytes();"+INPUT.getBytes());
        out = new PrintWriter(System.out);

        solve();
        out.flush();
System.out.println("[INST]40;None;out.flush();"+out.flush());
        long G = System.currentTimeMillis();
System.out.println("[INST]41;G;System.currentTimeMillis();"+G);
        tr(G-S+"ms");
    }

    private static boolean eof() {
        if(lenbuf == -1)return true;
        int lptr = ptrbuf;
        while(lptr < lenbuf)if(!isSpaceChar(inbuf[lptr++]))return false;

        try {
            is.mark(1000);
System.out.println("[INST]51;None;is.mark(1000);"+is.mark(1000));
            while(true){
                int b = is.read();
System.out.println("[INST]53;b;is.read();"+b);
                if(b == -1){
                    is.reset();
System.out.println("[INST]55;None;is.reset();"+is.reset());
                    return true;
                }else if(!isSpaceChar(b)){
                    is.reset();
System.out.println("[INST]58;None;is.reset();"+is.reset());
                    return false;
                }
            }
        } catch (IOException e) {
            return true;
        }
    }

    private static byte[] inbuf = new byte[1024];
    static int lenbuf = 0, ptrbuf = 0;

    private static int readByte() {
        if(lenbuf == -1)throw new InputMismatchException();
        if(ptrbuf >= lenbuf){
            ptrbuf = 0;
            try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
System.out.println("[INST]74;lenbuf;is.read(inbuf);"+lenbuf);
            if(lenbuf <= 0)return -1;
        }
        return inbuf[ptrbuf++];
    }

    private static boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }

    private static int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }

    private static double nd() { return Double.parseDouble(ns()); }
    private static char nc() { return (char)skip(); }

    private static String ns() {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b))){
            sb.appendCodePoint(b);
System.out.println("[INST]91;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
            b = readByte();
        }
        return sb.toString();
System.out.println("[INST]94;None;sb.toString();"+sb.toString());
    }

    private static char[] ns(int n) {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n && !(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
System.out.println("[INST]104;None;Arrays.copyOf(buf, p);"+Arrays.copyOf(buf, p));
    }

    private static char[][] nm(int n, int m) {
        char[][] map = new char[n][];
        for(int i = 0;i < n;i++)map[i] = ns(m);
        return map;
    }

    private static int[] na(int n) {
        int[] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = ni();
        return a;
    }

    private static int ni() {
        int num = 0, b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }

        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private static long nl() {
        long num = 0;
        int b;
        boolean minus = false;
        while((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
        if(b == '-'){
            minus = true;
            b = readByte();
        }

        while(true){
            if(b >= '0' && b <= '9'){
                num = num * 10 + (b - '0');
            }else{
                return minus ? -num : num;
            }
            b = readByte();
        }
    }

    private static void tr(Object... o) { if(INPUT.length() != 0)System.out.println(Arrays.deepToString(o)); }
System.out.println("[INST]158;None;INPUT.length();"+INPUT.length());
}
