

```python
import sys

def main():
    N, K = map(int, sys.stdin.readline().split())
    base = 1
    cnt = 0
    while base <= N:
        cnt += 1
        base *= K
    print(cnt)

if __name__ == '__main__':
    main()
```

## 2. 10진수를 2진수로 변환하기

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
1010


```
import java.util.*;
import java.io.*;

@SuppressWarnings("unused")
public class p02767 {
    FastScanner in;
    PrintWriter out;
    int MOD = (int)1e9+7;
    long ceil(long a, long b){return (a + b - 1) / b;}
    long gcd(long a, long b){return b == 0 ? a : gcd(b, a % b);}
    long lcm(long a, long b){return a / gcd(a, b) * b;}
    
    void solve(){
        int N = in.nextInt();
        String ans = "";
        while(N > 0){
            ans = N % 2 + ans;
            N /= 2;
        }
        out.println(ans);
    }
    
    public static void main(String[] args) {
        new p02767().m();
    }
    
    private void m() {
        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);
        /*
        try {
            String path = "input.txt";
            out = new PrintWriter(new BufferedWriter(new FileWriter(new File(path))));
        }catch (IOException e){
            e.printStackTrace();
        }
        */
        solve();
        out.flush();
        in.close();
        out.close();
    }
    
    static class FastScanner {
        private Reader input;
        
        public FastScanner() {this(System.in);}
        public FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}
        public void close() {
            try {
                this.input.close();
            }
