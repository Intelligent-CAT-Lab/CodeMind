
```
import sys

def main():
    n, x, y, z = map(int, input().split())
    sum = x + y + z + 1
    mask = 1 << sum
    mask -= 1
    dp = [[0] * (mask + 1) for _ in range(n + 1)]
    ng = 0
    ng |= 1 << z
    ng |= 1 << (y + z)
    ng |= 1 << (x + y + z)
    dp[0][1] = 1
    for i in range(n):
        for state in range(mask + 1):
            for j in range(1, 11):
                res = ((state << j) & mask) + 1
                if (res & ng) == ng:
                    continue
                dp[i + 1][res] += dp[i][state]
                dp[i + 1][res] %= 1000000007
    ans = 1
    for i in range(n):
        ans *= 10
        ans %= 1000000007
    for i in range(mask + 1):
        ans -= dp[n][i]
        ans %= 1000000007
    print((ans + 1000000007) % 1000000007)

if __name__ == '__main__':
    main()
```

## 04042 - 1000000007

### 問題文

1000000007で割ったあまりを求めよ。

### 解法

1000000007は素数なので、フェルマーの小定理を使う。

### 実装

```
import java.io.*;
import java.util.*;
import java.math.*;
// import java.awt.Point;
 
public class p04042 {
    InputStream is;
    PrintWriter out;
    String INPUT = "";
 
    long MOD = 1_000_000_007;
    int inf = Integer.MAX_VALUE/2;


    void solve(){
        long n = nl();
        long ans = 1;
        for(int i = 0; i < n; i++){
            ans *= 10;
            ans %= MOD;
        }
        out.println(ans);
    }
    

    void run() throws Exception
    {
        is = INPUT.isEmpty() ? System.in : new ByteArrayInputStream(INPUT.getBytes());
        out = new PrintWriter(System.out);
        long s = System.currentTimeMillis();
        solve();
        out.flush();
        if(!INPUT.isEmpty())tr(System.currentTimeMillis()-s+"ms");
    }
    
    public static void main(String[] args) throws Exception { new p04042().run(); }
    
    private byte[] inbuf = new byte[1024];
    private int lenbuf = 0, ptrbuf = 0;
    
    private int readByte()
    {
        if(lenbuf == -1)throw new InputMismatchException();
        if(ptrbuf >= lenbuf){
            ptrbuf = 0;
            try { lenbuf = is.read(inbuf); } catch (IOException e) { throw new InputMismatchException(); }
            if(lenbuf <= 0)return -1;
        }
        return inbuf[ptrbuf++];
    }
    
    private boolean isSpaceChar(int c)
