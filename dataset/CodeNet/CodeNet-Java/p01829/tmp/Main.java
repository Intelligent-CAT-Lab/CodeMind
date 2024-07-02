import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.NoSuchElementException;

public class Main {
	char[] ch;
	String S;
	boolean[] use = new boolean[10];

	long minDiff = Long.MAX_VALUE;
	String ansStr;
	String startStr;

	public void dfs(int n)
	{
		if(n == ch.length){
			ansStr = startStr;
			return;
		}

		if(n == 0){
			use[(ch[n] - '0' + 5) % 10] = true;
			startStr = startStr + (char)((ch[n] - '0' + 5) % 10 + '0');
			dfs(n + 1);
			return;
		}

		if(!use[ch[n] - '0']){
			dfs2(n,"");
			use[ch[n] - '0'] = true;
			startStr = startStr + ch[n];
			dfs(n + 1);
			return;
		}
		dfs2(n,"");
	}

	public void dfs2(int n,String s){
		if(n == ch.length){
			long a = Long.valueOf(S.substring(startStr.length()));
System.out.println("[INST]40;a;Long.valueOf(S.substring(startStr.length()));"+a);
System.out.println("[INST]40;None;S.substring(startStr.length());"+S.substring(startStr.length()));
System.out.println("[INST]40;None;startStr.length();"+startStr.length());
			long b = Long.valueOf(s);
System.out.println("[INST]41;b;Long.valueOf(s);"+b);

			long diff = Math.abs(a - b);
System.out.println("[INST]43;diff;Math.abs(a - b);"+diff);

			if(minDiff > diff){
				ansStr = startStr + s;
				minDiff = diff;
			}
			return;
		}

		for(int i = 0;i < 10;i++){
			if(use[i])continue;
			use[i] = true;
			dfs2(n + 1,s + (char)(i + '0'));
			use[i] = false;
		}
	}

	public void solve() {
		S = next();
		ch = S.toCharArray();
System.out.println("[INST]62;ch;S.toCharArray();"+ch);
		startStr = "";
		ansStr = "";
		dfs(0);
		out.println(ansStr);

	}

	public static void main(String[] args) {
		out.flush();
System.out.println("[INST]71;None;out.flush();"+out.flush());
		new Main().solve();
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
System.out.println("[INST]88;buflen;in.read(buffer);"+buflen);
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
System.out.println("[INST]122;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
		}
		return sb.toString();
System.out.println("[INST]124;None;sb.toString();"+sb.toString());
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