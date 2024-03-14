Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
class p03748{
  static int[][][] dp;
  static int mod = (int)1e9+7;
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    dp = new int[2][n+1][2];
    dp[0][0][1]=1;
    for(int i=1;i<=n;++i)dp[0][i][0]=1;
    for(int i=0;i<m;++i){
      for(int j=0;j<=n;++j){
		for(int k=0;k<2;++k){
          if(j==0){
            if(k==0)dp[(i+1)%2][0][0]=0;
            else dp[(i+1)%2][0][1] = (dp[i%2][0][1] + (dp[i%2][1][0] + dp[i%2][1][1])%mod)%mod;
          }else if(j==1){
            if(k==0){
              if(n<2)dp[(i+1)%2][j][k]=0;
              else dp[(i+1)%2][1][0] = (dp[i%2][1][0]+dp[i%2][2][0])%mod;
            }else{
              if(n<2)dp[(i+1)%2][1][1] = (dp[i%2][1][0] + (dp[i%2][1][1]+dp[i%2][0][1])%mod)%mod;
              else dp[(i+1)%2][1][1] = (((dp[i%2][1][0]+dp[i%2][0][1])%mod + dp[i%2][1][1]*2%mod)%mod + dp[i%2][2][1])%mod;
            }
          }else{
            dp[(i+1)%2][j][k] = (dp[i%2][j][k]+dp[i%2][j-1][k])%mod;
            if(j+1<=n)dp[(i+1)%2][j][k] = (dp[(i+1)%2][j][k] + (dp[i%2][j][k]+dp[i%2][j+1][k])%mod)%mod;
          }
        }
      }
    }
    long ans = 0;
    for(int i=0;i<=n;++i)ans = (ans + dp[m%2][i][1])%mod;
    System.out.println(ans);
  }
}
```

### Response:
```python
import java.util.*;

class p03748:
  dp = None
  mod = (int)1e9+7

  def __init__(self):
    self.dp = [[[0]*2 for _ in range(n+1)] for _ in range(2)]

  def main(self):
    scan = Scanner(System.in)
    n = scan.nextInt()
    m = scan.nextInt()
    self.dp[0][0][1] = 1
    for i in range(1, n+1):
      self.dp[0][i][0] = 1
    for i in range(m):
      for j in range(n+1):
        for k in range(2):
          if j == 0:
            if k == 0:
              self.dp[(i+1)%2][0][0] = 0
            else:
              self.dp[(i+1)%2][0][1] = (self.dp[i%2][0][1] + (self.dp[i%2][1][0] + self.dp[i%2][1][1])%self.mod)%self.mod
          elif j == 1:
            if k == 0:
              if n < 2:
                self.dp[(i+1)%2][1][0] = 0
              else:
                self.dp[(i+1)%2][1][0] = (self.dp[i%2][1][0]+self.dp[i%2][2][0])%self.mod
            else:
              if n < 2:
                self.dp[(i+1)%2][1][1] = (self.dp[i%2][1][0] + (self.dp[i%2][1][1]+self.dp[i%2][0][1])%self.mod)%self.mod
              else:
                self.dp[(i+1)%2][1][1] = (((self.dp[i%2][1][0]+self.dp[i%2][0][1])%self.mod + self.dp[i%2][1][1]*2%self.mod)%self.mod + self.dp[i%2][2][1])%self.mod
          else:
            self.dp[(i+1)%2][j][k] = (self.dp[i%2][j][k]+self.dp[i%2][j-1][k])%self.mod
            if j+1 <= n:
              self.dp[(i+1)%2][j][k] = (self.dp[(i+1)%2][j][k] + (self.dp[i%2][j][k]+self.dp[i%2][j+1][k])%self.mod)%self.mod
    ans = 0
    for i in range(n+1):
      ans = (ans + self.dp[m%2][i][1])%self.mod
    System.out.println(ans)

p03748().main()
```<|endoftext|>
