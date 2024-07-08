import java.io.*;
import java.security.SecureRandom;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ConsoleIO io = new ConsoleIO(new InputStreamReader(System.in), new PrintWriter(System.out));
        //String test = "C-large";
        //ConsoleIO io = new ConsoleIO(new FileReader("D:\\Dropbox\\code\\practice\\jb\\src\\" + test + ".in"), new PrintWriter(new File("D:\\Dropbox\\code\\practice\\jb\\src\\" + test + "-out.txt")));

       new Main(io).solve();

        io.close();
    }

    ConsoleIO io;
    Main(ConsoleIO io) {
        this.io = io;
    }

    List<List<Integer>> gr = new ArrayList<>();
    long MOD = 998_244_353;

    public void solve() {
        char[] s = io.readLine().toCharArray();
        List<Character> list = new ArrayList<>();
var newVariable_0 = list.add(s[i]);        for(int i = 0;i<s.length;i++)if(s[i]!='x')newVariable_0;
var newVariable_1 = list.size();        if(newVariable_1 == 0){
            io.writeLine("0");
            return;
        }

var newVariable_2 = list.size();        for(int i = 0, j = newVariable_2-1;i<j;i++,j--){
var newVariable_3 = list.get(i);var newVariable_4 = list.get(j);            if(list.get(i)!=newVariable_4){
                io.writeLine("-1");
                return;
            }
        }

        int res = 0;
        for(int i = 0, j = s.length-1;i<j;){
            if(s[i] != s[j]){
                res++;
                if(s[i]=='x')i++;
                else j--;
            }else{
                i++;
                j--;
            }
        }

        io.writeLine(res+"");
    }

}

class ConsoleIO {
    BufferedReader br;
    PrintWriter out;
    public ConsoleIO(Reader reader, PrintWriter writer){br = new BufferedReader(reader);out = writer;}
    public void flush(){this.out.flush();}
    public void close(){this.out.close();}
    public void writeLine(String s) {this.out.println(s);}
    public void writeInt(int a) {this.out.print(a);this.out.print(' ');}
    public void writeWord(String s){
        this.out.print(s);
    }
    public void writeIntArray(int[] a, int k, String separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
var newVariable_5 = sb.append(separator);            if (i > 0) newVariable_5;
var newVariable_6 = sb.append(a[i]);        }
var newVariable_7 = sb.toString();        this.writeLine(newVariable_7);
    }
    public int read(char[] buf, int len){try {return br.read(buf,0,len);}catch (Exception ex){ return -1; }}
    public String readLine() {try {return br.readLine();}catch (Exception ex){ return "";}}
    public long[] readLongArray() {
        String[]n=this.readLine().trim().split("\\s+");long[]r=new long[n.length];
var newVariable_8 = Long.parseLong(n[i]);        for(int i=0;i<n.length;i++)r[i]=newVariable_8;
        return r;
    }
    public int[] readIntArray() {
        String[]n=this.readLine().trim().split("\\s+");int[]r=new int[n.length];
var newVariable_9 = Integer.parseInt(n[i]);        for(int i=0;i<n.length;i++)r[i]=newVariable_9;
        return r;
    }
    public int[] readIntArray(int n) {
        int[] res = new int[n];
        char[] all = this.readLine().toCharArray();
        int cur = 0;boolean have = false;
        int k = 0;
        boolean neg = false;
        for(int i = 0;i<all.length;i++){
            if(all[i]>='0' && all[i]<='9'){
                cur = cur*10+all[i]-'0';
                have = true;
            }else if(all[i]=='-') {
                neg = true;
            }
            else if(have){
                res[k++] = neg?-cur:cur;
                cur = 0;
                have = false;
                neg = false;
            }
        }
        if(have)res[k++] = neg?-cur:cur;
        return res;
    }
    public int ri() {
        try {
            int r = 0;
            boolean start = false;
            boolean neg = false;
            while (true) {
                int c = br.read();
                if (c >= '0' && c <= '9') {
                    r = r * 10 + c - '0';
                    start = true;
                } else if (!start && c == '-') {
                    start = true;
                    neg = true;
                } else if (start || c == -1) return neg ? -r : r;
            }
        } catch (Exception ex) {
            return -1;
        }
    }
    public long readLong() {
        try {
            long r = 0;
            boolean start = false;
            boolean neg = false;
            while (true) {
                int c = br.read();
                if (c >= '0' && c <= '9') {
                    r = r * 10 + c - '0';
                    start = true;
                } else if (!start && c == '-') {
                    start = true;
                    neg = true;
                } else if (start || c == -1) return neg ? -r : r;
            }
        } catch (Exception ex) {
            return -1;
        }
    }
    public String readWord() {
        try {
            boolean start = false;
            StringBuilder sb = new StringBuilder();
            while (true) {
                int c = br.read();
                if (c!= ' ' && c!= '\r' && c!='\n' && c!='\t') {
var newVariable_10 = sb.append((char)c);                    start = true;
var newVariable_11 = sb.toString();                } else if (start || c == -1) return newVariable_11;
            }
        } catch (Exception ex) {
            return "";
        }
    }
    public char readSymbol() {
        try {
            while (true) {
                int c = br.read();
                if (c != ' ' && c != '\r' && c != '\n' && c != '\t') {
                    return (char) c;
                }
            }
        } catch (Exception ex) {
            return 0;
        }
    }
    //public char readChar(){try {return (char)br.read();}catch (Exception ex){ return 0; }}
}
class Pair {
    public Pair(int a, int b) {this.a = a;this.b = b;}
    public int a;
    public int b;
}
class PairLL {
    public PairLL(long a, long b) {this.a = a;this.b = b;}
    public long a;
    public long b;
}
class Triple {
    public Triple(int a, int b, int c) {this.a = a;this.b = b;this.c = c;}
    public int a;
    public int b;
    public int c;
}