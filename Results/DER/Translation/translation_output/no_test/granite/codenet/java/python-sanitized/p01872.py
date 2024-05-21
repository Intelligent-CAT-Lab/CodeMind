import java.io.*;
import java.util.*;
public class p01872
{
	public void solve()
	{
		s = next();
		if(s[-1] == '?'):
			sum = 0;
			for i in range(len(s) - 1):
				n = 11 - i;
				q = 0;
				p = int(s[i])
				if(n <= 6 and n >= 1):
					q = n + 1;
				else: #if(n >= 7 && n <= 11)
					q = n - 5; 
				sum += q * p;
			sum %= 11;
			if(sum <= 1):sum = 0;
			else sum = 11 - sum;
			print(sum);
		else:
			check = int(s[-1]);
			cnt = 0;
			ans = 0;
			for j in range(10):
				sum = 0;
				for i in range(len(s) - 1):
					n = 11 - i;
					q = 0;
					p = 0;
					if(s[i] == '?'):
						p = j;
					else:
						p = int(s[i]);
					if(n <= 6 and n >= 1):
						q = n + 1;
					else: #if(n >= 7 && n <= 11)
						q = n - 5; 
					sum += q * p;
				sum %= 11;
				if(sum <= 1):sum = 0;
				else sum = 11 - sum;
				if(check == sum):
					cnt += 1;
					ans = j;
			if(cnt == 1):
				print(ans);
			else:
				print("MULTIPLE");
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