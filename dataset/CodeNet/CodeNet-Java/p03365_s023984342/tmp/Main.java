import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main implements Runnable {
    static ContestScanner in;
    static Writer out;
    public static void main(String[] args) {
        new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
System.out.println("[INST]8;None;new Thread(null, new Main(), '', 16 * 1024 * 1024).start();"+new Thread(null, new Main(), "", 16 * 1024 * 1024).start());
    }

    public void run() {
        Main main = new Main();
        try {
            in = new ContestScanner();
            out = new Writer();
            main.solve();
            out.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void solve() throws IOException {
        int n = in.nextInt();
        long ans = 0;
        long mod = 1000000007;
        long[] fact = getFact(n, mod);
        for (int i = n - 1; i - 1 >= n - 1 - i; i--) {
            ans = (ans + modcomb(i - 1, n - 1 - i, fact, mod) * fact[i] % mod * fact[n - 1 - i] % mod) % mod;
        }
        ans = ((fact[n - 1] * n % mod - ans) % mod + mod) % mod;
        System.out.println(ans);
    }

    long modcomb(int n, int r, long[] fact, long mod) {
        return fact[n] * modinv(fact[n - r], mod) % mod * modinv(fact[r], mod) % mod;
    }


    long[] getFact(int n, long mod) {
        long[] fact = new long[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = fact[i - 1] * i % mod;
        }
        return fact;
    }

    long modinv(long n, long mod){
        return modpow(n, mod-2, mod);
    }

    long modpow(long n, long a, long mod){
        long res = 1;
        while(a > 0){
            if((a&1)==1) res = (res * n) % mod;
            n = n * n % mod;
            a >>= 1;
        }
        return res;
    }
}

@SuppressWarnings("serial")
class MultiSet<T> extends HashMap<T, Integer>{
    @Override public Integer get(Object key){return containsKey(key)?super.get(key):0;}
System.out.println("[INST]67;None;containsKey(key);"+containsKey(key));
    public void add(T key,int v){put(key,get(key)+v);}
    public void add(T key){put(key,get(key)+1);}
    public void sub(T key){final int v=get(key);if(v==1)remove(key);else put(key,v-1);}
System.out.println("[INST]70;None;remove(key);"+remove(key));
System.out.println("[INST]70;None;put(key,v-1);"+put(key,v-1));
    public MultiSet<T> merge(MultiSet<T> set)
    {MultiSet<T>s,l;if(this.size()<set.size()){s=this;l=set;}else{s=set;l=this;}
System.out.println("[INST]72;None;this.size();"+this.size());
System.out.println("[INST]72;None;set.size();"+set.size());
        for(Entry<T,Integer>e:s.entrySet())l.add(e.getKey(),e.getValue());return l;}
System.out.println("[INST]73;None;s.entrySet();"+s.entrySet());
System.out.println("[INST]73;None;e.getKey();"+e.getKey());
System.out.println("[INST]73;None;e.getValue();"+e.getValue());
}

class Writer extends PrintWriter{
    public Writer(String filename)throws IOException
    {super(new BufferedWriter(new FileWriter(filename)));}
    public Writer()throws IOException {super(System.out);}
}
class ContestScanner implements Closeable {
    private BufferedReader in;private int c=-2;
    public ContestScanner()throws IOException
    {in=new BufferedReader(new InputStreamReader(System.in));}
    public ContestScanner(String filename)throws IOException
    {in=new BufferedReader(new InputStreamReader(new FileInputStream(filename)));}
    public String nextToken()throws IOException {
        StringBuilder sb=new StringBuilder();
        while((c=in.read())!=-1&&Character.isWhitespace(c));
System.out.println("[INST]89;c;in.read();"+c);
System.out.println("[INST]89;None;Character.isWhitespace(c);"+Character.isWhitespace(c));
        while(c!=-1&&!Character.isWhitespace(c)){sb.append((char)c);c=in.read();}
System.out.println("[INST]90;None;Character.isWhitespace(c);"+Character.isWhitespace(c));
System.out.println("[INST]90;None;sb.append((char)c);"+sb.append((char)c));
System.out.println("[INST]90;c;in.read();"+c);
        return sb.toString();
System.out.println("[INST]91;None;sb.toString();"+sb.toString());
    }
    public String readLine()throws IOException{
        StringBuilder sb=new StringBuilder();if(c==-2)c=in.read();
System.out.println("[INST]94;c;in.read();"+c);
        while(c!=-1&&c!='\n'&&c!='\r'){sb.append((char)c);c=in.read();}
System.out.println("[INST]95;None;sb.append((char)c);"+sb.append((char)c));
System.out.println("[INST]95;c;in.read();"+c);
        return sb.toString();
System.out.println("[INST]96;None;sb.toString();"+sb.toString());
    }
    public long nextLong()throws IOException,NumberFormatException
    {return Long.parseLong(nextToken());}
    public int nextInt()throws NumberFormatException,IOException
    {return(int)nextLong();}
    public double nextDouble()throws NumberFormatException,IOException
    {return Double.parseDouble(nextToken());}
    public void close() throws IOException {in.close();}
}