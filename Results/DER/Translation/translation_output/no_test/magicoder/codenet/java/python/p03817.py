<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class p03817 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		long x = sc.nextLong();
		sc.close();
		
		long ans = x / 11 * 2 + x % 11 / 7 + Math.min(x % 11, 1);
		out.println(ans);
		out.flush();
	}
	
}

class Scanner {
	private final InputStream in;
	private final byte[] buffer;
	private int ptr;
	private int buflen;
	
	public Scanner(InputStream in) {
		this.in = in;
		this.buffer = new byte[1024];
		this.ptr = 0;
		this.buflen = 0;
	}
	
	public void close() {
		try {
			this.in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
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
	
	private byte readByte() {
		if (hasNextByte()) {
			return buffer[ptr++];
		} else {
			return -1;
		}
	}
	
	private boolean isPrintableChar(int c) {
		return '!' <= c && c <= '~';
	}
	
	private void skipUnprintable() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
			ptr++;
		}
	}
	
	public boolean hasNext() {
		skipUnprintable();
		return hasNextByte();
	}
	
	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		long n = 0;
		boolean minus = false;
		byte b = readByte();
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
	
}

```

@@ Response
```python
import sys

class Scanner:
    def __init__(self, inp):
        self.inp = inp
        self.buf = bytearray(inp.read(8192))
        self.l = len(self.buf)
        self.i = 0

    def read(self):
        if self.i == self.l:
            self.i = 0
            self.l = self.inp.readinto(self.buf)
        if self.l == 0:
            return -1
        return self.buf[self.i]

    def has_next(self):
        while self.i < self.l and not self.buf[self.i].isprintable():
            self.i += 1
        return self.i < self.l

    def next_long(self):
        if not self.has_next():
            raise EOFError
        b = self.read()
        if b == -1:
            raise EOFError
        minus = False
        if b == ord('-'):
            minus = True
            b = self.read()
        if not (ord('0') <= b <= ord('9')):
            raise ValueError
        n = b - ord('0')
        while True:
            b = self.read()
            if b == -1 or not self.buf[b].isprintable():
                return -n if minus else n
            if not (ord('0') <= b <= ord('9')):
                raise ValueError
            n *= 10
            n += b - ord('0')

def main():
    sc = Scanner(sys.stdin.buffer)
    x = sc.next_long()
    ans = x // 11 * 2 + x % 11 // 7 + min(x % 11, 1)
    print(ans)

if __name__ == '__main__':
    main()
```

This Python code does the same thing as the Java code. It reads a long integer from the standard input, calculates the answer, and prints it. The Scanner class is a Python equivalent of the Java Scanner class.<｜end▁of▁sentence｜>
