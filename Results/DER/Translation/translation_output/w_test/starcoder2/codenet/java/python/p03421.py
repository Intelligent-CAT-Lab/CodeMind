

```python
import sys

def calc(n, a, b):
    for i in range(n - a + 1, n + 1):
        print(i, end=' ')
    rest = n - a - b + 1
    if rest < 0:
        print(-1)
        return
    elif rest >= 1:
        if not calcInner(rest, a - 1, b - 1):
            print(-1)
            return
    for i in range(n - a, rest, -1):
        print(i, end=' ')
    print()

def calcInner(n, a, b):
    first = []
    second = []
    while True:
        if a <= 0 or b <= 0:
            return False
        firstI = n - a + 1 if n - a + 1 >= 1 else 1
        for i in range(firstI, n + 1):
            first.append(i)
        rest = n - a - b + 1
        endI = rest + 1 if rest + 1 >= 1 else 1
        subSecond = []
        for i in range(firstI - 1, endI - 1, -1):
            subSecond.append(i)
        second = subSecond + second
        if rest <= 0:
            print(*first, *second, sep=' ')
            return True
        else:
            n = rest
            a -= 1
            b -= 1

n, a, b = map(int, sys.stdin.readline().split())
calc(n, a, b)
```

## 3422. 1000000007

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000007


```
import java.io.*;
import java.util.*;
 
 
public class p03422 implements Runnable {
 
  public void run() {
    BetterScanner scanner = new BetterScanner(System.in);

    int n = scanner.nextInt();

    System.out.println(n);
  }
 
  public static void main(String[] args) {
    p03422 main = new p03422();
    main.run();
  }
 
  // scanner slightly faster than usual ones
  public static class BetterScanner {
 
    private InputStream stream;
    private byte[] buffer = new byte[1024];
    private int pointer = 0;
    private int bufferLength = 0;
 
    public BetterScanner(InputStream stream) {
      this.stream = stream;
    }
 
    private boolean updateBuffer() {
      if (pointer >= bufferLength) {
        pointer = 0;
        try {
          bufferLength = stream.read(buffer);
        } catch (IOException exception) {
          exception.printStackTrace();
        }
        return bufferLength > 0;
      } else {
        return true;
      }
    }
 
    private int read() {
      if (updateBuffer()) {
        return buffer[pointer ++];
      } else {
        return -1;
      }
    }
 
    public boolean hasNext() {
      skipUnprintable();
      return updateBuffer();
    }
 
    private void skipUnprintable() { 
      while (updateBuffer() && !isPrintableChar(buffer[pointer])) {
        pointer ++;
      }
    }
 
    public String next() {
      if (hasNext()) {
        StringBuilder builder = new StringBuilder();
        int codePoint = read();
        while (isPrintableChar(codePoint)) {
          builder.appendCodePoint(codePoint);
          codePoint = read();
        }
        return builder.toString();
      } else {
        throw new NoSuchElementException();
      }
    }
 
    public long nextLong() {
      if (hasNext())
