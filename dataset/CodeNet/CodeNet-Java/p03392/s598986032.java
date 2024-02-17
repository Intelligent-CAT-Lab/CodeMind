import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String s = bf.readLine();
        int n = s.length();
        Set<String> abc = new HashSet<String>();
        abc.add("abc");
        abc.add("acb");
        abc.add("bac");
        abc.add("bca");
        abc.add("cab");
        abc.add("cba");
        int diff = 0;
        for(int i=0; i<n-1; i++) {
          if(s.charAt(i) != s.charAt(i+1)) diff++;
        }
        if(n <= 2) {
          if(s.charAt(0) == s.charAt(1)) out.println(1);
          else out.println(2);
        }
        else if(abc.contains(s)) out.println("3");
        else if(diff == 0){
          out.println("1");

        }
        else {
        int mod = 998244353;
        long[][][] dp = new long[n][3][3]; // 0, 1, 2 as last remainder;
        long[][][] dp_no_dpl = new long[n][3][3]; // a, b, c as last digit; 0, 1, 2 as last remainder
        long ans = 1;
        for(int i=0; i<n-1; i++) {
          if(s.charAt(i) == s.charAt(i+1)) ans = 0;
        }
        int sum = 0;
        for(int i=0; i<n; i++) {
          sum += (s.charAt(i)-'a');
          sum %= 3;
        }
        dp[0][0][0] = 1;
        dp[0][1][1] = 1;
        dp[0][2][2] = 1;
        dp_no_dpl[0][0][0] = 1;
        dp_no_dpl[0][1][1] = 1;
        dp_no_dpl[0][2][2] = 1;
        for(int i=1; i<n; i++) {
          for(int j=0; j<3; j++) {
            dp_no_dpl[i][0][j] += dp_no_dpl[i-1][1][(j+3-0)%3];
            dp_no_dpl[i][0][j] += dp_no_dpl[i-1][2][(j+3-0)%3];
            dp_no_dpl[i][1][j] += dp_no_dpl[i-1][0][(j+3-1)%3];
            dp_no_dpl[i][1][j] += dp_no_dpl[i-1][2][(j+3-1)%3];
            dp_no_dpl[i][2][j] += dp_no_dpl[i-1][0][(j+3-2)%3];
            dp_no_dpl[i][2][j] += dp_no_dpl[i-1][1][(j+3-2)%3];

            for(int k=0; k<3; k++) dp_no_dpl[i][k][j] %= mod;
          }
        }

        ans += exp(3, n-1, mod) + mod;
        ans += 1L*3*mod - dp_no_dpl[n-1][0][sum] - dp_no_dpl[n-1][1][sum] - dp_no_dpl[n-1][2][sum];
        ans %= mod;
        out.println(ans);
        }
        //
        // int n = Integer.parseInt(bf.readLine());
        // StringTokenizer st = new StringTokenizer(bf.readLine());
        // int[] a = new int[n];
        // for(int i=0; i<n; i++) a[i] =  Integer.parseInt(st.nextToken());

        out.close(); System.exit(0);
    }

    public static int exp(int base, int e, int mod) {
      if(e == 0) return 1;
      if(e == 1) return base;
      int val = exp(base, e/2, mod);
      int ans = (int)(1L*val*val % mod);
      if(e % 2 == 1)
        ans = (int)(1L*ans*base % mod);
      return ans;
    }
}
