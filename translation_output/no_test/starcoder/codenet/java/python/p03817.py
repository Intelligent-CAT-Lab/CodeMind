<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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
		while (hasNextByte() &&!isPrintableChar(buffer[ptr])) {
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
			} else if (b == -1 ||!isPrintableChar(b)) {
				return minus? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	
}

```

python code:<fim_suffix><fim_middle>
```python
import sys

class Scanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray()
        self.pos = 0
        self.buffer_len = 0
        self.eof = False

    def read(self, n):
        while self.buffer_len < n and not self.eof:
            self.buffer += self.stream.read(1024)
            self.buffer_len = len(self.buffer)
            if self.buffer_len == 0:
                self.eof = True
        if self.eof and self.buffer_len == 0:
            return None
        else:
            data = self.buffer[self.pos:self.pos+n]
            self.pos += n
            return data

    def readline(self):
        data = []
        while True:
            c = self.read(1)
            if c == b'\n' or c == b'':
                break
            data.append(c)
        return b''.join(data)

    def next_int(self):
        data = self.readline()
        if data == None:
            return None
        return int(data)

    def next_long(self):
        data = self.readline()
        if data == None:
            return None
        return int(data)

    def close(self):
        self.stream.close()

def main():
    sc = Scanner(sys.stdin)
    x = sc.next_long()
    sc.close()

    ans = x // 11 * 2 + x % 11 // 7 + min(x % 11, 1)
    print(ans)

if __name__ == '__main__':
    main()
```
<|endoftext|>
