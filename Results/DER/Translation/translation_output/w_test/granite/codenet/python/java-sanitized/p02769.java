import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	//Fast IO class
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null ||!st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
  
    public static void main (String[] args) throws java.lang.Exception
    {
        FastReader sc = new FastReader();
        int mod = 100000007;
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        if(n <= k) {
            long[] fact = new long[n+1];
            fact[0] = 1;
            for(int i = 1; i <= n; i++) {
                fact[i] = (fact[i-1]*i)%mod;
            }
            long[] inv = new long[n+1];
            inv[n] = power(fact[n], mod-2, mod);
            for(int i = n-1; i >= 0; i--) {
                inv[i] = (inv[i+1]*(i+1))%mod;
            }
            long[] pow2 = new long[n+1];
            pow2[0] = 1;
            for(int i = 1; i <= n; i++) {
                pow2[i] = (pow2[i-1]*2)%mod;
            }
            for(int i = 0; i < n; i++) {
                long temp = fact[n-1]*inv[i];
                temp %= mod;
                temp *= inv[n-i-1];
                temp %= mod;
                temp *= pow2[n-i-1];
                temp %= mod;
                temp *= fact[n-1];
                temp %= mod;
                temp *= inv[i];
                temp %= mod;
                temp *= inv[n-i-1];
                temp %= mod;
                ans += temp;
                ans %= mod;
            }
        } else {
            long[] fact = new long[k+1];
            fact[0] = 1;
            for(int i = 1; i <= k; i++) {
                fact[i] = (fact[i-1]*i)%mod;
            }
            long[] inv = new long[k+1];
            inv[k] = power(fact[k], mod-2, mod);
            for(int i = k-1; i >= 0; i--) {
                inv[i] = (inv[i+1]*(i+1))%mod;
            }
            long[] pow2 = new long[k+1];
            pow2[0] = 1;
            for(int i = 1; i <= k; i++) {
                pow2[i] = (pow2[i-1]*2)%mod;
            }
            for(int i = 0; i < k; i++) {
                long temp = fact[k-1]*inv[i];
                temp %= mod;
                temp *= inv[k-i-1];
                temp %= mod;
                temp *= pow2[k-i-1];
                temp %= mod;
                temp *= fact[n-1];
                temp %= mod;
                temp *= inv[i];
                temp %= mod;
                temp *= inv[n-i-1];
                temp %= mod;
                ans += temp;
                ans %= mod;
            }
            long[] pow3 = new long[n+1];
            pow3[0] = 1;
            for(int i = 1; i <= n; i++) {
                pow3[i] = (pow3[i-1]*3)%mod;
            }
            for(int i = k+1; i <= n; i++) {
                ans += (fact[n-1]*inv[i-1])%mod;
                ans %= mod;
                ans *= inv[n-i];
                ans %= mod;
                ans *= pow3[i-k-1];
                ans %= mod;
                ans *= fact[n-1];
                ans %= mod;
                ans *= inv[i-1];
                ans %= mod;
                ans *= inv[n-i];
                ans %= mod;
            }
        }
        System.out.println(ans);
    }
    
    static long power(long x, long y, long p) { 
        long res = 1;      
        x = x % p;  
        if (x == 0) return 0;   
        while (y > 0) { 
            if((y & 1)==1) 
                res = (res * x) % p; 
            y = y >> 1;  
            x = (x * x) % p; 
        } 
        return res; 
    } 
}