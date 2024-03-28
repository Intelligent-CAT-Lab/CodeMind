<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 30 20

Expected output:
Yes

```
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;

public class p03943 {

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean i = (a + b == c);
        boolean j = (a + c == b);
        boolean k = (b + c == a);


        if (i || j || k) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


    }


    /// self liblary
    public static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

}

```
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

class FastScanner:
    def __init__(self):
        self.in = sys.stdin
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.in.readinto(self.buffer)
            except IOError:
                pass
            if self.buflen <= 0:
                return False
            return True

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.ptr]
        else:
            return -1

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise NoSuchElementException()
        sb = []
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(chr(b))
            b = self.read_byte()
        return ''.join(sb)

    def next_long(self):
        if not self.has_next():
            raise NoSuchElementException()
        n = 0
        minus = False
        b = self.read_byte()
        if b == '-':
            minus = True
            b = self.read_byte()
        if b < '0' or '9' < b:
            raise NumberFormatException()
        while True:
            if '0' <= b and b <= '9':
                n *= 10
                n += b - '0'
            elif b == -1 or not self.is_printable_char(b):
                return -n if minus else n
            else:
                raise NumberFormatException()
            b = self.read_byte()

    def next_int(self):
        nl = self.next_long()
        if nl < Integer.MIN_VALUE or nl > Integer.MAX_VALUE:
            raise NumberFormatException()
        return int(nl)

    def next_double(self):
        return float(self.next())


if __name__ == '__main__':
    scanner = FastScanner()
    a = scanner.next_int()
    b = scanner.next_int()
    c = scanner.next_int()

    i = (a + b == c)
    j = (a + c == b)
    k = (b + c == a)

    if i or j or k:
        print("Yes")
    else:
        print("No")
```
Note that the `FastScanner` class in Python is similar to the `FastScanner` class in Java, but it uses the `sys.stdin` stream to read input from the console, and it uses the `bytearray` class to store the input buffer. The `is_printable_char` method is also similar to the `isPrintableChar` method in Java, but it uses the `chr` function to convert the byte to a character. The rest of the code is similar to the Java code, but it uses Python syntax and idioms.</s>
