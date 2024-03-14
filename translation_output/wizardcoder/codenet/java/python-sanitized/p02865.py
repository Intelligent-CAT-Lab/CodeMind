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