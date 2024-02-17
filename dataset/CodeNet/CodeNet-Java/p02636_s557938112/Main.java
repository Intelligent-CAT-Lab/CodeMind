import java.util.*;
import java.io.*;

class Main {
  public static void main(String [] args) {
    Reader in = new Reader();
    char [] s = in.next().toCharArray();
    StringProcessor solver = new StringProcessor(s);
    System.out.println(solver.countWays());
  }
}
class StringProcessor {
  char [] s;
  int n;
  final int mod = 998244353;
  boolean [][][] vis;
  int [][][] mem;
  int [] cnt;
  int [][] opt;

  StringProcessor(char [] s) {
    this.s = s.clone();
    this.n = this.s.length;
    vis = new boolean [this.n + 1][this.n + 1][this.n + 1];
    cnt = new int [this.n + 1];
    opt = new int [this.n + 1][this.n + 1];
    mem = new int [this.n + 1][this.n + 1][this.n + 1];
    cnt[n] = 0;
    for(int i = n - 1; i >= 0; i--) {
      cnt[i] = cnt[i + 1];
      if(s[i] == '1') cnt[i] = cnt[i] + 1;
    }
    for(int i = 0; i <= n; i++) {
      for(int j = 0; j <= n; j++) {
        for(int k = 0; k <= n; k++) {
          mem[i][j][k] = -1;
          vis[i][j][k] = false;
        }
        opt[i][j] = -1;
      }
    }
  }
  void dfs(int cur, int cntMove, int cntOne) {
    if(vis[cur][cntMove][cntOne]) return ;
    vis[cur][cntMove][cntOne] = true;
    opt[cntMove][cntOne + cnt[cur]] = Math.max(opt[cntMove][cntOne + cnt[cur]], cur);
    int cntZero = cur - cntMove - cntOne;
    if(cntOne >= 2) {
      dfs(cur, cntMove + 1, cntOne - 1);
    }
    if(cntZero >= 2) {
      dfs(cur, cntMove + 1, cntOne);
    }
    if(cntOne >= 1 && cntZero >= 1) {
      dfs(cur, cntMove + 1, cntOne - 1);
      dfs(cur, cntMove + 1, cntOne);
    }
    if(cur + 2 <= n) {
      if(s[cur] == '0' || s[cur + 1] == '0') {
        dfs(cur + 2, cntMove + 1, cntOne);
      }
      if(s[cur] == '1' || s[cur + 1] == '1') {
        dfs(cur + 2, cntMove + 1, cntOne + 1);
      }
    }
    if(cur + 1 <= n) {
      if(s[cur] == '0') {
        if(cntOne > 0) {
          dfs(cur + 1, cntMove + 1, cntOne - 1);
          dfs(cur + 1, cntMove + 1, cntOne);
        }
        if(cntZero > 0) dfs(cur + 1, cntMove + 1, cntOne);
      } else {
        if(cntZero > 0) {
          dfs(cur + 1, cntMove + 1, cntOne + 1);
          dfs(cur + 1, cntMove + 1, cntOne);
        }
        if(cntOne > 0) dfs(cur + 1, cntMove + 1, cntOne);
      }
    }
  }
  int dp(int cur, int cntOne, int cntZero) {
    if(cntOne == 0 && cntZero == 0) {
      return (cur == n) ? 1 : 0;
    }
    if(mem[cur][cntOne][cntZero] != -1) {
      return mem[cur][cntOne][cntZero];
    }
    int ans = 0;
    if(cur < n) {
      if(s[cur] == '0') {
        if(cntZero > 0) ans += dp(cur + 1, cntOne, cntZero - 1);
        if(cntOne > 0) ans += dp(cur, cntOne - 1, cntZero);
      } else {
        if(cntOne > 0) ans += dp(cur + 1, cntOne - 1, cntZero);
        if(cntZero > 0) ans += dp(cur, cntOne, cntZero - 1);
      }
      ans %= mod;
    } else {
      if(cntOne > 0) {
        ans += dp(cur, cntOne - 1, cntZero);
      }
      if(cntZero > 0) {
        ans += dp(cur, cntOne, cntZero - 1);
      }
      ans %= mod;
    }
    return mem[cur][cntOne][cntZero] = ans;
  } 
  int countWays() {
    dfs(0, 0, 0);
    int ans = 0;
    for(int i = 0; i <= n; i++) {
      for(int j = 0; j <= n; j++) {
        int idx = opt[i][j];
        if(idx < 0) continue;
        ans += dp(idx, j, n - i - j);
        ans %= mod;
      }
    }
    return ans;
  }
}

class Reader {
  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  StringTokenizer s = new StringTokenizer("");
  Reader () {}
  String nextLine() {
    try {
      return in.readLine();
    } catch (Exception e) {
      e.printStackTrace();
      return "Error";
    }
  }
  String next() {
    while(!s.hasMoreTokens()) {
      s = new StringTokenizer(nextLine());
    }
    return s.nextToken();
  }
  int nextInt() {
    return Integer.parseInt(next());
  }
}

