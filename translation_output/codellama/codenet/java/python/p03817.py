<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

class Scanner:
    def __init__(self, inp):
        self.inp = inp
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def close(self):
        try:
            self.inp.close()
        except IOError:
            pass

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.inp.readinto(self.buffer)
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
        return '!' <= c and c <= '~'

    def skip_unprintable(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1

    def has_next(self):
        self.skip_unprintable()
        return self.has_next_byte()

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
                return minus and -n or n
            else:
                raise NumberFormatException()
            b = self.read_byte()

sc = Scanner(sys.stdin)
out = PrintWriter(sys.stdout)

x = sc.next_long()
sc.close()

ans = x // 11 * 2 + x % 11 // 7 + min(x % 11, 1)
out.println(ans)
out.flush()
```
This is the Python code equivalent to the Java code you provided. It uses the `sys` module to read from standard input and write to standard output, and the `bytearray` class to store the input data. The `Scanner` class is similar to the Java `Scanner` class, but it uses Python's `bytearray` class instead of a `byte[]` array. The `next_long` method is similar to the Java `nextLong` method, but it uses Python's `min` function instead of the Java `Math.min` method.</s>
