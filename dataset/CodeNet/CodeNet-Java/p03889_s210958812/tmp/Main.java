import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class Main {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    long MOD = 1_000_000_007;
    long inf = Long.MAX_VALUE;

    void solve(){ 
        char[] c = ns().toCharArray();
        int n = c.length;
        for(int i = 0; i < n; i++){
            if(c[i]=='p'&&c[n-1-i]!='q'){
                out.println("No");
                return;
            }
            if(c[i]=='q'&&c[n-1-i]!='p'){
                out.println("No");
                return;
            }
            if(c[i]=='b'&&c[n-1-i]!='d'){
                out.println("No");
                return;
            }
            if(c[i]=='d'&&c[n-1-i]!='b'){
                out.println("No");
                return;
            }
        }
        out.println("Yes");

    }

    void run() throws Exception
    {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
System.out.println("[INST]40;None;INPUT.isEmpty();"+INPUT.isEmpty());
System.out.println("[INST]40;None;INPUT.getBytes();"+INPUT.getBytes());
        out = new PrintWriter(System.out);
        long s = System.currentTimeMillis();
System.out.println("[INST]42;s;System.currentTimeMillis();"+s);
        solve();
        out.flush();
System.out.println("[INST]44;None;out.flush();"+out.flush());
        if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
System.out.println("[INST]45;None;INPUT.isEmpty();"+INPUT.isEmpty());
System.out.println("[INST]45;None;System.currentTimeMillis();"+System.currentTimeMillis());
    }
    
    public static void main(String[] args) throws Exception { new Main().run(); }
    
    private byte[] inbuf = new byte[1024];
    private int lenbuf = 0, ptrbuf = 0;
    
    private int readByte()
    {
        if(lenbuf == -1)throw new InputMismatchException();
        if(ptrbuf >= lenbuf){
            ptrbuf = 0;
            try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
System.out.println("[INST]58;lenbuf;is.read(inbuf);"+lenbuf);
            if(lenbuf <= 0)return -1;
        }
        return inbuf[ptrbuf++];
    }
    
    private boolean isSpaceChar(int c) { return !(c >= 33 && c <= 126); }
    private int skip() { int b; while((b = readByte()) != -1 && isSpaceChar(b)); return b; }
    
    private double nd() { return Double.parseDouble(ns()); }
    private char nc() { return (char)skip(); }
    
    private String ns()
    {
        int b = skip();
        StringBuilder sb = new StringBuilder();
        while(!(isSpaceChar(b) && b != ' ')){
            sb.appendCodePoint(b);
System.out.println("[INST]75;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
            b = readByte();
        }
        return sb.toString();
System.out.println("[INST]78;None;sb.toString();"+sb.toString());
    }
    
    private char[] ns(int n)
    {
        char[] buf = new char[n];
        int b = skip(), p = 0;
        while(p < n && !(isSpaceChar(b))){
            buf[p++] = (char)b;
            b = readByte();
        }
        return n == p ? buf : Arrays.copyOf(buf, p);
System.out.println("[INST]89;None;Arrays.copyOf(buf, p);"+Arrays.copyOf(buf, p));
    }
    
    private char[][] nm(int n, int m)
    {
        char[][] map = new char[n][];
        for(int i = 0;i < n;i++)map[i] = ns(m);
        return map;
    }
    
    private int[] na(int n)
    {
        int[] a = new int[n];
        for(int i = 0;i < n;i++)a[i] = ni();
        return a;
    }
    
    private int ni()
    {
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
    
    private long nl()
    {
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
    
    private static void tr(Object... o) { System.out.println(Arrays.deepToString(o)); }
 
}