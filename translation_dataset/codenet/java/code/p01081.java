import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

/*
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
           \  .-\__  `-`  ___/-. /
         ___`. .'  /--.--\  `. . __
      ."" '<  `.___\_<|>_/___.'  >'"".
     | | :  `- \`.;`\ _ /`;.`/ - ` : | |
     \  \ `-.   \_ __\ /__ _/   .-` /  /
======`-.____`-.___\_____/___.-`____.-'======
                   `=---='
^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
            pass System Test!
*/
@SuppressWarnings("unchecked")
public class p01081 {
  private static class Task {

    void solve(FastScanner in, PrintWriter out) throws Exception {
      char[] S = in.next().toCharArray();
      int N = S.length;
      ArrayDeque<Integer>[] pos = new ArrayDeque[26];
      for (int i = 0; i < 26; i++) pos[i] = new ArrayDeque<>();

      for (int i = 0; i < N; i++) {
        pos[S[i] - 'a'].add(i);
      }

      for (ArrayDeque<Integer> p : pos)
        if (p.size() % 2 != 0) {
          out.println(-1);
          return;
        }

      ArrayList<int[]> prefixList = new ArrayList<>();
      ArrayList<int[]> suffixList = new ArrayList<>();
      for (int i = 0; i < 26; i++) {
        int s = pos[i].size();
        for (int j = 0; j < s / 2; j++) {
          prefixList.add(new int[]{i, pos[i].pollFirst()});
        }
        for (int j = 0; j < s / 2; j++) {
          suffixList.add(new int[]{i, pos[i].pollFirst()});
        }
      }
      Collections.sort(prefixList, (o1, o2) -> Integer.compare(o1[1], o2[1]));
      Collections.reverse(prefixList);
      Collections.sort(suffixList, (o1, o2) -> Integer.compare(o1[1], o2[1]));

      long ans = 0;
      for (int i = 0; i < prefixList.size(); i++) ans += prefixList.get(i)[1] - i;

      int[] prefix = new int[N / 2];
      for (int i = 0; i < N / 2; i++) prefix[i] = prefixList.get(i)[0];

      for (int i = 0; i < suffixList.size(); i++) {
        pos[suffixList.get(i)[0]].addLast(i);
      }
      int[] suffix = new int[N / 2];
      for (int i = 0; i < N / 2; i++) {
        suffix[i] = pos[prefix[i]].pollFirst();
      }

      FenwickTree bit = new FenwickTree(N);
      for (int i = 0; i < N / 2; i++) {
        ans += i - bit.sum(suffix[i]);
        bit.add(suffix[i], 1);
      }
      out.println(ans);
    }
    class FenwickTree {
      int N;
      long[] data;

      FenwickTree(int N) {
        this.N = N + 1;
        data = new long[N + 1];
      }

      void add(int k, long val) {
        for (int x = k; x < N; x |= x + 1) {
          data[x] += val;
        }
      }

      // [0, k)
      long sum(int k) {
        if (k >= N) k = N - 1;
        int ret = 0;
        for (int x = k - 1; x >= 0; x = (x & (x + 1)) - 1) {
          ret += data[x];
        }
        return ret;
      }

      // [l, r)
      long sum(int l, int r) {
        return sum(r) - sum(l);
      }

      long get(int k) {
        assert (0 <= k && k < N);
        return sum(k + 1) - sum(k);
      }

      int getAsSetOf(int w) {
        w++;
        if (w <= 0) return -1;
        int x = 0;
        int k = 1;
        while (k * 2 <= N) k *= 2;
        for (; k > 0; k /= 2) {
          if (x + k <= N && data[x + k - 1] < w) {
            w -= data[x + k - 1];
            x += k;
          }
        }
        return x;
      }
    }
  }

  /**
   * ?????????????????????????????¬????????§??????
   */
  public static void main(String[] args) throws Exception {
    OutputStream outputStream = System.out;
    FastScanner in = new FastScanner();
    PrintWriter out = new PrintWriter(outputStream);
    Task solver = new Task();
    solver.solve(in, out);
    out.close();
  }
  private static class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int bufferLength = 0;

    private boolean hasNextByte() {
      if (ptr < bufferLength) {
        return true;
      } else {
        ptr = 0;
        try {
          bufferLength = in.read(buffer);
        } catch (IOException e) {
          e.printStackTrace();
        }
        if (bufferLength <= 0) {
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

    boolean hasNext() {
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

    long nextLong() {
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

    double nextDouble() {
      return Double.parseDouble(next());
    }

    double[] nextDoubleArray(int n) {
      double[] array = new double[n];
      for (int i = 0; i < n; i++) {
        array[i] = nextDouble();
      }
      return array;
    }

    double[][] nextDoubleMap(int n, int m) {
      double[][] map = new double[n][];
      for (int i = 0; i < n; i++) {
        map[i] = nextDoubleArray(m);
      }
      return map;
    }

    public int nextInt() {
      return (int) nextLong();
    }

    public int[] nextIntArray(int n) {
      int[] array = new int[n];
      for (int i = 0; i < n; i++) array[i] = nextInt();
      return array;
    }

    public long[] nextLongArray(int n) {
      long[] array = new long[n];
      for (int i = 0; i < n; i++) array[i] = nextLong();
      return array;
    }

    public String[] nextStringArray(int n) {
      String[] array = new String[n];
      for (int i = 0; i < n; i++) array[i] = next();
      return array;
    }

    public char[][] nextCharMap(int n) {
      char[][] array = new char[n][];
      for (int i = 0; i < n; i++) array[i] = next().toCharArray();
      return array;
    }

    public int[][] nextIntMap(int n, int m) {
      int[][] map = new int[n][];
      for (int i = 0; i < n; i++) {
        map[i] = nextIntArray(m);
      }
      return map;
    }
  }
}