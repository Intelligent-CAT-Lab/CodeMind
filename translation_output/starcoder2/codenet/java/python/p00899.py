
```
import sys

def solve():
    N = int(sys.stdin.readline())
    if N == 0:
        return
    str = []
    for i in range(N):
        str.append(sys.stdin.readline().strip())

    eq = [False] * N
    for i in range(N):
        if eq[i]:
            continue
        for j in range(N):
            if i != j and not eq[j] and str[i].find(str[j]) != -1:
                eq[j] = True

    str2 = []
    for i in range(N):
        if not eq[i]:
            str2.append(str[i])
    N2 = len(str2)

    len = [[0] * N2 for i in range(N2)]
    for i in range(N2):
        for j in range(N2):
            if i == j:
                continue
            offset = 0
            l = len(str2[i])
            for offset in range(l):
                if str2[j].startswith(str2[i][offset:]):
                    break
            len[i][j] = len(str2[j]) - (l - offset)

    dp = [[1000000000] * N2 for i in range(1 << N2)]
    for i in range(N2):
        dp[1 << i][i] = len(str2[i])
    for i in range(1 << N2):
        for j in range(N2):
            if dp[i][j] >= 1000000000:
                continue
            for k in range(N2):
                if (i & (1 << k)) > 0:
                    continue
                newIdx = i | (1 << k)
                dp[newIdx][k] = min(dp[newIdx][k], dp[i][j] + len[j][k])

    ans = 1000000000
    tmp = (1 << N2) - 1
    for i in range(N2):
        ans = min(ans, dp[tmp][i])
    print(ans)

while True:
    solve()
```

## 00900 - 00999

### 00900 - 00999 - 00900 - The Monkey and the Oiled Bamboo

#### Problem

[The Monkey and the Oiled Bamboo](http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=00900)

#### Solution

```
import java.util.*;
import static java.lang.Math.*;
public class p00900 {
    final Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        new p00900().init();
    }
    void init(){
        final long STACK_SIZE=8*1024*1024;
        new Thread(null, new AOJ00900(), "RUN", STACK_SIZE).start();
    }
    
    class AOJ00900 implements Runnable{
        AOJ00900(){}
        @Override public void run(){
            while(sc.hasNext()){
                N=sc.nextInt();
                if(N==0)    break;
                solve();
            }
        }
        
        int N;
        final int INF=1<<29;
        
        void solve(){
            int[] a=new int[N];
            for(int i=0; i<N; ++i)    a[i]=sc.nextInt();
            
            int[] dp=new int[N];
            for(int i=0; i<N; ++i)    dp[i]=INF;
            for(int i=0; i<N; ++i){
                int idx=lowerBound(dp,a[i]);
                dp[idx]=a[i];
            }
            int ans=0;
            for(int i=0; i<N; ++i)if(dp[i]<INF)    ++ans;
            System.out.println(ans);
        }
        
        int lowerBound(int[] a, int key){
            int l=0, r=a.length;
            while(r-l>1){
                int m=(l+r)/2;
                if(a[m]>=key)    r=m;
                else            l=m;
            }
            return r;
        }
    }
}
```

python code:
```
import sys

def solve():
    N = int(sys.stdin.readline())
    if N == 0:
        return
    a = []
    for i in range(N):
        a.append(int(sys.stdin.readline()))

    dp = [1000000000] * N
    for i in range(N):
        idx = lowerBound(dp, a[i])
        dp[idx] = a[i]
    ans = 0
    for i in range(N):
        if
