import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author shangu
 */
public class Main {
  public static void main(String[] args) {
    InputStream inputStream = System.in;
    OutputStream outputStream = System.out;
    FastReader in = new FastReader(inputStream);
    PrintWriter out = new PrintWriter(outputStream);
    FSumDifference solver = new FSumDifference();
    solver.solve(1, in, out);
    out.close();
  }

  static class FSumDifference {
    public void solve(int testNumber, FastReader in, PrintWriter out) {
      long n = in.nextLong(), x = in.nextLong(), d = in.nextLong();
      if (d == 0) {
        if (x == 0) out.println(1);
        else out.println(n + 1);
        return;
      }
      HashMap<Long, ArrayList<Seg>> segments = new HashMap<>();
      for (long i = 0; i <= n; i++) {
        long grp = x * i, offet = (long) Math.floor(grp * 1.0 / d);
        grp = (grp % d + d) % d;
        if (!segments.containsKey(grp)) segments.put(grp, new ArrayList<>());
        ArrayList<Seg> cur = segments.get(grp);
        cur.add(new Seg(offet + i * (i - 1) / 2, -1));
        cur.add(new Seg(offet + (2 * n - 1 - i) * i / 2, 1));
      }
      long ans = 0;
      for (ArrayList<Seg> list : segments.values()) {
        list.sort((a, b) -> (a.v == b.v ? a.t - b.t : Long.compare(a.v, b.v)));
        int cnt = 0;
        long begin = 0;
        for (Seg e : list) {
          if (cnt == 0 && e.t == -1) begin = e.v;
          cnt += e.t;
          if (cnt == 0) ans += e.v - begin + 1;
        }
      }
      out.println(ans);
    }

    private class Seg {
      long v;
      int t;

      public Seg(long _v, int _t) {
        v = _v;
        t = _t;
      }

    }

  }

  static class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader(InputStream stream) {
      br = new BufferedReader(new InputStreamReader(stream), 32768);
      st = null;
    }

    public String next() {
      while (st == null || !st.hasMoreElements()) {
        try {
          st = new StringTokenizer(br.readLine());
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    public long nextLong() {
      return Long.parseLong(next());
    }

  }
}

