Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
Yes


```
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
 * 
 * @author daltao
 */
public class p03957 {
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
            TaskA solver = new TaskA();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskA {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            String s = in.readString();
            int cIndex = s.indexOf('C');
            int fIndex = s.lastIndexOf('F');
            if (cIndex < 0 || fIndex < 0 || fIndex < cIndex) {
                out.println("No");
            } else {
                out.println("Yes");
            }
        }

    }
    static class FastInput {
        private final InputStream is;
        private StringBuilder defaultStringBuf = new StringBuilder(1 << 13);
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

        public String readString(StringBuilder builder) {
            skipBlank();

            while (next > 32) {
                builder.append((char) next);
                next = read();
            }

            return builder.toString();
        }

        public String readString() {
            defaultStringBuf.setLength(0);
            return readString(defaultStringBuf);
        }

    }
    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(1 << 20);
        private final Writer os;

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput println(String c) {
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
}


```

### Response:
```python
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

class TaskA:
    def solve(self, testNumber, in, out):
        s = in.readString()
        cIndex = s.indexOf('C')
        fIndex = s.lastIndexOf('F')
        if cIndex < 0 or fIndex < 0 or fIndex < cIndex:
            out.println("No")
        else:
            out.println("Yes")

class TaskAdapter(java.lang.Runnable):
    def run(self):
        inputStream = System.in
        outputStream = System.out
        in = FastInput(inputStream)
        out = FastOutput(outputStream)
        solver = TaskA()
        solver.solve(1, in, out)
        out.close()

class FastInput:
    def __init__(self, is):
        self.is = is
        self.defaultStringBuf = StringBuilder(1 << 13)
        self.buf = bytearray(1 << 13)
        self.bufLen = 0
        self.bufOffset = 0
        self.next = self.read()

    def read(self):
        while self.bufLen == self.bufOffset:
            self.bufOffset = 0
            try:
                self.bufLen = self.is.read(self.buf)
            except IOException as e:
                raise RuntimeException(e)
            if self.bufLen == -1:
                return -1
        return self.buf[self.bufOffset]

    def skipBlank(self):
        while self.next >= 0 and self.next <= 32:
            self.next = self.read()

    def readString(self):
        self.skipBlank()

        builder = StringBuilder()
        while self.next > 32:
            builder.append(chr(self.next))
            self.next = self.read()

        return builder.toString()

class FastOutput(java.io.Closeable):
    def __init__(self, os):
        self.os = os
        self.cache = StringBuilder(1 << 20)

    def println(self, c):
        self.cache.append(c).append('\n')
        return self

    def flush(self):
        try:
            self.os.append(self.cache)
            self.cache.setLength(0)
        except IOException as e:
            raise UncheckedIOException(e)
        return self

    def close(self):
        self.flush()
        try:
            self.os.close()
        except IOException as e:
            raise UncheckedIOException(e)

if __name__ == '__main__':
    thread = java.lang.Thread(None, TaskAdapter(), "daltao", 1 << 27)
    thread.start()
    thread.join()
```<|endoftext|>
