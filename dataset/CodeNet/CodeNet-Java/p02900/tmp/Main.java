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
        fact.add(1L);
System.out.println("[INST]16;None;fact.add(1L);"+fact.add(1L));
        for(long i = 2; i*i <= n; i++){
            while(n % i == 0){
                fact.add(i);
System.out.println("[INST]19;None;fact.add(i);"+fact.add(i));
                n/=i;
            }
        }
        if(n > 1)
            fact.add(n);
System.out.println("[INST]24;None;fact.add(n);"+fact.add(n));
        return fact;
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
            while (st == null || !st.hasMoreElements()) {
System.out.println("[INST]49;None;st.hasMoreElements();"+st.hasMoreElements());
                try {
                    st = new StringTokenizer(br.readLine());
System.out.println("[INST]51;None;br.readLine();"+br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
System.out.println("[INST]56;None;st.nextToken();"+st.nextToken());
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
System.out.println("[INST]74;str;br.readLine();"+str);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}