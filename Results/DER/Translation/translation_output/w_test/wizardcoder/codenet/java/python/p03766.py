Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
4


```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author daltao
 */
public class p03766 {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "daltao", 1 << 27);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            FastOutput out = new FastOutput(outputStream);
            TaskC solver = new TaskC();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class TaskC {
        int[] f;
        int[] suffix;
        int n;
        NumberTheory.Modular mod = new NumberTheory.Modular(1e9 + 7);

        public void solve(int testNumber, FastInput in, FastOutput out) {
            n = in.readInt();
            f = new int[n + 1];
            suffix = new int[n + 1];
            Arrays.fill(f, -1);
            Arrays.fill(suffix, -1);
            f[n] = n;
            suffix[n] = n;

            int ans = f(1);
            out.println(ans);
        }

        public int f(int i) {
            if (i > n) {
                return 0;
            }
            if (f[i] == -1) {
                f[i] = f(i + 1);
                if (i + 3 <= n) {
                    int since = i + 3;
                    int until = n - i - 1;
                    f[i] = mod.plus(f[i], suffix(since));
                    f[i] = mod.plus(f[i], n - until);
                    f[i] = mod.plus(f[i], mod.mul(n - 1, n - 1));
                } else {
                    f[i] = mod.plus(f[i], mod.mul(n - 1, n));
                }
            }
            return f[i];
        }

        public int suffix(int i) {
            if (i > n) {
                return 0;
            }
            if (suffix[i] == -1) {
                suffix[i] = mod.plus(f[i], suffix(i + 1));
            }
            return suffix[i];
        }

    }

    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+'? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

    }

    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput println(int c) {
            cache.append(c).append('\n');
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
                cache.setLength(0);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            return this;
        }

        public void close() {
            flush();
            try {
                os.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

    }

    static class NumberTheory {
        public static class Modular {
            int m;

            public Modular(int m) {
                this.m = m;
            }

            public Modular(long m) {
                this.m = (int) m;
                if (this.m!= m) {
                    throw new IllegalArgumentException();
                }
            }

            public Modular(double m) {
                this.m = (int) m;
                if (this.m!= m) {
                    throw new IllegalArgumentException();
                }
            }

            public int valueOf(int x) {
                x %= m;
                if (x < 0) {
                    x += m;
                }
                return x;
            }

            public int valueOf(long x) {
                x %= m;
                if (x < 0) {
                    x += m;
                }
                return (int) x;
            }

            public int mul(int x, int y) {
                return valueOf((long) x * y);
            }

            public int plus(int x, int y) {
                return valueOf(x + y);
            }

            public String toString() {
                return "mod " + m;
            }

        }

    }
}


```

### Response:
```python
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

class TaskC:
    def __init__(self):
        self.f = None
        self.suffix = None
        self.n = None
        self.mod = NumberTheory.Modular(1e9 + 7)

    def solve(self, testNumber, in: FastInput, out: FastOutput):
        self.n = in.readInt()
        self.f = [-1] * (self.n + 1)
        self.suffix = [-1] * (self.n + 1)
        Arrays.fill(self.f, -1)
        Arrays.fill(self.suffix, -1)
        self.f[self.n] = self.n
        self.suffix[self.n] = self.n

        ans = self.f(1)
        out.println(ans)

    def f(self, i):
        if i > self.n:
            return 0
        if self.f[i] == -1:
            self.f[i] = self.f(i + 1)
            if i + 3 <= self.n:
                since = i + 3
                until = self.n - i - 1
                self.f[i] = self.mod.plus(self.f[i], self.suffix(since))
                self.f[i] = self.mod.plus(self.f[i], self.n - until)
                self.f[i] = self.mod.plus(self.f[i], self.mod.mul(self.n - 1, self.n - 1))
            else:
                self.f[i] = self.mod.plus(self.f[i], self.mod.mul(self.n - 1, self.n))
        return self.f[i]

    def suffix(self, i):
        if i > self.n:
            return 0
        if self.suffix[i] == -1:
            self.suffix[i] = self.mod.plus(self.f[i], self.suffix(i +
