/**
 * Created at 00:27 on 2019-07-01
 */

import java.io.*;
import java.util.*;

public class Main {

  static FastScanner sc = new FastScanner();
  static PrintStream out = System.out;
  static PrintWriter pw = new PrintWriter(out);

  static final int[] dx = {0, 1, 0, -1};
  static final int[] dy = {-1, 0, 1, 0};

  static final long MOD = (long) (1e9 + 7);
  static final long INF = Long.MAX_VALUE / 2;

  public static class Solver implements Runnable {
    public void run() {

      long N = sc.nextLong();
      long M = sc.nextLong();
      long K = sc.nextLong();

      new Mod(N*M);
      long C = Mod.comb(M*N-2, K-2);

      long ans = add(
              div(mul(N, N-1, N+1, C, M, M), 6),
              div(mul(M, M-1, M+1, C, N, N), 6)
      );

      out.println(ans);

    }

    public long add(long... a) {
      long ans = 0;
      for (int i=0; i<a.length; i++) {
        ans = (ans + a[i]) % MOD;
      }
      return ans;
    }

    public long sub(long a, long b) {
      return (a - b + MOD) % MOD;
    }

    public long mul(long... a) {
      long ans = 1;
      for (int i=0; i<a.length; i++) {
        ans = (ans * a[i]) % MOD;
      }
      return ans;
    }

    public long div(long a, long b) {
      return (a * Mod.inverse(b)) % MOD;
    }


    public static class Mod {

      public static long[] fact;

      public Mod(int n) {
        fact = new long[n+1];
      }

      public Mod(long n) {
        fact = new long[(int)n+1];
      }

      public static long comb(long n, long r) {
        if (r < 0 || r > n) return 0;
        return (((factorial(n) * factorialInverse(r)) % MOD) * factorialInverse(n - r)) % MOD;
      }

      public static long factorial(long n) {
        if (n == 0) return 1;
        if (fact[(int) n] == 0) {
          return fact[(int) n] = (n * factorial(n - 1)) % MOD;
        } else {
          return fact[(int) n];
        }
      }

      public static long factorialInverse(long n) {
        return inverse(factorial(n));
      }

      public static long inverse(long n) {
        return power(n, MOD - 2);
      }

      public static long power(long a, long b) {
        if (b == 0) return 1;

        if (b % 2 == 0) {
          long p = power(a, b / 2);
          return (p * p) % MOD;
        } else {
          return (a * power(a, b - 1)) % MOD;
        }
      }

    }

  }

  public static void main(String[] args) {
    //new Solver().run();
    Thread.setDefaultUncaughtExceptionHandler((t,e)->System.exit(1));
    new Thread(null, new Solver(), "", 128 * 1024 * 1024).start();
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
      while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
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
        } else if (b == -1 || !isPrintableChar(b)) {
          return minus ? -n : n;
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
