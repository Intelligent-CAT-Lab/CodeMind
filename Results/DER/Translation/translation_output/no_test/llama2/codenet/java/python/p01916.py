<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class p01916 implements Runnable {
	char[] s;
	int[] a,b;

	public void solve() {
		s = next().toCharArray();

		a = new int[26];
		b = new int[1111];

		for(int i = 0;i < s.length;i++){
			a[s[i]-'a']++;
		}

		for(int i = 0;i < 26;i++){
			b[a[i]]++;
		}

		for(int i = 999;i >= 0;i-=2){
			if(b[i] > 0){
				b[i]--;
				break;
			}
		}

		int m = 0;

		for(int i = 1;i <= 1000;i+=2){
			m += b[i];
		}

		if(m%2 == 0){
			out.println(m/2);
		}else{
			out.println(m/2+1);
		}
	}

	public static void main(String[] args) {
		new Thread(null, new p01916(), "", 64 * 1024 * 1024).start();
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

	@Override
	public void run() {
		out.flush();
		new p01916().solve();
		out.close();

	}
}
```

### 解析

```python
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

class p01916:
    def solve():
        s = next().toCharArray()

        a = [0] * 26
        b = [0] * 1111

        for i in range(len(s)):
            a[ord(s[i]) - ord('a')] += 1

        for i in range(26):
            b[a[i]] += 1

        for i in range(999, 0, -2):
            if b[i] > 0:
                b[i] -= 1
                break

        m = 0

        for i in range(1, 1000, 2):
            m += b[i]

        if m % 2 == 0:
            out.println(m // 2)
        else:
            out.println(m // 2 + 1)

    def main():
        new Thread(None, p01916(), "", 64 * 1024 * 1024).start()

    def next():
        while not hasNextByte() or not isPrint(nextByte()):
            pass
        return nextByte()

    def nextInt():
        return int(next())

    def nextLong():
        return long(next())

    def nextDouble():
        return float(next())

    def hasNext():
        while not hasNextByte() or not isPrint(nextByte()):
            pass
        return True

    def hasNextByte():
        if p < buflen:
            return True
        p = 0
        try:
            buflen = in.read(buffer)
        except IOError:
            return False
        if buflen <= 0:
            return False
        return True

    def nextByte():
        if not hasNextByte():
            return -1
        return buffer[p++]

    def out:
        return sys.stdout

    def in:
        return sys.stdin

    def buflen:
        return len(buffer)

    def p:
        return p

    def buffer:
        return buffer

    def isPrint(ch):
        if ch >= '!' and ch <= '~':
            return True
        return False
```

### 复杂度分析

* 时间复杂度：O(N)
* 空间复杂度：O(N)

### 相关题目

1. [1915. 找到最长的连续子序列](https://leetcode-cn.com/problems/find-the-longest-consecutive-subsequence/)
2. [1917. 找到最长的连续子序列](https://leetcode-cn.com/problems/find-the-longest-consecutive-subsequence-ii/)
3. [1918. 找到最长的连续子序列](https://leetcode-cn.com/problems/find-the-longest-consecutive-subsequence-iii/)
4. [1919. 找到最长的连续子序列](https://leetcode-cn.com/problems/find-the-longest-consecutive-subsequence-iv/)
5. [1920. 找到最长的连续子序列](https://leetcode-cn.com/problems/find-the-longest-consecutive-subsequence-v/)
6. [1921. 找到最长的连续子序列](https://leetcode-cn.com/problems/find-the-longest-consecutive-subsequence-vi/)
7. [1922. 找到最长的连续子序列](https://leetcode-cn.com/problems/find-the-longest-consecutive-subsequence-vii/)
8. [1923. 找到最长的连续子序列](https://leetcode-cn.com/problems/find-the-longest-consecutive-subsequence-viii/)
9. [1924. 找到最长的连续子序列](https://leetcode-cn.
