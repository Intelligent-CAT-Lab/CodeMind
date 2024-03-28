<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class p03838 {
	int x,y;
	public void solve() {
		x = nextInt();
		y = nextInt();

		if(x >= 0){
			if(y >= 0){
				if(x > y){
					if(y == 0){
						out.println(x-y+1);
					}else{
						out.println(x-y+2);
					}
				}else{
					out.println(y-x);
				}
			}else{
				out.println(Math.abs(Math.abs(y)-x)+1);
			}
		}else{
			if(y >= 0){
				if(y == 0){
					out.println(Math.abs(Math.abs(x)-y));
				}else{
					out.println(Math.abs(Math.abs(x)-y)+1);
				}
			}else{
				if(x > y){
					out.println(x-y+2);
				}else{
					out.println(y-x);
				}
			}
		}
	}

	public static void main(String[] args) {
		out.flush();
		new p03838().solve();
		out.close();
	}

	/* Input */
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;

	private boolean hasNextByte() {
		if (p < buflen)
			return true;
		p = 0;
		try {
			buflen = in.read(buffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (buflen <= 0)
			return false;
		return true;
	}

	public boolean hasNext() {
		while (hasNextByte() && !isPrint(buffer[p])) {
			p++;
		}
		return hasNextByte();
	}

	private boolean isPrint(int ch) {
		if (ch >= '!' && ch <= '~')
			return true;
		return false;
	}

	private int nextByte() {
		if (!hasNextByte())
			return -1;
		return buffer[p++];
	}

	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while (isPrint((b = nextByte()))) {
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}

	public int nextInt() {
		return Integer.parseInt(next());
	}

	public long nextLong() {
		return Long.parseLong(next());
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
```

### Response:
```python
import sys

class p03838:
    def __init__(self):
        self.x, self.y = 0, 0

    def solve(self):
        self.x = self.nextInt()
        self.y = self.nextInt()

        if self.x >= 0:
            if self.y >= 0:
                if self.x > self.y:
                    if self.y == 0:
                        print(self.x - self.y + 1)
                    else:
                        print(self.x - self.y + 2)
                else:
                    print(self.y - self.x)
            else:
                print(abs(abs(self.y) - self.x) + 1)
        else:
            if self.y >= 0:
                if self.y == 0:
                    print(abs(abs(self.x) - self.y))
                else:
                    print(abs(abs(self.x) - self.y) + 1)
            else:
                if self.x > self.y:
                    print(self.x - self.y + 2)
                else:
                    print(self.y - self.x)

    def main(self):
        self.solve()

    def next(self):
        return sys.stdin.readline().rstrip()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

if __name__ == "__main__":
    p03838().main()
```

Please note that Python does not have a built-in `long` type, so you may need to use the `long` module if you want to use long integers. Also, Python uses `sys.stdin.readline().rstrip()` to read input, which is equivalent to `BufferedReader` in Java.
<|EOT|>
