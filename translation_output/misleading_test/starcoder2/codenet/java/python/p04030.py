
```
s = input()
t = ""
for i in range(len(s)):
    if s[i] != 'B':
        t += s[i]
    elif t == "":
        continue
    else:
        t = t[:-1]
print(t)
```

## 04031

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000

```
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class p04031 {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        long n = sc.nextLong();
        long ans = 0
