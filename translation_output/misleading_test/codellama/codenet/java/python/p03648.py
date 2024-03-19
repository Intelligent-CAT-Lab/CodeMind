<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
4

```
import java.io.IOException;
import java.io.InputStream;
import java.util.NoSuchElementException;
 
public class p03648 {
	private static FastScanner sc = new FastScanner();
	
	public static void main(String[] args) {
		long K = sc.nextLong();
		long A = K/50;
		long B = K%50;
		
		long[] a = new long[50];
		for(int i=0; i<50; i++) {
			a[i] = i + A;
		}
		
		for(int i=49; i>49-B; i--) {
			a[i]++;
		}
		
		System.out.println(50);
		for(int i=0; i<50; i++) {
			System.out.print(a[i]);
			if(i != 49) {
				System.out.println(" ");
			}
		}
		System.out.println();
	}
	
	static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte() {
            if(ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch(IOException e) {
                    e.printStackTrace();
                }
                if(buflen <= 0) {
                    return false;
                }
            }
            return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
        public boolean hasNext() { skipUnprintable(); return hasNextByte();}
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        public long nextLong() {
            return Long.parseLong(next());
        }
        public int nextInt(){
            return Integer.parseInt(next());
        }
        public double nextDouble(){
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
                print("Error reading from input stream")
            if self.buflen <= 0:
                return False

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.ptr]
        else:
            return -1

    def is_printable_char(self, c):
        return 33 <= c <= 126

    def skip_unprintable(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1

    def has_next(self):
        self.skip_unprintable()
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise NoSuchElementException
        sb = []
        b = self.read_byte()
        while self.is_printable_char(b):
            sb.append(chr(b))
            b = self.read_byte()
        return "".join(sb)

    def next_long(self):
        return int(self.next())

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

sc = FastScanner()

K = sc.next_long()
A = K // 50
B = K % 50

a = [i + A for i in range(50)]

for i in range(49 - B, 49):
    a[i] += 1

print(50)
for i in range(50):
    print(a[i], end=" ")
print()
```
Note that the `FastScanner` class in Python is similar to the `FastScanner` class in Java, but it uses the `sys.stdin` stream to read input from the console, and it uses the `bytearray` class to store the input buffer. The `has_next_byte`, `read_byte`, `is_printable_char`, `skip_unprintable`, `has_next`, `next`, `next_long`, `next_int`, and `next_double` methods are similar to the corresponding methods in the Java code, but they use Python's built-in functions and classes to perform the same operations.</s>
