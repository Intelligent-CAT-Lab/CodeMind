
```
import sys

N, M, K = map(int, sys.stdin.readline().split())

for i in range(N + 1):
    for j in range(M + 1):
        if M * i + N * j - (i * j * 2) == K:
            print("Yes")
            sys.exit()

print("No")
```

## 03593

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class p03593 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= M; j++) {
                long sum = M * i + N * j - (i * j * 2);
                if (sum == K) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }

    public static class Pair implements Comparable<Pair> {
        private double key;
        private int value;

        public Pair(double key, int value) {
            super();
            this.key = key;
            this.value = value;
        }

        public double getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }

        @Override
        public String toString() {
            return "{" + key + ", " + value + "}";
        }

        @Override
        public int compareTo(Pair other) {
            double t = this.value / this.key;
            double o = other.value / other.key;
            if (t < o) {
                return -1;
            } else if (t > o) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    private static boolean isDebug = System.getProperty("sun.desktop") != null;

    private static void debug(Object... o) {
        if (isDebug) {
            System.err.println(Arrays.deepToString(o));
        }
    }

    public static class Scanner {
        private BufferedInputStream inputStream;
        private StringBuilder buffer = new StringBuilder();

        public Scanner(InputStream in) {
            inputStream = new BufferedInputStream(in);
        }

        public int nextInt() throws IOException {
            int num = 0;
            int sign = 1;

            int read = skip();
            if (read == '-') {
                sign = -1;
                read = inputStream.read();
            }

            do {
                num = num * 10 + sign * (read - 0x30);
            } while ((read = inputStream.read()) > 0x20);

            return num;
        }

        public void fill(int[] a) throws IOException {
            for (int i = 0; i < a.length; i++) {
                a[i] = nextInt();
            }
        }

        public void fill(int[] a, int[] b) throws IOException {
            if (a.length != b.length) {
                throw new IllegalArgumentException();
            }

            for (int i = 0;
