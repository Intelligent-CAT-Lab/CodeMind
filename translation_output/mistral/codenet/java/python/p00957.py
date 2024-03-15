<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.*;
import java.util.*;


class p00957 {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        int l=sc.nextInt();
        int k=sc.nextInt();
        long[][]dp=new long[2][l+1];
        dp[0][0]=1;
        for(int i=1;i<=l;++i){
            dp[0][i]+=dp[1][i-1];
            dp[1][i]+=dp[0][i-1];
            if(i>=k)
                dp[1][i]+=dp[0][i-k];
        }
        long ans=0;
        for(int i=1;i<=l;++i)
            ans+=dp[1][i];
        out.println(ans);
        out.close();
    }
    // http://codeforces.com/blog/entry/7018
    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;
    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
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
        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
```
[/INST]
```python
import sys

def input():
    global br, st
    br = sys.stdin
    st = sys.stdin.readline().strip().split()

def next():
    global st
    while st == None or not st.hasmoretokens():
        try:
            st = sys.stdin.readline().strip().split()
        except:
            pass
    return st[0]

def next_int():
    return int(next())

def next_long():
    return long(next())

def next_double():
    return float(next())

def next_line():
    return sys.stdin.readline().strip()

l = int(input())
k = int(input())

dp = [[1] * (l+1) for _ in range(2)]

for i in range(1, l+1):
    dp[0][i] += dp[1][i-1]
    dp[1][i] += dp[0][i-1]
    if i >= k:
        dp[1][i] += dp[0][i-k]

ans = 0
for i in range(1, l+1):
    ans += dp[1][i]

print(ans)
```</s>
