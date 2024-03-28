<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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
      int firstI = (n - a + 1 >= 1) ? n - a + 1 : 1;
      for (int i = firstI ; i <= n ; i ++) {
        first.append(i).append(" ");
      }
      int rest = n - a - b + 1;
      int endI = (rest + 1 >= 1) ? rest + 1 : 1;
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
            } else if (codePoint < 0 || !isPrintableChar(codePoint)) {
              return (minus) ? -number : number;
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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

class BetterScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray(1024)
        self.pointer = 0
        self.buffer_length = 0

    def update_buffer(self):
        if self.pointer >= self.buffer_length:
            self.pointer = 0
            try:
                self.buffer_length = self.stream.readinto(self.buffer)
            except IOError:
                pass
            return self.buffer_length > 0
        else:
            return True

    def read(self):
        if self.update_buffer():
            return self.buffer[self.pointer]
        else:
            return -1

    def has_next(self):
        self.skip_unprintable()
        return self.update_buffer()

    def skip_unprintable(self):
        while self.update_buffer() and not self.is_printable_char(self.buffer[self.pointer]):
            self.pointer += 1

    def next(self):
        if self.has_next():
            builder = ""
            code_point = self.read()
            while self.is_printable_char(code_point):
                builder += chr(code_point)
                code_point = self.read()
            return builder
        else:
            raise StopIteration

    def next_long(self):
        if self.has_next():
            number = 0
            minus = False
            code_point = self.read()
            if code_point == '-':
                minus = True
                code_point = self.read()
            if code_point >= '0' and code_point <= '9':
                while True:
                    if code_point >= '0' and code_point <= '9':
                        number *= 10
                        number += code_point - '0'
                    elif code_point < 0 or not self.is_printable_char(code_point):
                        return -number if minus else number
                    else:
                        raise ValueError
            else:
                raise ValueError
        else:
            raise StopIteration

    def next_int(self):
        number = self.next_long()
        if number >= sys.maxsize and number <= sys.maxsize:
            return int(number)
        else:
            raise ValueError

    def is_printable_char(self, code_point):
        return code_point >= 33 and code_point <= 126

class p03421:
    def __init__(self):
