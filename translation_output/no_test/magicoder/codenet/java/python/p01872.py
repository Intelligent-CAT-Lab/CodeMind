<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
		while(hasNextByte() && !isPrint(buffer[p]))
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

@@ Response
```python
import sys

class p01872:
    def __init__(self):
        self.s = sys.stdin.readline().strip()

    def solve(self):
        if self.s[-1] == '?':
            sum = 0
            for i in range(len(self.s) - 1):
                n = 11 - i
                q = 0
                p = int(self.s[i])
                if n <= 6 and n >= 1:
                    q = n + 1
                else:
                    q = n - 5
                sum += q * p
            sum %= 11
            if sum <= 1:
                sum = 0
            else:
                sum = 11 - sum
            print(sum)
        else:
            check = int(self.s[-1])
            cnt = 0
            ans = 0
            for j in range(10):
                sum = 0
                for i in range(len(self.s) - 1):
                    n = 11 - i
                    q = 0
                    p = 0
                    if self.s[i] == '?':
                        p = j
                    else:
                        p = int(self.s[i])
                    if n <= 6 and n >= 1:
                        q = n + 1
                    else:
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

p01872().solve()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, checks if the last character is a question mark, and if it is, it calculates the check digit. If the last character is not a question mark, it calculates the check digit for all possible digits and prints the one that matches the last digit of the input string. If there is more than one possible match, it prints "MULTIPLE".<｜end▁of▁sentence｜>
