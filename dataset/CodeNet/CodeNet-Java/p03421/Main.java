import java.io.*;
import java.util.*;
 
 
public class Main implements Runnable {
 
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
    Main main = new Main();
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
