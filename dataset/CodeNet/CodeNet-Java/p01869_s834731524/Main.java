import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.NoSuchElementException;

public class Main {
	long N;
	ArrayList<Long> all,sub;
	HashMap<Long,Integer>[] map;
	public void createGoodNumber(){
		all = new ArrayList<Long>();
		ArrayDeque<Long> q = new ArrayDeque<Long>();
		q.add(2L);
		q.add(8L);
		while(q.size() > 0){
			long L = q.poll();
			all.add(L);
			if(L >= (long)1e17)continue;
			q.add(L * 10 + 2);
			q.add(L * 10 + 8);
		}
		Collections.sort(all);
	}

	public int dfs(int i,long n){
		if(n == 1){
			return 0;
		}

		if(map[i].containsKey(n)){
			return map[i].get(n);
		}

		int ret = -1;

		for(int j = i;j < sub.size();j++){
			if(n % sub.get(j) == 0){
				int tmp = dfs(j,n / sub.get(j));
				if(tmp+1 > 0){
					map[i].put(n, tmp+1);
					return tmp+1;
				}
			}
		}

		map[i].put(n,ret);
		return ret;
	}


	@SuppressWarnings("unchecked")
	public void solve() {
		N = nextLong();
		createGoodNumber();
		sub = new ArrayList<Long>();

		for(int i = 0;i < all.size();i++){
			if(N % all.get(i) == 0)sub.add(all.get(i));
		}

		if(N == 1){
			out.println(-1);
			return;
		}

		map = new HashMap[sub.size()];
		for(int i = 0;i < sub.size();i++){
			map[i] = new HashMap<Long,Integer>();
		}

		if(sub.size() == 0){
			out.println(-1);
		}else{
			out.println(dfs(0,N));
		}
	}

	public static void main(String[] args) {
		out.flush();
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