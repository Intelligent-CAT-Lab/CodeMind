<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 3 2

Expected output:
2 4 1 5 3


```
import java.io.*;
import java.util.*;
 
 
public class p03421 implements Runnable {
 
  public void run() {
    BetterScanner scanner = new BetterScanner(System.in);

    int n = scanner.nextInt();
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    calc(n, a, b);
  }

  StringBuilder output = new StringBuilder();

  public void calc(int n, int a, int b) {
    for (int i = n - a + 1 ; i <= n ; i ++) {
      output.append(i).append(" ");
    }
    int rest = n - a - b + 1;
    if (rest < 0) {
      System.out.println(-1);
      return;
    } else if (rest >= 1) {
      if (!calcInner(rest, a - 1, b - 1)) {
        System.out.println(-1);
        return;
      }
    }
    for (int i = n - a ; i >= rest + 1 ; i --) {
      output.append(i).append(" ");
    }
    output.deleteCharAt(output.length() - 1);
    System.out.println(output);
  }

  public boolean calcInner(int n, int a, int b) {
    StringBuilder first = new StringBuilder();
    StringBuilder second = new StringBuilder();
    while (true) {
      if (a <= 0 || b <= 0) {
        return false;
      }
      int firstI = (n - a + 1 >= 1)? n - a + 1 : 1;
      for (int i = firstI ; i <= n ; i ++) {
        first.append(i).append(" ");
      }
      int rest = n - a - b + 1;
      int endI = (rest + 1 >= 1)? rest + 1 : 1;
      StringBuilder subSecond = new StringBuilder();
      for (int i = firstI - 1 ; i >= endI ; i --) {
        subSecond.append(i).append(" ");
      }
      second.insert(0, subSecond);
      if (rest <= 0) {
        output.append(first);
        output.append(second);
        return true;
      } else {
        n = rest;
        a --; b --;
      }
    }
  }
 
  public static void main(String[] args) {
    p03421 main = new p03421();
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
      while (updateBuffer() &&!isPrintableChar(buffer[pointer])) {
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
      if (hasNext()) {
        long number = 0;
        boolean minus = false;
        int codePoint = read();
        if (codePoint == '-') {
          minus = true;
          codePoint = read();
        }
        if (codePoint >= '0' && codePoint <= '9') {
          while (true) {
            if (codePoint >= '0' && codePoint <= '9') {
              number *= 10;
              number += codePoint - '0';
            } else if (codePoint < 0 ||!isPrintableChar(codePoint)) {
              return (minus)? -number : number;
            } else {
              throw new NumberFormatException();
            }
            codePoint = read();
          }
        } else {
          throw new NumberFormatException();
        }
      } else {
        throw new NoSuchElementException();
      }
    }
 
    public int nextInt() {
      long number = nextLong();
      if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
        return (int)number;
      } else {
        throw new NumberFormatException();
      }
    }
 
    private boolean isPrintableChar(int codePoint) {
      return codePoint >= 33 && codePoint <= 126;
    }
 
  }
 
}

```

python code:<fim_suffix><fim_middle>

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
            first.extend(second)
            return True
        else:
            n = rest
            a -= 1
            b -= 1

if __name__ == '__main__':
    n, a, b = map(int, sys.stdin.readline().split())
    calc(n, a, b)
```
<|endoftext|>
