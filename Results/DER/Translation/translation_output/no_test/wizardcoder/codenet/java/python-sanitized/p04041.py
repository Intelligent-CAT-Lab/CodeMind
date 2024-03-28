import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;

public class p04041 {
    InputStream is;
    PrintWriter out;
    String INPUT = "";

    long MOD = 1_000_000_007;
    int inf = Integer.MAX_VALUE/2;

    void solve(){
        int n = ni();
        int x = ni();
        int y = ni();
        int z = ni();
        int sum = x+y+z+1;
        int mask = 1<<sum;
        mask--;
        long[][] dp = new long[n+1][mask+1];
        int ng = 0;
        ng |= 1<<z;
        ng |= 1<<(y+z);
        ng |= 1<<(x+y+z);
        dp[0][1] = 1;
        for(int i = 0; i < n; i++){
            for(int state = 0; state <= mask; state++){
                for(int j = 1; j <= 10; j++){
                    int res = ((state<<j)&mask) + 1;
                    if((res&ng)==ng) continue;
                    dp[i+1][res] += dp[i][state];
                    dp[i+1][res] %= MOD;
                }
            }
        }
        long ans = 1;
        for(int i = 0; i < n; i++){
            ans *= 10;
            ans %= MOD;
        }
        for(int i = 0; i <= mask; i++){
            ans -= dp[n][i];
            ans %= MOD;
        }
        out.println((ans+MOD)%MOD);
    }

    void run() throws Exception
    {
        is = INPUT.isEmpty()? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);
        long s = System.currentTimeMillis();
        solve();
        out.flush();
        if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
    }

    public static void main(String[] args) throws Exception { new p04041().run(); }

    private byte[] inbuf = new byte[1024];
    private int lenbuf = 0, ptrbuf = 0;

    private int readByte()
    {
        if(lenbuf == -1)throw new InputMismatchException();
        if(ptrbuf >= lenbuf){
            ptrbuf = 0;
            try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
            if(lenbuf <= 0)return -1;
        }
        return inbuf[ptrbuf++];
    }

    private boolean isSpaceChar(int c) { return!(c >= 33 && c <= 126); }
    private int skip() { int b; while((b = readByte())!= -1 && isSpaceChar(b)); return b; }

    private double nd() { return Double.parseDouble(ns()); }
    private char nc() { return (char)skip(); }

    private String ns()
    {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b) && b!='')){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    private char[] ns(int n)
    {
        char[]