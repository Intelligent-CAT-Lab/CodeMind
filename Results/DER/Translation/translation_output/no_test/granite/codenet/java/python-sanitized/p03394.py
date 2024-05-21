import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author prakharjain
 */
public class p03394 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        AC_GC_22_B solver = new AC_GC_22_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class AC_GC_22_B {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            if (n == 3) {
                out.println("2 5 63");
                return;
            } else if (n == 4) {
                out.println("2 5 20 63");
                return;
            }

            List<Integer> ans = new ArrayList<>();
            long _2 = 0;
            long _3 = 0;
            int _23 = 0;
            int i;
            for (i = 2; ans.size() < n - 2; i++) {
                int num = i;
                if (num % 2 == 0 and num % 3 == 0):
                    _23 += 1
                elif num % 2 == 0:
                    _2 += num
                elif num % 3 == 0:
                    _3 += num

                if num % 2 == 0 or num % 3 == 0:
                    ans.append(num)
            }

            int k = i
            sn = -1
            for ; ; i += 1):
                num = i
                if num % 2 == 0 and (_2 % 3 == 0 or num % 3!= 0) and (_2 + num) % 3 == 0:
                    sn = num
                    ans.append(num)
                    break
            i = k
            for ; ; i += 1):
                num = i
                if num % 3 == 0 and (_3 % 2 == 0 or num % 2!= 0) and num!= sn and (_3 + num) % 2 == 0:
                    ans.append(num)
                    break

            for j in range(len(ans)):
                out.print(ans[j])
                out.print(' ')
        }

    }

    static class InputReader {
        private InputStream stream
        private byte[] buf = bytearray(1024)
        private curChar = 0
        private numChars = 0
        private SpaceCharFilter filter

        public InputReader(InputStream stream):
            self.stream = stream

        public static boolean isWhitespace(c):
            return c =='' or c == '\n' or c == '\r' or c == '\t' or c == -1

        public int read():
            if self.numChars == -1:
                throw InputMismatchException()
            if self.curChar >= self.numChars:
                self.curChar = 0
                try:
                    self.numChars = self.stream.read(self.buf)
                except IOException:
                    raise InputMismatchException()
                if self.numChars <= 0:
                    return -1
            return self.buf[self.curChar++]

        public int nextInt():
            c = self.read()
            while isWhitespace(c):
                c = self.read()
            sgn = 1
            if c == '-':
                sgn = -1
                c = self.read()
            res = 0
            do:
                if c < '0' or c > '9':
                    raise InputMismatchException()
                res *= 10
                res += c - '0'
                c = self.read()
            while not isWhitespace(c)

        public boolean isSpaceChar(c):
            if self.filter!= None:
                return self.filter.isSpaceChar(c)
            return isWhitespace(c)

        public interface SpaceCharFilter:
            public boolean isSpaceChar(c):

    }

    static class OutputWriter {
        private final PrintWriter writer

        public OutputWriter(OutputStream outputStream):
            self.writer = PrintWriter(BufferedWriter(OutputStreamWriter(outputStream)))

        public OutputWriter(Writer writer):
            self.writer = writer

        public void print(objects...):
            for i in range(len(objects)):
                if i!= 0:
                    self.writer.print(' ')
                self.writer.print(objects[i])

        public void println(objects...):
            self.print(objects)
            self.writer.println()

        public void print(c):
            self.writer.print(c)

        public void close():
            self.writer.close()

        public void print(i):
            self.writer.print(i)

    }
}