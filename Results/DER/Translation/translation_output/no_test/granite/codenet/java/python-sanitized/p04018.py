import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;

public class p04018 {
    public static void main(String[] args) throws Exception {
        boolean local = false;
        boolean async = false;

        Charset charset = Charset.forName("ascii");

        FastIO io = local? new FastIO(new FileInputStream("D:\\DATABASE\\TESTCASE\\Code.in"), System.out, charset) : new FastIO(System.in, System.out, charset);
        Task task = new Task(io, new Debug(local));

        if (async) {
            Thread t = new Thread(null, task, "dalt", 1 << 27);
            t.setPriority(Thread.MAX_PRIORITY);
            t.start();
            t.join();
        } else {
            task.run();
        }

        if (local) {
            io.cache.append("\n\n--memory -- \n" + ((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) >> 20) + "M");
        }

        io.flush();
    }

    public static class Task implements Runnable {
        final FastIO io;
        final Debug debug;
        int inf = (int) 1e8;
        long lInf = (long) 1e18;
        double dInf = 1e50;

        public Task(FastIO io, Debug debug) {
            this.io = io;
            this.debug = debug;
        }

        @Override
        public void run() {
            solve();
        }

        public void solve() {
            char[] s = new char[1000000];
            int n = io.readString(s, 0);

            kmp = KMPAutomation(n)
            inv = KMPAutomation(n)
            for i in range(n):
                kmp.build(s[i])
                inv.build(s[n - i - 1])
            p = n - kmp.fail[n]
            if n % p!= 0:
                p = n
            if p == 1:
                answer(n, 1)
                return
            if p == n:
                answer(1, 1)
                return
            cnt = 0
            for i in range(2, n + 1):
                p1 = i - 1 - kmp.fail[i - 1]
                p2 = (n + 1 - i) - inv.fail[n + 1 - i]

                f1 = p1 == (i - 1) or (i - 1) % p1!= 0
                f2 = p2 == (n + 1 - i) or (n + 1 - i) % p2!= 0
                if f1 and f2:
                    cnt += 1
            answer(2, cnt)
        }

        public void answer(int len, int cnt):
            io.cache.append(str(len)).append('\n').append(str(cnt))

    }

    public static class KMPAutomation:
        def __init__(self, cap):
            self.data = [0] * (cap + 2)
            self.fail = [0] * (cap + 2)
            self.buildLast = 0
            self.matchLast = 0
            self.length = cap

        def __init__(self, automaton):
            self.data = automaton.data[:]
            self.fail = automaton.fail[:]
            self.buildLast = automaton.buildLast
            self.length = automaton.length

        def isMatch(self):
            return self.matchLast == self.length

        def length(self):
            return self.length

        def beginMatch(self):
            self.matchLast = 0

        def match(self, c):
            self.matchLast = self.visit(c, self.matchLast) + 1

        def visit(self, c, trace):
            while trace >= 0 and self.data[trace + 1]!= c:
                trace = self.fail[trace]
            return trace

        def build(self, c):
            self.buildLast += 1
            self.fail[self.buildLast] = self.visit(c, self.fail[self.buildLast - 1]) + 1
            self.data[self.buildLast] = c