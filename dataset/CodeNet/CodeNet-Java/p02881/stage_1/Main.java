import java.io.*;
import java.util.*;

public class Main {


    private  static void solver(InputReader sc, PrintWriter out) throws Exception {
        long n = sc.nextLong();
var newVariable_0 = Math.sqrt(n);        long sqrt = (long) newVariable_0;
        long x=0,y=0;
        for(long i=sqrt;i>=1;i--){
            if(n%i==0){
               x  =i;
               y = (long) n/i;
                break;
            }
        }
        long ans =0;
        if(x!=0 && y!=0)
             ans = (x-1)+(y-1);
        else
            ans = n-1;
        out.println(ans);
    }
    private  static long gcd(long a, long b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }

    public static void main(String[] args) throws Exception{
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solver(in,out);
        out.close();
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
var newVariable_1 = tokenizer.hasMoreTokens();            while (tokenizer == null || !newVariable_1) {
                try {
var newVariable_2 = reader.readLine();                    tokenizer = new StringTokenizer(newVariable_2);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
var newVariable_3 = tokenizer.nextToken();            return newVariable_3;
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong(){
            return Long.parseLong(next());
        }

        public long[] readLongArr(int n){
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i] = nextLong();
            }
            return arr;
        }
        public int[] readIntArr(int n){
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = nextInt();
            }
            return arr;
        }
    }
}
class Pair implements Comparable<Pair>{
    int x;
    String s;
    Pair(int x, String s){
        this.x = x;
        this.s = s;
    }
    public int compareTo(Pair p){
        return this.x-p.x;
    }
}