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
System.out.println("[INST]16;None;q.add(2L);"+q.add(2L));
		q.add(8L);
System.out.println("[INST]17;None;q.add(8L);"+q.add(8L));
		while(q.size() > 0){
System.out.println("[INST]18;None;q.size();"+q.size());
			long L = q.poll();
System.out.println("[INST]19;L;q.poll();"+L);
			all.add(L);
System.out.println("[INST]20;None;all.add(L);"+all.add(L));
			if(L >= (long)1e17)continue;
			q.add(L * 10 + 2);
System.out.println("[INST]22;None;q.add(L * 10 + 2);"+q.add(L * 10 + 2));
			q.add(L * 10 + 8);
System.out.println("[INST]23;None;q.add(L * 10 + 8);"+q.add(L * 10 + 8));
		}
		Collections.sort(all);
System.out.println("[INST]25;None;Collections.sort(all);"+Collections.sort(all));
	}

	public int dfs(int i,long n){
		if(n == 1){
			return 0;
		}

		if(map[i].containsKey(n)){
System.out.println("[INST]33;None;map[i].containsKey(n);"+map[i].containsKey(n));
			return map[i].get(n);
System.out.println("[INST]34;None;map[i].get(n);"+map[i].get(n));
		}

		int ret = -1;

		for(int j = i;j < sub.size();j++){
System.out.println("[INST]39;None;sub.size();"+sub.size());
			if(n % sub.get(j) == 0){
System.out.println("[INST]40;None;sub.get(j);"+sub.get(j));
				int tmp = dfs(j,n / sub.get(j));
System.out.println("[INST]41;None;sub.get(j);"+sub.get(j));
				if(tmp+1 > 0){
					map[i].put(n, tmp+1);
System.out.println("[INST]43;None;map[i].put(n, tmp+1);"+map[i].put(n, tmp+1));
					return tmp+1;
				}
			}
		}

		map[i].put(n,ret);
System.out.println("[INST]49;None;map[i].put(n,ret);"+map[i].put(n,ret));
		return ret;
	}


	@SuppressWarnings("unchecked")
	public void solve() {
		N = nextLong();
		createGoodNumber();
		sub = new ArrayList<Long>();

		for(int i = 0;i < all.size();i++){
System.out.println("[INST]60;None;all.size();"+all.size());
			if(N % all.get(i) == 0)sub.add(all.get(i));
System.out.println("[INST]61;None;all.get(i);"+all.get(i));
System.out.println("[INST]61;None;sub.add(all.get(i));"+sub.add(all.get(i)));
System.out.println("[INST]61;None;all.get(i);"+all.get(i));
		}

		if(N == 1){
			out.println(-1);
			return;
		}

		map = new HashMap[sub.size()];
System.out.println("[INST]69;None;sub.size();"+sub.size());
		for(int i = 0;i < sub.size();i++){
System.out.println("[INST]70;None;sub.size();"+sub.size());
			map[i] = new HashMap<Long,Integer>();
		}

		if(sub.size() == 0){
System.out.println("[INST]74;None;sub.size();"+sub.size());
			out.println(-1);
		}else{
			out.println(dfs(0,N));
		}
	}

	public static void main(String[] args) {
		out.flush();
System.out.println("[INST]82;None;out.flush();"+out.flush());
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
System.out.println("[INST]99;buflen;in.read(buffer);"+buflen);
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
System.out.println("[INST]133;None;sb.appendCodePoint(b);"+sb.appendCodePoint(b));
		}
		return sb.toString();
System.out.println("[INST]135;None;sb.toString();"+sb.toString());
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