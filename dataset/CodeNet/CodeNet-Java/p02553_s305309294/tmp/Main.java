//package csesCodes;// template code for cp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        FastScanner fs=new FastScanner();
        long a=fs.nextLong();
        long b=fs.nextLong();
        long c=fs.nextLong();
        long d=fs.nextLong();
        long p1,p2,p3,p4;
        p1=a*c;
        p2=a*d;
        p3=b*c;
        p4=b*d;
        long ans1=Math.max(p1,p2);
System.out.println("[INST]21;ans1;Math.max(p1,p2);"+ans1);
        long ans2=Math.max(p3,p4);
System.out.println("[INST]22;ans2;Math.max(p3,p4);"+ans2);
        long result=Math.max(ans1,ans2);
System.out.println("[INST]23;result;Math.max(ans1,ans2);"+result);
        System.out.println(result);



    }




    static class FastScanner {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer("");

        public String next() {
            while (!st.hasMoreTokens())
System.out.println("[INST]38;None;st.hasMoreTokens();"+st.hasMoreTokens());
                try {
                    st=new StringTokenizer(br.readLine());
System.out.println("[INST]40;None;br.readLine();"+br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
System.out.println("[INST]44;None;st.nextToken();"+st.nextToken());

        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readArray(int n) {
            int[] a=new int[n];
            for (int i=0; i<n; i++) a[i]=nextInt();
            return a;
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long[] readLongArray(int n) {
            long[] a=new long[n];
            for (int i=0; i<n; i++) a[i]=nextLong();
            return a;
        }
    }

}
