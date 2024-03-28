<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 20

Expected output:
10


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
[/INST]
```python
import sys

def solve():
    x, y = map(int, input().split())
    if x >= 0:
        if y >= 0:
            if x > y:
                if y == 0:
                    print(x - y + 1)
                else:
                    print(x - y + 2)
            else:
                print(y - x)
        else:
            print(abs(abs(y) - x) + 1)
    else:
        if y >= 0:
            if y == 0:
                print(abs(abs(x) - y))
            else:
                print(abs(abs(x) - y) + 1)
        else:
            if x > y:
                print(x - y + 2)
            else:
                print(y - x)

if __name__ == "__main__":
    solve()
```</s>
