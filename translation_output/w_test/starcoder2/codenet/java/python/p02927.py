

```python
M, D = map(int, input().split())
ans = 0
for m in range(1, M + 1):
    for d in range(1, D + 1):
        d1 = d % 10
        d2 = d // 10
        if d1 >= 2 and d2 >= 2 and d1 * d2 == m:
            ans += 1
print(ans)
```

## 2. 1000000007

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
import java.io.*;
import java.util.*;
import java.util.Map.Entry;

@SuppressWarnings("unused")
public class p02928 {
    FastScanner in = new FastScanner(System.in);
    PrintWriter out = new PrintWriter(System.out);
    final int MOD = (int)1e9+7;
    void printlnYN(boolean b){out.println((b ? "Yes" : "No"));}

    void solve() throws Exception{
        int N = in.nextInt();
        out.println(N - 1);
    }

    public static void main(String[] args) throws Exception {
        new p02928().m();
    }

    void m() throws Exception {
        solve();
        out.flush();
    }

    static class FastScanner {
        Reader input;

        FastScanner() {this(System.in);}
        FastScanner(InputStream stream) {this.input = new BufferedReader(new InputStreamReader(stream));}

        int nextInt() {return (int) nextLong();}

        long nextLong() {
            try {
                int sign = 1;
                int b = input.read();
                while ((b < '0' || '9' < b) && b != '-' && b != '+') {
                    b = input.read();
                }
                if (b == '-') {
                    sign
