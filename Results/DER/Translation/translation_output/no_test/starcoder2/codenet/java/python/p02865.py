
```
import sys

class Reader:
    def __init__(self, in_stream):
        self.br = in_stream.read().split()
        self.bufidx = -1

    def read_buf(self):
        if self.bufidx == -1 or self.bufidx == len(self.br):
            self.br = sys.stdin.read().split()
            self.bufidx = 0

    def s(self):
        self.read_buf()
        return self.br[self.bufidx]

    def i(self):
        return int(self.s())

    def l(self):
        return long(self.s())

    def d(self):
        return float(self.s())

    def sa(self):
        self.read_buf()
        if self.bufidx != 0:
            raise Exception("illegal read")
        self.bufidx = -1
        return self.br

    def ia(self):
        sa = self.sa()
        ia = []
        for i in range(len(sa)):
            ia.append(int(sa[i]))
        return ia

    def la(self):
        sa = self.sa()
        la = []
        for i in range(len(sa)):
            la.append(long(sa[i]))
        return la

    def da(self):
        sa = self.sa()
        da = []
        for i in range(len(sa)):
            da.append(float(sa[i]))
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

r = Reader(sys.stdin)
N = r.i()
print((N - 1) / 2)
```
/src/main/java/com/github/kompotkot/codeforces/p02865/p02865.java
package com.github.kompotkot.codeforces.p02865;

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
/src/main/java/com/github/kompotkot/codeforces/p02865/p02865.py
import sys

class Reader:
    def __init__(self, in_stream):
        self.br = in_stream.read().split()
        self.bufidx =
