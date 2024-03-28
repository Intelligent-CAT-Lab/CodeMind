Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
            if (bufidx!= 0) {
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

### Response:
```python
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class p02865:

    def __init__(self):
        self.r = self.Reader(System.in)

    def main(self):
        try:
            N = self.r.i()
            print((N - 1) // 2)
        except Exception as e:
            print(e)

    class Reader:

        def __init__(self, in_stream):
            self.br = BufferedReader(InputStreamReader(in_stream))
            self.buf = None
            self.bufidx = -1

        def __enter__(self):
            return self

        def __exit__(self, exc_type, exc_val, exc_tb):
            self.close()

        def close(self):
            self.br.close()

        def read_buf(self):
            if self.bufidx == -1 or self.bufidx == len(self.buf):
                self.buf = self.br.readLine().split()
                self.bufidx = 0

        def s(self):
            self.read_buf()
            return self.buf[self.bufidx]

        def i(self):
            return int(self.s())

        def l(self):
            return long(self.s())

        def d(self):
            return float(self.s())

        def sa(self):
            self.read_buf()
            if self.bufidx!= 0:
                raise Exception("illegal read")
            self.bufidx = -1
            return self.buf

        def ia(self):
            sa = self.sa()
            ia = [int(x) for x in sa]
            return ia

        def la(self):
            sa = self.sa()
            la = [long(x) for x in sa]
            return la

        def da(self):
            sa = self.sa()
            da = [float(x) for x in sa]
            return da

        def im(self, N):
            im = []
            for i in range(N):
                im.append(self.ia())
            return im

        def lm(self, N):
            lm = []
            for i in range(N):
                lm.append(self.la())
            return lm

        def dm(self, N):
            dm = []
            for i in range(N):
                dm.append(self.da())
            return dm

if __name__ == '__main__':
    p = p02865()
    p.main()
```<|endoftext|>
