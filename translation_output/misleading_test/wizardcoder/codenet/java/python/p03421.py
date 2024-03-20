Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 3 2

Expected output:
2 4 1 5 3 81

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

### Response:
Here's the Python code for the given Java code:

```python
import java.io.*;
import java.util.*;

class p03421:
    def __init__(self):
        self.output = ""

    def run(self):
        scanner = BetterScanner(System.in)

        n = scanner.nextInt()
        a = scanner.nextInt()
        b = scanner.nextInt()

        self.calc(n, a, b)

    def calc(self, n, a, b):
        for i in range(n - a + 1, n + 1):
            self.output += str(i) + " "
        rest = n - a - b + 1
        if rest < 0:
            print(-1)
            return
        elif rest >= 1:
            if not self.calcInner(rest, a - 1, b - 1):
                print(-1)
                return
        for i in range(n - a, rest, -1):
            self.output += str(i) + " "
        self.output = self.output[:-1]
        print(self.output)

    def calcInner(self, n, a, b):
        first = ""
        second = ""
        while True:
            if a <= 0 or b <= 0:
                return False
            firstI = max(n - a + 1, 1)
            for i in range(firstI, n + 1):
                first += str(i) + " "
            rest = n - a - b + 1
            endI = max(rest + 1, 1)
            subSecond = ""
            for i in range(firstI - 1, endI - 1, -1):
                subSecond += str(i) + " "
            second = subSecond + second
            if rest <= 0:
                self.output += first + second
                return True
            else:
                n = rest
                a -= 1
                b -= 1

class BetterScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray(1024)
        self.pointer = 0
        self.bufferLength = 0

    def updateBuffer(self):
        if self.pointer >= self.bufferLength:
            self.pointer = 0
            try:
                self.bufferLength = self.stream.read(self.buffer)
            except Exception as e:
                print(e)
                return False
            return self.bufferLength > 0
        else:
            return True

    def read(self):
        if self.updateBuffer():
            return self.buffer[self.pointer]
        else:
            return -1

    def hasNext(self):
        self.skipUnprintable()
        return self.updateBuffer()

    def skipUnprintable(self):
        while self.updateBuffer() and not self.isPrintableChar(self.buffer[self.pointer]):
            self.pointer += 1

    def next(self):
        if self.hasNext():
            builder = ""
            codePoint = self.read()
            while self.isPrintableChar(codePoint):
                builder += chr(codePoint)
                codePoint = self.read()
            return builder
        else:
            raise NoSuchElementException()

    def nextLong(self):
        if self.hasNext():
            number = 0
            minus = False
            codePoint = self.read()
            if codePoint == '-':
                minus = True
                codePoint = self.read()
            if codePoint >= '0' and codePoint <= '9':
                while True:
                    if codePoint >= '0' and codePoint <= '9':
                        number *= 10
                        number += codePoint - '0'
                    elif codePoint < 0 or not self.isPrintableChar
