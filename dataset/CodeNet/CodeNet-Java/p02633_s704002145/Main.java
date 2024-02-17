import java.io.*;
import java.util.*;
import java.util.function.*;

public class Main {

	static MyReader sc = new MyReader();
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		solve();
		out.close();
	}

	static void solve() throws IOException {
		int x = sc.nextInt();
		int deg = 360;
		int ans = 0;
		while(deg%x!=0){
			ans += deg/x;
			deg = 360+deg%x;
		}
		ans += deg/x;
		out.println(ans);
	}

	//GCD
	static int GCD(int n, int m) {
		if(m > n)
			return GCD(m, n);
		if(n % m == 0)
			return m;
		else {
			return GCD(m, n % m);
		}
	}

}

class SegmentTree<T>{
	private int max;
	private List<T> seg = new ArrayList<>();;
	private T init;
	private BinaryOperator<T> comp;

	protected SegmentTree(int n,BinaryOperator<T> c,T init){
		comp = c;
		max = 1;
		while(max<n){
			max *= 2;
		}
		for(int i=0;i<2*max-1;i++){
			seg.add(init);
		}
		this.init = init;
	}

	public T get(int i){
		return seg.get(i);
	}

	public T getLeaf(int i){
		i += max-1;
		return seg.get(i);
	}

	public void set(int i,T x){
		seg.set(i,x);
	}

	public void setLeaf(int i,T x){
		i += max-1;
		seg.set(i,x);
	}

	public void update(int i,T x){
		i += max-1;
		seg.set(i,x);
		while(i>0){
			i = (i-1)/2;
			seg.set(i,comp.apply(seg.get(i*2+1),seg.get(i*2+2)));
		}
	}

	public T area(int l,int r){
		return areacalc(l,r,0,0,max);
	}

	public T areacalc(int l,int r,int node,int nl,int nr){
		if(nr<=l || r<=nl){
			return init;
		}else if(l<=nl && nr<=r){
			return seg.get(node);
		}else{
			return comp.apply(areacalc(l,r,node*2+1,nl,(nl+nr)/2),areacalc(l,r,node*2+2,(nl+nr)/2,nr));
		}
	}

	public String toString(){
		return seg.toString();
	}

}

class Pair<U,V>{
	private U first;
	private V second;
	protected Pair(U i,V j){
		first = i;
		second = j;
	}
	public U getFirst(){
		return first;
	}
	public void setFirst(U i){
		first = i;
	}
	public V getSecond(){
		return second;
	}
	public void setSecond(V i){
		second = i;
	}
}

class MyReader {
	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static String[] line = new String[0];
	private static int num = 0;

	protected MyReader() {

	}

	private void nextline() throws IOException {
		String s = in.readLine();
		line = s.split(" ");
	}

	protected String next() throws IOException {
		if(num == line.length) {
			nextline();
			num = 0;
		}
		String ret = line[num];
		num++;
		return ret;
	}

	protected int nextInt() throws IOException {
		if(num == line.length) {
			nextline();
			num = 0;
		}
		int ret = Integer.valueOf(line[num]);
		num++;
		return ret;
	}

	protected long nextLong() throws IOException {
		if(num == line.length) {
			nextline();
			num = 0;
		}
		long ret = Long.valueOf(line[num]);
		num++;
		return ret;
	}

	protected double nextDouble() throws IOException {
		if(num == line.length) {
			nextline();
			num = 0;
		}
		double ret = Double.valueOf(line[num]);
		num++;
		return ret;
	}

	protected char nextChar() throws IOException {
		if(num == line.length) {
			nextline();
			num = 0;
		}
		char ret = line[num].toCharArray()[0];
		num++;
		return ret;
	}
}

// Combination
class Combination {
	public static int MAX = 510000;
	public static int MOD = 1000000007;

	public long[] f = new long[MAX];
	public long[] finv = new long[MAX];
	public long[] inv = new long[MAX];

	protected Combination() {
		f[0] = f[1] = 1;
		finv[0] = finv[1] = 1;
		inv[1] = 1;
		for(int i = 2; i < MAX; i++) {
			f[i] = f[i - 1] * i % MOD;
			inv[i] = MOD - inv[MOD % i] * (MOD / i) % MOD;
			finv[i] = finv[i - 1] * inv[i] % MOD;
		}
	}

	public long com(int n, int k) {
		if(n < k)
			return 0;
		if(n < 0 || k < 0)
			return 0;
		return f[n] * (finv[k] * finv[n - k] % MOD) % MOD;
	}

	public long inverse(int n) {
		return inv[n];
	}

	public long factorial(int n) {
		return f[n];
	}
}

//Tree
class Tree{
	private int n;
	private int root;
	private List<Integer>[] v;
	private int[] dist;
	private int[] size;

	protected Tree(int n){
		this.n = n;
		v = new ArrayList[n];
		for(int i=0;i<n;i++){
			v[i] = new ArrayList<>();
		}
		dist = new int[n];
		size = new int[n];
	}

	public void add(int i, int j){
		v[i].add(j);
		v[j].add(i);
	}

	public List<Integer> getV(int num){
		return v[num];
	}
	public void setV(List<Integer> tmp, int num){
		v[num] = new ArrayList<>(tmp);
	}
	public void setRoot(int num){
		root = num;
	}
	public int getRoot(){
		return root;
	}
	public int getDist(int i){
		return dist[i];
	}
	public int getSize(int i){
		return size[i];
	}

	public void distCalc(){
		size[root] = calc(root, -1, 0);
	}
	public void distCalc(int i){
		root = i;
		size[root] = calc(root, -1, 0);
	}
	private int calc(int here, int parent, int num){
		dist[here] = num;
		int s = 1;
		for(Integer e : v[here]){
			if(e!=parent) s += calc(e, here, num+1);
		}
		size[here] = s;
		return s;
	}
}


// Graph
class Graph {
	private int n;
	private List<Integer>[] v;
	private int[][] dist;

	protected Graph(int num) {
		n = num;
		v = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			v[i] = new ArrayList<>();
		}
		dist = new int[n][n];
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j)
					dist[i][j] = 0;
				else
					dist[i][j] = 10000000;
			}
		}
	}

	public void add(int i, int j) {
		v[i].add(j);
		v[j].add(i);
		dist[i][j] = 1;
		dist[j][i] = 1;
	}

	public void add(int i, int j, int c){
		v[i].add(j);
		v[j].add(i);
		dist[i][j] = c;
		dist[j][i] = c;
	}

	public List<Integer> getV(int i){
		return v[i];
	}

	public int bfs(int i, int j) {
		boolean[] check = new boolean[n];
		Arrays.fill(check, false);
		check[i] = true;
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(i);
		while(!queue.isEmpty()) {
			int tmp = queue.poll();
			for(Integer e : v[tmp]) {
				if(!check[e]) {
					dist[i][e] = dist[i][tmp] + 1;
					queue.add(e);
				}
			}
		}
		return dist[i][j];
	}

	public void warshalFloyd() {
		for(int k = 0; k < n; k++) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}
	}

	public int getDist(int i, int j){
		return dist[i][j];
	}

}

// union-find木
class UnionFind {
	private int[] parent;
	private int[] depth;
	private int[] size;

	protected UnionFind(int n) {
		super();
		parent = new int[n];
		for(int i = 0; i < n; i++) {
			parent[i] = i;
		}
		depth = new int[n];
		size = new int[n];
		for(int i = 0; i < n; i++) {
			depth[i] = 1;
			size[i] = 1;
		}
	}

	public int parent(int n) {
		if(parent[n] == n) {
			return n;
		} else {
			return parent(parent[n]);
		}
	}

	public void add(int a, int b) {
		int pa = parent(a);
		int pb = parent(b);
		if(pa != pb) {
			if(depth[pa] > depth[pb]) {
				parent[pb] = pa;
				size[pa] += pb;
			} else if(depth[pa] == depth[pb]) {
				parent[pb] = pa;
				size[pa] += pb;
				depth[pa]++;
			} else {
				parent[pa] = pb;
				size[pb] += pa;
			}
		}
	}

	public int size(int n) {
		return size[parent(n)];
	}

}
