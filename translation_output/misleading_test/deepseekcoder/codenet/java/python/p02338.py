<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 10

Expected output:
80

```
import java.io.IOException;
import java.io.InputStream;
import java.util.*;
 
public class p02338 implements Runnable {
	
    public static void main(String[] args) {
    	new Thread(null, new p02338(), "", 16 * 1024 * 1024).start();
    }
    
    public void run() {
        FastScanner sc = new FastScanner();
        
        int n = sc.nextInt();
        int k = sc.nextInt();

        
        if(n<=k){
        	System.out.println(1);
        }
        else{
        	System.out.println(0);
        }
    }
}


class FastScanner {
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
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public int[] nextIntArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public Integer[] nextIntegerArray(int n){
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}

```

### Response:
```python
import sys

class FastScanner:
    def __init__(self, inp=sys.stdin):
        self.queue = []
        self.space = []
        self.inp = inp

    def read(self):
        if self.space:
            return self.space.pop()
        else:
            raise StopIteration

    def has_next(self):
        while not self.queue:
            line = self.inp.readline()
            self.queue.extend(line.split())
        return bool(self.queue)

    def next(self):
        if self.has_next():
            return self.queue.pop(0)
        else:
            raise StopIteration

    def next_int(self):
        return int(self.next())

    def next_line(self):
        if self.has_next():
            return self.next()
        else:
            raise StopIteration

def solve():
    sc = FastScanner()
    n = sc.next_int()
    k = sc.next_int()
    if n <= k:
        print(1)
    else:
        print(0)

if __name__ == "__main__":
    solve()
```

This Python code reads two integers from the standard input, and then prints 1 if the first integer is less than or equal to the second, and 0 otherwise. The FastScanner class is a modified version of the FastScanner class from the provided Java code, which reads integers from the standard input. The solve function uses this class to read the integers and print the appropriate output.
<|EOT|>
