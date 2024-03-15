<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
```python
import sys

def readline():
    global buf
    buf = sys.stdin.readline().split()
    bufidx = 0

def s():
    global buf
    readline()
    return buf[bufidx]

def i():
    global buf
    readline()
    return int(s())

def l():
    global buf
    readline()
    return long(s())

def d():
    global buf
    readline()
    return float(s())

def sa():
    global buf
    readline()
    if bufidx != 0:
        raise ValueError("illegal read")
    bufidx = -1
    return buf

def ia():
    global buf
    sa()
    if bufidx != 0:
        raise ValueError("illegal read")
    bufidx = -1
    return [int(s()) for s in sa()]

def la():
    global buf
    sa()
    if bufidx != 0:
        raise ValueError("illegal read")
    bufidx = -1
    return [long(s()) for s in sa()]

def da():
    global buf
    sa()
    if bufidx != 0:
        raise ValueError("illegal read")
    bufidx = -1
    return [float(s()) for s in sa()]

def im(N):
    im = [[0] * N for _ in range(N)]
    for i in range(N):
        im[i] = ia()
    return im

def lm(N):
    lm = [[0] * N for _ in range(N)]
    for i in range(N):
        lm[i] = la()
    return lm

def dm(N):
    dm = [[0] * N for _ in range(N)]
    for i in range(N):
        dm[i] = da()
    return dm

if __name__ == "__main__":
    try:
        N = int(s())
        print((N - 1) // 2)
    except Exception as e:
        print(str(e))
```</s>
