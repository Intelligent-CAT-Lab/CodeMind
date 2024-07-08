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
var newVariable_0 = q.add(2L);var newVariable_1 = q.add(8L);var newVariable_2 = q.size();		while(newVariable_2 > 0){
			long L = q.poll();
var newVariable_3 = all.add(L);			if(L >= (long)1e17)continue;
var newVariable_4 = q.add(L * 10 + 2);var newVariable_5 = q.add(L * 10 + 8);		}
		Collections.sort(all);
	}

	public int dfs(int i,long n){
		if(n == 1){
			return 0;
		}

var newVariable_6 = map[i].containsKey(n);		if(newVariable_6){
var newVariable_7 = map[i].get(n);			return newVariable_7;
		}

		int ret = -1;

var newVariable_8 = sub.size();		for(int j = i;j < newVariable_8;j++){
var newVariable_9 = sub.get(j);			if(n % newVariable_9 == 0){
var newVariable_10 = sub.get(j);				int tmp = dfs(j,n / newVariable_10);
				if(tmp+1 > 0){
var newVariable_11 = map[i].put(n, tmp+1);					return tmp+1;
				}
			}
		}

var newVariable_12 = map[i].put(n,ret);		return ret;
	}


	@SuppressWarnings("unchecked")
	public void solve() {
		N = nextLong();
		createGoodNumber();
		sub = new ArrayList<Long>();

var newVariable_13 = all.size();		for(int i = 0;i < newVariable_13;i++){
var newVariable_14 = all.get(i);var newVariable_15 = sub.add(all.get(i));var newVariable_16 = all.get(i);			if(N % newVariable_16 == 0)sub.add(newVariable_16);
		}

		if(N == 1){
			out.println(-1);
			return;
		}

var newVariable_17 = sub.size();		map = new HashMap[newVariable_17];
var newVariable_18 = sub.size();		for(int i = 0;i < newVariable_18;i++){
			map[i] = new HashMap<Long,Integer>();
		}

var newVariable_19 = sub.size();		if(newVariable_19 == 0){
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
var newVariable_20 = sb.appendCodePoint(b);		}
var newVariable_21 = sb.toString();		return newVariable_21;
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