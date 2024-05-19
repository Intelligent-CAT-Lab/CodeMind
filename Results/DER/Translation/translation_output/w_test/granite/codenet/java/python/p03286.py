System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
-9

Expected output:
1011


```
/**
 * Created at 00:15 on 2019-06-28
 */

import java.io.*;
import java.util.*;

public class p03286 {

  static FastScanner sc = new FastScanner();

  static int[] dx = {0, 1, 0, -1};
  static int[] dy = {-1, 0, 1, 0};

  static long MOD = (long) (1e9 + 7);

  public static void main(String[] args) {

    new p03286().run();

  }

  public void run() {

    long N = sc.nextLong();

    String ans = (N == 0? "0" : "");
    while(N!= 0) {
      long q = q(N, -2);
      long r = r(N, -2);
      ans = r + ans;
      N = q;
    }

    System.out.println(ans);

  }

  public long q(long a, long b) {
    if (b > 0) {
      return floor(a, b);
    } else {
      return ceil(a, b);
    }
  }

  public long r(long a, long b) {
    return a - q(a, b) * b;
  }

  /*
   * n <= a/b ãªãæå¤§ã®æ´æ°nãè¿ã
   */
  public long floor(long a, long b) {
    if (b < 0) {
      a *= -1;
      b *= -1;
    }

    if (a > 0) {
      //çµ¶å¯¾å¤ã®å°ããæ¹ã«ä¸¸ãããã(æ­£ãªãè² ã®æ¹å)
      return a/b;
    } else {
      //ããããåãä¸ãã®ãã¯ããã¯ã®åãæ¨ã¦ç
      return (a-b+1)/b;
    }
  }


  /*
   * n >= a/b ãªãæå°ã®æ´æ°nãè¿ã
   */
  public long ceil(long a, long b) {
    if (b < 0) {
      a *= -1;
      b *= -1;
    }

    if (a > 0) {
      //ããããåãä¸ãã®ãã¯ããã¯
      return (a+b-1)/b;
    } else {
      //çµ¶å¯¾å¤ã®å°ããæ¹ã«ä¸¸ãããã(è² ãªãæ­£ã®æ¹å)
      return a/b;
    }
  }


  public static class Mathf {

    public static int max(int[] a) {
      int M = a[0];
      for (int i = 1; i < a.length; i++) {
        M = Math.max(M, a[i]);
      }
      return M;
    }

    public static int min(int[] a) {
      int m = a[0];
      for (int i = 1; i < a.length; i++) {
        m = Math.min(m, a[i]);
      }
      return m;
    }

    public static long max(long[] a) {
      long M = a[0];
      for (int i = 1; i < a.length; i++) {
        M = Math.max(M, a[i]);
      }
      return M;
    }

    public static long min(long[] a) {
      long m = a[0];
      for (int i = 1; i < a.length; i++) {
        m = Math.min(m, a[i]);
      }
      return m;
    }

  }

  /*
    add()ã§ã¤ã³ããã¯ã¹ãæå®ããªãå ´åæå®ãããã½ã¼ãé ã«éããªãä½ç½®ã«è¿½å ãã
    (ãã ãã½ã¼ãããã¦ãããã¨ãåæã¨ãªã)
    Comparatorã0ãè¿ããã¨ãããããã®é åºã¯ä¿è¨¼ããªã
    (TreeSet, TreeMapã¨éãåé¤ã¯ããªã)
   */
  static class TreeList<E> extends ArrayList<E> {

    Comparator<? super E> comparator;

    TreeList(Comparator<? super E> c) {
      super();
      comparator = c;
    }

    /*
      ã½ã¼ãæ¸ã¿ã®ãªã¹ãã«è¦ç´ ãè¿½å ãã
     */
    public boolean add(E e) {
      int lowIndex = 0;
      int highIndex = size() - 1;
      int index = 0;

      if (size() == 0) {
        super.add(e);
        return true;
      }

      if (comparator.compare(e, get(0)) < 0) {
        index = 0;
      } else if (comparator.compare(e, get(highIndex)) > 0) {
        index = highIndex + 1;
      } else {
        while (lowIndex <= highIndex) {

          if (highIndex == lowIndex + 1 || highIndex == lowIndex) {
            index = highIndex;
            break;
          }

          int midIndex = (lowIndex + highIndex) / 2;
          ;

          if (comparator.compare(e, get(midIndex)) > 0) {
            lowIndex = midIndex;
          } else {
            highIndex = midIndex;
          }

        }
      }

      super.add(index, e);
      return true;
    }

  }

  static class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
      if (ptr < buflen) {
        return true;
      } else {
        ptr = 0;
        try {
          buflen = in.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (buflen <= 0) {
          return false;
        }
      }
      return true;
    }

    private int readByte() {
      if (hasNextByte()) return buffer[ptr++];
      else return -1;
    }

    private static boolean isPrintableChar(int c) {
      return 33 <= c && c <= 126;
    }

    private void skipUnprintable() {
      while (hasNextByte() &&!isPrintableChar(buffer[ptr])) ptr++;
    }

    public boolean hasNext() {
      skipUnprintable();
      return hasNextByte();
    }

    public String next() {
      if (!hasNext()) throw new NoSuchElementException();
      StringBuilder sb = new StringBuilder();
      int b = readByte();
      while (isPrintableChar(b)) {
        sb.appendCodePoint(b);
        b = readByte();
      }
      return sb.toString();
    }

    public long nextLong() {
      if (!hasNext()) throw new NoSuchElementException();
      long n = 0;
      boolean minus = false;
      int b = readByte();
      if (b == '-') {
        minus = true;
        b = readByte();
      }
      if (b < '0' || '9' < b) {
        throw new NumberFormatException();
      }
      while (true) {
        if ('0' <= b && b <= '9') {
          n *= 10;
          n += b - '0';
        } else if (b == -1 ||!isPrintableChar(b)) {
          return minus? -n : n;
        } else {
          throw new NumberFormatException();
        }
        b = readByte();
      }
    }

    public int nextInt() {
      return (int) nextLong();
    }

    public int[] nextIntArray(int N, boolean oneBased) {
      if (oneBased) {
        int[] array = new int[N + 1];
        for (int i = 1; i <= N; i++) {
          array[i] = sc.nextInt();
        }
        return array;
      } else {
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
          array[i] = sc.nextInt();
        }
        return array;
      }
    }

    public long[] nextLongArray(int N, boolean oneBased) {
      if (oneBased) {
        long[] array = new long[N + 1];
        for (int i = 1; i <= N; i++) {
          array[i] = sc.nextLong();
        }
        return array;
      } else {
        long[] array = new long[N];
        for (int i = 0; i < N; i++) {
          array[i] = sc.nextLong();
        }
        return array;
      }
    }
  }

}

```


Answer:
```python
def q(a, b):
    if b > 0:
        return floor(a, b)
    else:
        return ceil(a, b)

def r(a, b):
    return a - q(a, b) * b

def floor(a, b):
    if b < 0:
        a *= -1
        b *= -1
    if a > 0:
        return a // b
    else:
        return (a - b + 1) // b

def ceil(a, b):
    if b < 0:
        a *= -1
        b *= -1
    if a > 0:
        return (a + b - 1) // b
    else:
        return a // b

def p3286(n):
    ans = ""
    while n!= 0:
        q_val = q(n, -2)
        r_val = r(n, -2)
        ans = str(r_val) + ans
        n = q_val
    return ans

n = int(input())
print(p3286(n))
```<|endoftext|>
