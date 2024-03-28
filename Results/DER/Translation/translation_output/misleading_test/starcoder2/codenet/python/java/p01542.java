

```java
import java.util.*;
import java.io.*;

public class Main {
    static final int inf = 1000000007;
    static final int mod = 1000000007;
    static final int d4[][] = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static final int d8[][] = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

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

    static class Pair {
        int x, y;

        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static class Pair2 {
        int x, y, z;

        Pair2(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

    static class Pair3 {
        int x, y, z, w;

        Pair3(int x, int y, int z, int w) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.w = w;
        }
    }

    static class Pair4 {
        int x, y, z, w, v;

        Pair4(int x, int y, int z, int w, int v) {
            this.x = x;
            this.y = y;
            this.z = z;
            this.w = w;
            this.v = v;
        }
    }

    static class Pair5 {
        int x, y, z, w, v, u;

        Pair5(int x, int y, int z, int w, int v, int u) {
            this.x = x;
            this.y = y;
            this.
