<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
```python
import sys

def fast_scanner():
    inp = sys.stdin
    buffer = bytearray(1024)
    ptr, buflen = 0, 0

    def has_next_byte():
        if ptr < buflen:
            return True
        else:
            ptr = 0
            try:
                buflen = inp.read(buffer)
            except IOError:
                return False
            if buflen <= 0:
                return False
        return True

    def read_byte():
        if has_next_byte():
            return buffer[ptr]
        else:
            return -1

    def is_printable_char(c):
        return 33 <= c and c <= 126

    def has_next():
        while has_next_byte() and not is_printable_char(buffer[ptr]):
            ptr += 1
        return has_next_byte()

    def next():
        if not has_next():
            raise NoSuchElementError()
        sb = StringBuilder()
        b = read_byte()
        while is_printable_char(b):
            sb.append(chr(b))
            b = read_byte()
        return sb.str()

    def next_long():
        if not has_next():
            raise NoSuchElementError()
        n = 0
        minus = False
        b = read_byte()
        if b == '-':
            minus = True
            b = read_byte()
        if b < '0' or '9' < b:
            raise ValueError()
        while True:
            if '0' <= b and b <= '9':
                n *= 10
                n += b - '0'
            elif b == -1 or not is_printable_char(b):
                return minus * n if minus else n
            else:
                raise ValueError()
        return next_long()

    def next_int():
        return next_long() // 10

    def next_double():
        return float(next())

if __name__ == '__main__':
    a = int(input())
    b = int(input())
    c = int(input())

    i = (a + b == c)
    j = (a + c == b)
    k = (b + c == a)

    if i or j or k:
        print("Yes")
    else:
        print("No")
```</s>
