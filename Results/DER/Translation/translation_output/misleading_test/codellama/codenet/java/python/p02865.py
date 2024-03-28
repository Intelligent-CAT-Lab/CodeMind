<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
-46

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class p02865 {

    public static void main(String[] args) throws Exception {
        try (Reader r = new Reader(System.in)) {
            int N = r.i();
            System.out.println((N - 1) / 2);
        }
    }

    public static class Reader implements AutoCloseable {

        private BufferedReader br;

        private String[] buf;

        private int bufidx = -1;

        public Reader(InputStream in) {
            this.br = new BufferedReader(new InputStreamReader(in));
        }

        @Override
        public void close() throws Exception {
            br.close();
        }

        private void readBuf() throws IOException {
            if (bufidx == -1 || bufidx == buf.length) {
                buf = br.readLine().split(" ");
                bufidx = 0;
            }
        }

        public String s() throws IOException {
            readBuf();
            return buf[bufidx++];
        }

        public int i() throws IOException {
            return Integer.parseInt(s());
        }

        public long l() throws IOException {
            return Long.parseLong(s());
        }

        public double d() throws IOException {
            return Double.parseDouble(s());
        }

        public String[] sa() throws IOException {
            readBuf();
            if (bufidx != 0) {
                throw new RuntimeException("illegal read");
            }
            bufidx = -1;
            return buf;
        }

        public int[] ia() throws IOException {
            String[] sa = sa();
            int[] ia = new int[sa.length];
            for (int i = 0; i < sa.length; i++) {
                ia[i] = Integer.parseInt(sa[i]);
            }
            return ia;
        }

        public long[] la() throws IOException {
            String[] sa = sa();
            long[] la = new long[sa.length];
            for (int i = 0; i < sa.length; i++) {
                la[i] = Long.parseLong(sa[i]);
            }
            return la;
        }

        public double[] da() throws IOException {
            String[] sa = sa();
            double[] da = new double[sa.length];
            for (int i = 0; i < sa.length; i++) {
                da[i] = Double.parseDouble(sa[i]);
            }
            return da;
        }

        public int[][] im(int N) throws IOException {
            int[][] im = new int[N][];
            for (int i = 0; i < N; i++) {
                im[i] = ia();
            }
            return im;
        }

        public long[][] lm(int N) throws IOException {
            long[][] lm = new long[N][];
            for (int i = 0; i < N; i++) {
                lm[i] = la();
            }
            return lm;
        }

        public double[][] dm(int N) throws IOException {
            double[][] dm = new double[N][];
            for (int i = 0; i < N; i++) {
                dm[i] = da();
            }
            return dm;
        }

    }

}

```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class Reader:
    def __init__(self, inp):
        self.inp = inp
        self.buf = []
        self.bufidx = -1

    def readBuf(self):
        if self.bufidx == -1 or self.bufidx == len(self.buf):
            self.buf = self.inp.readline().split(" ")
            self.bufidx = 0

    def s(self):
        self.readBuf()
        return self.buf[self.bufidx]

    def i(self):
        return int(self.s())

    def l(self):
        return long(self.s())

    def d(self):
        return float(self.s())

    def sa(self):
        self.readBuf()
        if self.bufidx != 0:
            raise RuntimeError("illegal read")
        self.bufidx = -1
        return self.buf

    def ia(self):
        sa = self.sa()
        return [int(x) for x in sa]

    def la(self):
        sa = self.sa()
        return [long(x) for x in sa]

    def da(self):
        sa = self.sa()
        return [float(x) for x in sa]

    def im(self, N):
        im = [[0] * N for _ in range(N)]
        for i in range(N):
            im[i] = self.ia()
        return im

    def lm(self, N):
        lm = [[0] * N for _ in range(N)]
        for i in range(N):
            lm[i] = self.la()
        return lm

    def dm(self, N):
        dm = [[0] * N for _ in range(N)]
        for i in range(N):
            dm[i] = self.da()
        return dm


if __name__ == "__main__":
    reader = Reader(sys.stdin)
    N = reader.i()
    print((N - 1) / 2)
```
Note that this code is not exactly the same as the Java code, as Python does not have the same syntax for reading input and writing output as Java. Additionally, Python does not have the same data types as Java, so some of the data types have been changed to match the Python equivalents.</s>
