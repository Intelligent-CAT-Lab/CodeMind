

```python
import sys

def dfs(n, s):
    if n == len(ch):
        a = int(S[len(startStr):])
        b = int(s)
        diff = abs(a - b)
        global minDiff, ansStr
        if minDiff > diff:
            ansStr = startStr + s
            minDiff = diff
        return
    for i in range(10):
        if use[i]:
            continue
        use[i] = True
        dfs(n + 1, s + str(i))
        use[i] = False

S = sys.stdin.readline().strip()
ch = list(S)
startStr = ""
ansStr = ""
use = [False] * 10
minDiff = sys.maxsize
dfs(0, "")
print(ansStr)
```

## 01830

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class p01830 {
    char[] ch;
    String S;
    boolean[] use = new boolean[10];

    long minDiff = Long.MAX_VALUE;
    String ansStr;
    String startStr;

    public void dfs(int n)
    {
        if(n == ch.length){
            ansStr = startStr;
            return;
        }

        if(n == 0){
            use[(ch[n] - '0' + 5) % 10] = true;
            startStr = startStr + (char)((ch[n] - '0' + 5) % 10 + '0');
            dfs(n + 1);
            return;
        }

        if(!use[ch[n] - '0']){
            dfs2(n,"");
            use[ch[n] - '0'] = true;
            startStr = startStr + ch[n];
            dfs(n + 1);
            return;
        }
        dfs2(n,"");
    }

    public void dfs2(int n,String s){
        if(n == ch.length){
            long a = Long.valueOf(S.substring(startStr.length()));
            long b = Long.valueOf(s);

            long diff = Math.abs(a - b);

            if(minDiff > diff){
                ansStr = startStr + s;
                minDiff = diff;
            }
            return;
        }

        for(int i = 0;i < 10;i++){
            if(use[i])continue;
            use[i] = true;
            dfs2(n + 1,s + (char)(i + '0'));
            use[i] = false;
        }
    }

    public void solve() {
        S = next();
        ch = S.toCharArray();
        startStr = "";
        ansStr = "";
        dfs(0);
        out.println(ansStr);

    }

    public static void main(String[] args) {
        out.flush();
        new p01830().solve();
        out.close();
    }

    /* Input */
    private static final InputStream in = System.in;
    private static final PrintWriter out = new PrintWriter(System.out);
    private final byte[] buffer = new byte[2048];
    private int p = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (p < buflen)
            return true;
        p = 0;
        try {
            buflen = in.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (buflen <= 0)
            return false;
        return true;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrint(buffer[p])) {
            p++;
        }
        return hasNextByte();
    }

    private boolean isPrint(int ch) {
        if (ch >= '!' && ch <= '~')
