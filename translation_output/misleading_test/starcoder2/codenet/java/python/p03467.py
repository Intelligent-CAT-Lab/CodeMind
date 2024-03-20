

```python
P = 998244353

def go(s):
    if s == '':
        return 1
    if s in map:
        return map[s]
    ret = (1 + int(s[0]) - ord('0')) * go(s[1:]) % P
    for x in range(1, len(s) // 2 + 1):
        buf = list(s[:x])
        for k in range(2, len(s) // x + 1):
            for i in range(x):
                if s[x * (k - 1) + i] == '0':
                    buf[i] = '0'
            ret += go(''.join(buf)) * go(s[x * k:]) % P
    map[s] = ret
    return ret

map = {}
s = input()
print(go(s))
```

## 03468 - 011011

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
011011

Expected output:
101010

```
import java.io.*;
import java.util.*;

public class p03468 {

    static final int P = 998244353;

    HashMap<String, Integer> map = new HashMap<>();

    int go(String s) {
        if (s.isEmpty()) {
            return 1;
        }
        if (map.containsKey(s)) {
            return map.get(s);
        }

        long ret = (long) (1 + s.charAt(0) - '0') * go(s.substring(1)) % P;
        for (int x = 1; 2 * x <= s.length(); x++) {
            char[] buf = s.substring(0, x).toCharArray();
            for (int k = 2; x * k <= s.length(); k++) {
                for (int i = 0; i < x; i++) {
                    if (s.charAt((k - 1) * x + i) == '0') {
                        buf[i] = '0';
                    }
                }
                ret += (long) go(new String(buf)) * go(s.substring(k * x)) % P;
            }
        }

        int iret = (int) (ret % P);
        map.put(s, iret);
        return iret;
    }

    void submit() {
        String s = nextToken();
        out.println(go(s));
    }

    void preCalc() {

    }

    void stress() {

    }

    void test() {

    }

    p03468() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
        preCalc();
        submit();
        // stress();
        // test();
        out.close();
    }

    static final Random rng = new Random();

    static int rand(int l, int r) {
        return l + rng.nextInt(r - l + 1);
    }

    public static void main(String[] args) throws IOException {
        new p03468();
    }

    BufferedReader br;
    PrintWriter out;
    StringTokenizer st;

    String nextToken() {
        while (st == null || !st.hasMoreTokens()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return st.nextToken();
    }

    String nextString() {
        try {
            return br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    int nextInt() {
        return Integer.parseInt(nextToken());
    }

    long nextLong() {
        return Long.parseLong(nextToken());
    }

    double nextDouble() {
        return Double.parseDouble(nextToken());
    }
}

```

python code:

```python
P = 998244353

def go(s):
    if s == '':
        return 1
    if s in map:
        return map[s]
    ret = (1 + int(s[0]) - ord('0')) * go(s[1:]) % P
    for x in range(1, len(s) // 2 + 1):
        buf = list(s[:x])
        for k in range(2, len(s) // x + 1):
            for i in range(x):
                if s[x * (k - 1) + i] == '0':
                    buf[i] = '0'
            ret += go(''.join(buf)) * go(s[x * k:]) % P
    map[s] = ret
    return ret

map = {}
s = input()
print(go(s))
```

## 03469 - 011011011

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
011011011

Expected output:
101010101

```
import java.io.*;
import java.util.*;

public class p03469 {

    static final int P =
