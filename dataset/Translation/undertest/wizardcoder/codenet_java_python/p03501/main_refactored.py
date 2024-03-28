class main:
    import java.io.*;
    import java.util.*;
    import java.math.*;
    import java.awt.Point;
    
    public class p03501 {
        static final long MOD = 998244353L;
        //static final long INF = 1000000000000000007L;
        //static final long MOD = 1000000007L;
        //static final int INF = 1000000007;
        
        //static long[] factorial;
        
        public static void main(String[] args) {
            FastScanner sc = new FastScanner();
            PrintWriter pw = new PrintWriter(System.out);
            
            int N = sc.ni();
            int A = sc.ni();
            int B = sc.ni();
            pw.println(Math.min(A*N,B));
            pw.close();
        }
        
        public static long dist(long[] p1, long[] p2) {
            return (Math.abs(p2[0]-p1[0])+Math.abs(p2[1]-p1[1]));
        }
        
        //Find the GCD of two numbers
        public static long gcd(long a, long b) {
            if (a < b) return gcd(b,a);
            if (b == 0)
                return a;
            else
                return gcd(b,a%b);
        }
        
        //Fast exponentiation (x^y mod m)
        public static long power(long x, long y, long m) { 
            if (y < 0) return 0L;
            long ans = 1;
            x %= m;
            while (y > 0) { 
                if(y % 2 == 1) 
                    ans = (ans * x) % m; 
                y /= 2;  
                x = (x * x) % m;
            } 
            return ans; 
        }
        
        public static int[] shuffle(int[] array) {
            Random rgen = new Random();
            for (int i = 0; i < array.length; i++) {
                int randomPosition = rgen.nextInt(array.length);
                int temp = array[i];
                array[i] = array[randomPosition];
                array[randomPosition] = temp;
            }
            return array;
        }
        
        public static long[] shuffle(long[] array) {
            Random rgen = new Random();
            for (int i = 0; i < array.length; i++) {
                int randomPosition = rgen.nextInt(array.length);
                long temp = array[i];
                array[i] = array[randomPosition];
                array[randomPosition] = temp;
            }
            return array;
        }
        
        public static int[][] shuffle(int[][] array) {
            Random rgen = new Random();
            for (int i = 0; i < array.length; i++) {
                int randomPosition = rgen.nextInt(array.length);
                int[] temp = array[i];
                array[i] = array[randomPosition];
                array[randomPosition] = temp;
            }
            return array;