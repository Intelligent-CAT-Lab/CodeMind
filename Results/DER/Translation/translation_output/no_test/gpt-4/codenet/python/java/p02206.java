Here is the Python code translated into Java:

```java
import java.io.*;
import java.util.*;

public class Main {
    static final FastReader scanner = new FastReader();
    static final int[] dx = new int[]{1, 0, -1, 0};
    static final int[] dy = new int[]{0, 1, 0, -1};

    public static void main(String[] args) {
        new Thread(null, Main::run, "1", 1 << 26).start();
    }

    public static void run() {
        // Your main function logic
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        long l = 0;
        long r = k + 1;
        while (l + 1 < r) {
            long m = (l + r) / 2;
            if (ok(m, n, k)) {
                l = m;
            } else {
                r = m;
            }
        }
        System.out.println(l);
    }

    public static boolean ok(long m, int n, long k) {
        long s = 0;
        int cnt = 0;
        while (m > 0) {
            s += m;
            cnt++;
            if (s > k) return false;
            if (cnt == n) break;
            m >>= 1;
        }
        return true;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        int[] nextIntArray(int n) {
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextInt();
            }
            return array;
        }

        long[] nextLongArray(int n) {
            long[] array = new long[n];
            for (int i = 0; i < n; i++) {
                array[i] = nextLong();
            }
            return array;
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
```

This Java code snippet assumes that `Scanner` is replaced with a `FastReader` class for fast input reading, which is often necessary for Java-based competitive programming solutions to efficiently handle large inputs. The rest of the functions are converted with equivalent functionality, and a static importing practice is avoided since it's not strictly needed in Java. Please make any additional adjustments as needed based on the surrounding code context or specific execution environment requirements.
