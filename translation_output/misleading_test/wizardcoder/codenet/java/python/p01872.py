Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
?12345678901

Expected output:
13

```
import java.io.*;
import java.util.*;
public class p01872
{
	public void solve()
	{
		String s = next();
		if(s.charAt(s.length() - 1) == '?')
		{
			int sum = 0;
			for(int i = 0;i < s.length() - 1;i++)
			{
				int n = 11 - i;
				int q = 0;
				int p = s.charAt(i) - '0';
				if(n <= 6 && n >= 1)
				{
					q = n + 1;
				}else //if(n >= 7 && n <= 11)
				{
					q = n - 5; 
				}
				sum += q * p;
			}
			sum %= 11;
			if(sum <= 1)sum = 0;
			else sum = 11 - sum;
			out.println(sum);
		}else
		{
			int check = s.charAt(s.length() - 1) - '0';
			int cnt = 0;
			int ans = 0;
			for(int j = 0;j <= 9;j++)
			{
				int sum = 0;
				for(int i = 0;i < s.length() - 1;i++)
				{
					int n = 11 - i;
					int q = 0;
					int p = 0;
					if(s.charAt(i) == '?')
					{
						p = j;
					}else
					{
						p = s.charAt(i) - '0';
					}

					if(n <= 6 && n >= 1)
					{
						q = n + 1;
					}else //if(n >= 7 && n <= 11)
					{
						q = n - 5; 
					}
					sum += q * p;
				}
				sum %= 11;
				if(sum <= 1)sum = 0;
				else sum = 11 - sum;
				if(check == sum)
				{	
					cnt++;
					ans = j;
				}
			}
		if(cnt == 1)
		{
			out.println(ans);
		}else
		{
			out.println("MULTIPLE");
		}
	}
	}
	public static void main(String[] args)
	{
		out.flush();
		new p01872().solve();
		out.close();
	}
	/*Input*/
	private static final InputStream in = System.in;
	private static final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[2048];
	private int p = 0;
	private int buflen = 0;
 
	private boolean hasNextByte()
	{
		if(p < buflen)return true;
		p = 0;
		try
		{
			buflen = in.read(buffer);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		if(buflen <= 0)return false;
		return true;
	}
	public boolean hasNext()
	{
		while(hasNextByte() &&!isPrint(buffer[p]))
		{
			p++;
		}
		return hasNextByte();
	}
 
	private boolean isPrint(int ch)
	{
		if(ch >= '!' && ch <= '~')return true;
		return false;
	}
 
	private int nextByte()
	{
		if(!hasNextByte())return -1;
		return buffer[p++];
	}
 
	public String next()
	{
		if(!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = -1;
		while(isPrint((b = nextByte())))
		{
			sb.appendCodePoint(b);
		}
		return sb.toString();
	}
 
	public int nextInt()
	{
		return Integer.parseInt(next());
	}
 
	public long nextLong()
	{
		return Long.parseLong(next());
	}
 
	public double nextDouble()
	{
		return Double.parseDouble(next());
	}
}
```

### Response:
Here's the Python code for the given Java code:

```python
import java.io.*;
import java.util.*;

class p01872:
    def solve(self):
        s = self.next()
        if s[-1] == '?':
            sum = 0
            for i in range(len(s)-1):
                n = 11 - i
                q = 0
                p = ord(s[i]) - ord('0')
                if n <= 6 and n >= 1:
                    q = n + 1
                else: #if(n >= 7 && n <= 11)
                    q = n - 5
                sum += q * p
            sum %= 11
            if sum <= 1:
                sum = 0
            else:
                sum = 11 - sum
            print(sum)
        else:
            check = ord(s[-1]) - ord('0')
            cnt = 0
            ans = 0
            for j in range(10):
                sum = 0
                for i in range(len(s)-1):
                    n = 11 - i
                    q = 0
                    p = 0
                    if s[i] == '?':
                        p = j
                    else:
                        p = ord(s[i]) - ord('0')
                    if n <= 6 and n >= 1:
                        q = n + 1
                    else: #if(n >= 7 && n <= 11)
                        q = n - 5
                    sum += q * p
                sum %= 11
                if sum <= 1:
                    sum = 0
                else:
                    sum = 11 - sum
                if check == sum:
                    cnt += 1
                    ans = j
            if cnt == 1:
                print(ans)
            else:
                print("MULTIPLE")

    def main(self):
        out.flush()
        p01872().solve()
        out.close()

    def __init__(self):
        self.in_ = System.in
        self.out_ = PrintWriter(System.out)
        self.buffer = bytearray(2048)
        self.p = 0
        self.buflen = 0

    def hasNextByte(self):
        if self.p < self.buflen:
            return True
        self.p = 0
        try:
            self.buflen = self.in_.read(self.buffer)
        except IOException as e:
            e.printStackTrace()
        if self.buflen <= 0:
            return False
        return True

    def hasNext(self):
        while self.hasNextByte() and not self.isPrint(self.buffer[self.p]):
            self.p += 1
        return self.hasNextByte()

    def isPrint(self, ch):
        if ch >= ord('!') and ch <= ord('~'):
            return True
        return False

    def nextByte(self):
        if not self.hasNextByte():
            return -1
        return self.buffer[self.p]

    def next(self):
        if not self.hasNext():
            raise NoSuchElementException()
        sb = StringBuilder()
        b = -1
        while self.isPrint((b = self.nextByte())):
            sb.appendCodePoint(b)
        return sb.toString()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

out = PrintWriter(System.out)
p01872().main()
out.close()
```

The Python code is almost identical to the Java code, except for the following changes:

- The `out` variable is declared outside the `p01872` class, and is used to print the output.
- The `out.close()` statement is added at the end of the `main()` method to close the output stream.
- The `out.flush()` statement is added at the beginning of the `main()` method to flush the output stream.
- The `out` variable is used instead of `System.out` to print the output.

