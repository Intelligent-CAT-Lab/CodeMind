import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static int[] fact;
    public static int mod;
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        mod = 998244353;
        fact = new int[3000001];
        fact[0] = 1;
        for(int i=1; i<fact.length; i++) fact[i] = (int)((1L*fact[i-1]*i)%mod);

        long ans = getAns(n, 3*m, 2*m);
        int sign = -1;
        for(int numOnes = m+1; numOnes <= n; numOnes++) {
          //out.println(ans);
          if((3*m - numOnes) % 2 != 0) continue;
          ans += (1L * sign * (1L*choose(n, numOnes) * getAns(n, (3*m-numOnes)/2, m) % mod)) % mod; //* choose(numOnes-1, numOnes-m-1)) % mod;
          //out.println(getAns(n-numOnes, 3*m-numOnes, 2*m));
        //  sign = -1*sign;
          ans += mod;
          ans %= mod;
        }
        out.println(ans);

        // int n = Integer.parseInt(bf.readLine());
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n]; for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
        // int n = Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }
    // Exponentation
    public static int getAns(int num, int sum, int upperbound) {
      if((sum ==0) && (num == 0)) return 1;
      long ans = 0L + 1L*choose(sum+num-1, num-1) - (1L*num*choose(num-1+(sum-upperbound-1), num-1))%mod  + mod;
      return (int)(ans%mod);
    }
    public static int exp(int base, int e) {
      if(e == 0) return 1;
      if(e == 1) return base;
      int val = exp(base, e/2);
      int ans = (int)(1L*val*val % mod);
      if(e % 2 == 1)
        ans = (int)(1L*ans*base % mod);
      return ans;
    }
    public static int inv(int base) {
      return exp(base, mod-2);
    }
    public static int choose(int n, int m) {
      if(n<0) return 0;
      if(m<0) return 0;
      if(m>n) return 0;
      return (int)(1L*(1L*fact[n]*inv(fact[m]) %mod)*inv(fact[n-m]) % mod);
    }
}
