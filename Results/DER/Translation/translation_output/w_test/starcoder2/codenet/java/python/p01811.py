

```python
import sys

def main():
    S = sys.stdin.readline().strip()
    while len(S) > 3:
        abc = False
        for i in range(len(S) - 2):
            if S[i:i+3] == "ABC":
                S = S[:i] + "X" + S[i+3:]
                abc = True
        if not abc:
            print("No")
            return

        check = [False] * 3
        for i in range(len(S)):
            if S[i] >= 'A' and S[i] <= 'C':
                check[ord(S[i]) - ord('A')] = True
        cnt = 0
        for t in check:
            if t:
                cnt += 1
        if cnt != 2:
            print("No")
            return
        for i in range(3):
            if not check[i]:
                c = chr(i + ord('A'))
                S = S.replace("X", c)
    if S == "ABC":
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

## 01812

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 10

Expected output:
100


```
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

/*
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O
