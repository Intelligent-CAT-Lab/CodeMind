<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 3

Expected output:
6


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

Here is the Python code that translates the Java code:
```python
import sys

class MyScanner:
    def __init__(self):
        self.br = sys.stdin
        self.st = None

    def next(self):
        while self.st is None or not self.st.hasMoreElements():
            try:
                self.st = sys.stdin.readline()
            except IOError:
                pass
        return self.st.nextToken()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.br.readline()

class p00957:
    def __init__(self):
        self.sc = MyScanner()
        self.out = sys.stdout

    def main(self):
        l = self.sc.nextInt()
        k = self.sc.nextInt()
        dp = [[0] * (l + 1) for _ in range(2)]
        dp[0][0] = 1
        for i in range(1, l + 1):
            dp[0][i] += dp[1][i - 1]
            dp[1][i] += dp[0][i - 1]
            if i >= k:
                dp[1][i] += dp[0][i - k]
        ans = 0
        for i in range(1, l + 1):
            ans += dp[1][i]
        self.out.write(str(ans) + '\n')
        self.out.close()

if __name__ == '__main__':
    p00957().main()
```
Note that the `MyScanner` class is not necessary in Python, as the `sys.stdin` object can be used to read input from the console. The `MyScanner` class is only used to mimic the behavior of the `Scanner` class in Java.</s>
