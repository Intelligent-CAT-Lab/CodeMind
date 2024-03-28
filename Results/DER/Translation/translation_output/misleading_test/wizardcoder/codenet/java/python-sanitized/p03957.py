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