//package BeginnerContest142;

import java.util.*;
import java.io.*;

public class Main {
    static long MODULO = (long)1e9+7;

    public static long gcd(long n, long m){
        if(m == 0) return n;
        return gcd(m, n % m);
    }


    public static HashSet<Long> factors(long n){ // returns a list of the prime factors of the number n
        HashSet<Long> fact = new HashSet<>();
var newVariable_0 = fact.add(1L);        for(long i = 2; i*i <= n; i++){
            while(n % i == 0){
var newVariable_1 = fact.add(i);                n/=i;
            }
        }
        if(n > 1)
var newVariable_2 = fact.add(n);        return fact;
    }
    // can also use sieve of eratosthenes for precomputing prime

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        long a = sc.nextLong();
        long b = sc.nextLong();
        pw.println(factors(gcd(a,b)).size());
        //pw.println(factors(gcd(a,b)));
        pw.close();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
var newVariable_3 = st.hasMoreElements();            while (st == null || !newVariable_3) {
                try {
var newVariable_4 = br.readLine();                    st = new StringTokenizer(newVariable_4);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
var newVariable_5 = st.nextToken();            return newVariable_5;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}