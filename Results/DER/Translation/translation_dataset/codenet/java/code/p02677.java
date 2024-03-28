import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.IntStream;

public class p02677 {
	public static void main(String[] args) {
		p02677 main = new p02677();
		main.solve();
	}

	private void solve() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();
		double a_x = 1.0 * A * Math.sin(Math.PI * 2 * (H * 60 + M) / 720);
		double b_x = 1.0 * B * Math.sin(Math.PI * 2 * M / 60);
		double a_y = 1.0 * A * Math.cos(Math.PI * 2 * (H * 60 + M) / 720);
		double b_y = 1.0 * B * Math.cos(Math.PI * 2 * M / 60);
		System.out.println(Math.sqrt((a_x - b_x) * (a_x - b_x) + (a_y - b_y) * (a_y - b_y)));
	}

	class Scanner {
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int index;
		private int length;

		public Scanner(InputStream in) {
			this.in = in;
		}

		private boolean isPrintableChar(int c) {
			return '!' <= c && c <= '~';
		}

		private boolean isDigit(int c) {
			return '0' <= c && c <= '9';
		}

		private boolean hasNextByte() {
			if (index < length) {
				return true;
			} else {
				try {
					length = in.read(buffer);
					index = 0;
				} catch (IOException e) {
					e.printStackTrace();
				}
				return length > 0;
			}
		}

		private boolean hasNext() {
			while (hasNextByte() && !isPrintableChar(buffer[index])) {
				index++;
			}
			return hasNextByte();
		}

		private int readByte() {
			return hasNextByte() ? buffer[index++] : -1;
		}

		public String next() {
			if (!hasNext()) {
				throw new RuntimeException("no input");
			}
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (isPrintableChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}

		public long nextLong() {
			if (!hasNext()) {
				throw new RuntimeException("no input");
			}
			long value = 0L;
			boolean minus = false;
			int b = readByte();
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			while (isPrintableChar(b)) {
				if (isDigit(b)) {
					value = value * 10 + (b - '0');
				}
				b = readByte();
			}
			return minus ? -value : value;
		}

		public int nextInt() {
			return (int)nextLong();
		}

		public double nextDouble() {
			return Double.parseDouble(next());
		}
	}

	interface CombCalculator {
		long comb(int n, int m);
	}

	interface MobiusFunction {
		int get(int n);
	}

	/**
	 * メビウス関数をエラトステネスの篩っぽく前計算するクラスです。
	 * 計算量はO(1)で、前計算でO(N logN)です。
	 */
	class SieveMobiusFunction implements MobiusFunction {
		int size;
		int[] mobiusFunctionValues;

		public SieveMobiusFunction(int size) {
			this.size = size;
			mobiusFunctionValues = new int[size];

			mobiusFunctionValues[0] = 0;
			mobiusFunctionValues[1] = 1;
			for (int i = 2; i < size; i++) {
				mobiusFunctionValues[i] = 1;
			}
			for (int i = 2; i * i < size; i++) {
				for (int k = 1; i * i * k < size; k++) {
					mobiusFunctionValues[i * i * k] *= 0;
				}
			}

			for (int i = 2; i < size; i++) {
				if (mobiusFunctionValues[i] == 1) {
					for (int k = 1; i * k < size; k++) {
						mobiusFunctionValues[i * k] *= -2;
					}
				}
				if (mobiusFunctionValues[i] > 1) {
					mobiusFunctionValues[i] = 1;
				}
				if (mobiusFunctionValues[i] < -1) {
					mobiusFunctionValues[i] = -1;
				}
			}
		}

		@Override
		public int get(int n) {
			if (n > size) {
				throw new RuntimeException("n is greater than size.");
			}
			if (n < 0) {
				return 0;
			}
			return mobiusFunctionValues[n];
		}
	}

	/**
	 * メビウス関数を定義通り計算するクラスです。
	 * 計算量はO(logN)です。
	 */
	class PrimeFactorizationMobiusFunction implements MobiusFunction {
		@Override
		public int get(int n) {
			if (n <= 0) {
				return 0;
			}
			if (n == 1) {
				return 1;
			}
			int num = 0;
			for (int i = 2; i < n; i++) {
				if (n % i == 0) {
					n /= i;
					num++;
					if (n % i == 0) {
						return 0;
					}
				}
			}
			return num % 2 == 0 ? -1 : 1;
		}
	}

	/**
	 * 組み合わせ計算を階乗の値で行うクラスです(MOD対応)
	 * 階乗とその逆元は前計算してテーブルに格納します。
	 * C(N, N) % M の計算量は O(1)、 前計算でO(max(N, logM))です。
	 * sizeを1e8より大きい値で実行するとMLEの危険性があります。
	 * また素数以外のMODには対応していません(逆元の計算に素数の剰余環の性質を利用しているため)。
	 */
	class FactorialTableCombCalculator implements CombCalculator {
		int size;
		long[] factorialTable;
		long[] inverseFactorialTable;
		long mod;

		public FactorialTableCombCalculator(int size, long mod) {
			this.size = size;
			factorialTable = new long[size + 1];
			inverseFactorialTable = new long[size + 1];
			this.mod = mod;

			factorialTable[0] = 1L;
			for (int i = 1; i <= size; i++) {
				factorialTable[i] = (factorialTable[i - 1] * i) % mod;
			}
			inverseFactorialTable[size] = inverse(factorialTable[size], mod);
			for (int i = size - 1; i >= 0; i--) {
				inverseFactorialTable[i] = (inverseFactorialTable[i + 1] * (i + 1)) % mod;
			}
		}

		private long inverse(long n, long mod) {
			return pow(n, mod - 2, mod);
		}

		private long pow(long n, long p, long mod) {
			if (p == 0) {
				return 1L;
			}
			long half = pow(n, p / 2, mod);
			long ret = (half * half) % mod;
			if (p % 2 == 1) {
				ret = (ret * n) % mod;
			}
			return ret;
		}

		@Override
		public long comb(int n, int m) {
			if (n > size) {
				throw new RuntimeException("n is greater than size.");
			}
			if (n < 0 || m < 0 || n < m) {
				return 0L;
			}
			return (((factorialTable[n] * inverseFactorialTable[m]) % mod) * inverseFactorialTable[n - m]) % mod;
		}
	}

	/**
	 * 組み合わせ計算をテーブルで実装したクラスです(MOD対応)
	 * 前計算でO(N^2), combはO(1)で実行できます
	 * sizeを2 * 1e4より大きい値で実行するとMLEの危険性があります
	 */
	class TableCombCalculator implements CombCalculator {
		long[][] table;
		int size;

		public TableCombCalculator(int size, long mod) {
			this.size = size;
			table = new long[size + 1][];

			table[0] = new long[1];
			table[0][0] = 1L;
			for (int n = 1; n <= size; n++) {
				table[n] = new long[n + 1];
				table[n][0] = 1L;
				for (int m = 1; m < n; m++) {
					table[n][m] = (table[n - 1][m - 1] + table[n - 1][m]) % mod;
				}
				table[n][n] = 1L;
			}
		}

		@Override
		public long comb(int n, int m) {
			if (n > size) {
				throw new RuntimeException("n is greater than size.");
			}
			if (n < 0 || m < 0 || n < m) {
				return 0L;
			}
			return table[n][m];
		}
	}

	interface Graph {
		void link(int from, int to, long cost);
		Optional<Long> getCost(int from, int to);
		int getVertexNum();
	}

	interface FlowResolver {
		long maxFlow(int from, int to);
	}

	/**
	 * グラフの行列による実装
	 * 接点数の大きいグラフで使うとMLEで死にそう
	 */
	class ArrayGraph implements Graph {
		private Long[][] costArray;
		private int vertexNum;

		public ArrayGraph(int n) {
			costArray = new Long[n][];
			for (int i = 0; i < n; i++) {
				costArray[i] = new Long[n];
			}
			vertexNum = n;
		}

		@Override
		public void link(int from, int to, long cost) {
			costArray[from][to] = new Long(cost);
		}

		@Override
		public Optional<Long> getCost(int from, int to) {
			return Optional.ofNullable(costArray[from][to]);
		}

		@Override
		public int getVertexNum() {
			return vertexNum;
		}
	}

	/**
	 * DFS(深さ優先探索)による実装
	 * 計算量はO(E*MaxFlow)のはず (E:辺の数, MaxFlow:最大フロー)
	 */
	class DfsFlowResolver implements FlowResolver {
		private Graph graph;
		public DfsFlowResolver(Graph graph) {
			this.graph = graph;
		}

		/**
		 * 最大フロー(最小カット)を求める
		 * @param from 始点(source)のID
		 * @param to 終点(target)のID
		 * @return 最大フロー(最小カット)
		 */
		public long maxFlow(int from, int to) {
			long sum = 0L;
			long currentFlow;
			do {
				currentFlow = flow(from, to, Long.MAX_VALUE / 3, new boolean[graph.getVertexNum()]);
				sum += currentFlow;
			} while (currentFlow > 0);
			return sum;
		}

		/**
		 * フローの実行 グラフの更新も行う
		 * @param from 現在いる節点のID
		 * @param to 終点(target)のID
		 * @param current_flow ここまでの流量
		 * @param passed 既に通った節点か否かを格納した配列
		 * @return 終点(target)に流した流量/戻りのグラフの流量
		 */
		private long flow(int from, int to, long current_flow, boolean[] passed) {
			passed[from] = true;
			if (from == to) {
				return current_flow;
			}
			for (int id = 0; id < graph.getVertexNum(); id++) {
				if (passed[id]) {
					continue;
				}
				Optional<Long> cost = graph.getCost(from, id);
				if (cost.orElse(0L) > 0) {
					long nextFlow = current_flow < cost.get() ? current_flow : cost.get();
					long returnFlow = flow(id, to, nextFlow, passed);
					if (returnFlow > 0) {
						graph.link(from, id, cost.get() - returnFlow);
						graph.link(id, from, graph.getCost(id, from).orElse(0L) + returnFlow);
						return returnFlow;
					}
				}
			}
			return 0L;
		}
	}

	/**
	 * 1-indexedのBIT配列
	 */
	class BinaryIndexedTree {
		private long[] array;

		public BinaryIndexedTree(int size) {
			this.array = new long[size + 1];
		}

		/**
		 * 指定した要素に値を加算する
		 * 計算量はO(logN)
		 * @param index 加算する要素の添字
		 * @param value 加算する量
		 */
		public void add(int index, long value) {
			for (int i = index; i < array.length; i += (i & -i)) {
				array[i] += value;
			}
		}

		/**
		 * 1〜指定した要素までの和を取得する
		 * 計算量はO(logN)
		 * @param index 和の終端となる要素の添字
		 * @return 1〜indexまでの和
		 */
		public long getSum(int index) {
			long sum = 0L;
			for (int i = index; i > 0; i -= (i & -i)) {
				sum += array[i];
			}
			return sum;
		}
	}

	/**
	 * 1-indexedの2次元BIT配列
	 */
	class BinaryIndexedTree2D {
		private long[][] array;

		public BinaryIndexedTree2D(int size1, int size2) {
			this.array = new long[size1 + 1][];
			for (int i = 1; i <= size1; i++) {
				this.array[i] = new long[size2 + 1];
			}
		}

		/**
		 * 指定した要素に値を加算する
		 * 計算量はO(logN * logN)
		 * @param index1 加算する要素の1次元目の添字
		 * @param index2 加算する要素の2次元目の添字
		 * @param value 加算する量
		 */
		public void add(int index1, int index2, long value) {
			for (int i1 = index1; i1 < array.length; i1 += (i1 & -i1)) {
				for (int i2 = index2; i2 < array.length; i2 += (i2 & -i2)) {
					array[i1][i2] += value;
				}
			}
		}

		/**
		 * (1,1)〜指定した要素までの矩形和を取得する
		 * 計算量はO(logN * logN)
		 * @param index1 和の終端となる要素の1次元目の添字
		 * @param index2 和の終端となる要素の2次元目の添字
		 * @return (1,1)〜(index1,index2)までの矩形和
		 */
		public long getSum(int index1, int index2) {
			long sum = 0L;
			for (int i1 = index1; i1 > 0; i1 -= (i1 & -i1)) {
				for (int i2 = index2; i2 > 0; i2 -= (i2 & -i2)) {
					sum += array[i1][i2];
				}
			}
			return sum;
		}
	}

	interface UnionFind {
		void union(int A, int B);
		boolean judge(int A, int B);
		Set<Integer> getSet(int id);
	}

	/**
	 * ArrayUnionFindの拡張
	 * MapSetで根の添字から根にぶら下がる頂点の集合が取得できるようにした
	 * getSetメソッドをO(logN * logN)に落とせているはず
	 * ただしunionメソッドは2倍の計算量になっているので注意(オーダーは変わらないはず)
	 */
	class SetUnionFind extends ArrayUnionFind {
		Map<Integer, Set<Integer>> map;
		public SetUnionFind(int size) {
			super(size);
			map = new HashMap<>();
			for (int i = 0; i < size; i++) {
				map.put(i, new HashSet<>());
				map.get(i).add(i);
			}
		}

		@Override
		protected void unionTo(int source, int dest) {
			super.unionTo(source, dest);
			map.get(dest).addAll(map.get(source));
		}

		@Override
		public Set<Integer> getSet(int id) {
			return map.get(root(id));
		}
	}

	/**
	 * 配列によるUnionFindの実装
	 * getSetメソッドはO(NlogN)なのでTLEに注意
	 */
	class ArrayUnionFind implements UnionFind {
		int[] parent;
		int[] rank;
		int size;
		public ArrayUnionFind(int size) {
			parent = new int[size];
			for (int i = 0; i < size; i++) {
				parent[i] = i;
			}
			rank = new int[size];
			this.size = size;
		}

		@Override
		public void union(int A, int B) {
			int rootA = root(A);
			int rootB = root(B);
			if (rootA != rootB) {
				if (rank[rootA] < rank[rootB]) {
					unionTo(rootA, rootB);
				} else {
					unionTo(rootB, rootA);
					if (rank[rootA] == rank[rootB]) {
						rank[rootA]++;
					}
				}
			}
		}

		protected void unionTo(int source, int dest) {
			parent[source] = dest;
		}

		@Override
		public boolean judge(int A, int B) {
			return root(A) == root(B);
		}

		@Override
		public Set<Integer> getSet(int id) {
			Set<Integer> set = new HashSet<>();
			IntStream.range(0, size).filter(i -> judge(i, id)).forEach(set::add);
			return set;
		}

		protected int root(int id) {
			if (parent[id] == id) {
				return id;
			}
			parent[id] = root(parent[id]);
			return parent[id];
		}
	}

	/**
	 * 素数のユーティリティ
	 */
	class PrimeNumberUtils {
		boolean[] isPrimeArray;
		List<Integer> primes;

		/**
		 * 素数判定の上限となる値を指定してユーティリティを初期化
		 * @param limit 素数判定の上限(この値以上が素数であるか判定しない)
		 */
		public PrimeNumberUtils(int limit) {
			if (limit > 10000000) {
				System.err.println("上限の値が高すぎるため素数ユーティリティの初期化でTLEする可能性が大変高いです");
			}
			primes = new ArrayList<>();
			isPrimeArray = new boolean[limit];
			if (limit > 2) {
				primes.add(2);
				isPrimeArray[2] = true;
			}

			for (int i = 3; i < limit; i += 2) {
				if (isPrime(i, primes)) {
					primes.add(i);
					isPrimeArray[i] = true;
				}
			}
		}

		public List<Integer> getPrimeNumberList() {
			return primes;
		}

		public boolean isPrime(int n) {
			return isPrimeArray[n];
		}

		private boolean isPrime(int n, List<Integer> primes) {
			for (int prime : primes) {
				if (n % prime == 0) {
					return false;
				}
				if (prime > Math.sqrt(n)) {
					break;
				}
			}
			return true;
		}
	}

	interface BitSet {
		void set(int index, boolean bit);
		boolean get(int index);
		void shiftRight(int num);
		void shiftLeft(int num);
		void or(BitSet bitset);
		void and(BitSet bitset);
	}

	/**
	 * Longの配列によるBitSetの実装
	 * get/setはO(1)
	 * shift/or/andはO(size / 64)
	 */
	class LongBit implements BitSet {
		long[] bitArray;

		public LongBit(int size) {
			bitArray = new long[((size + 63) / 64)];
		}

		@Override
		public void set(int index, boolean bit) {
			int segment = index / 64;
			int inIndex = index % 64;
			if (bit) {
				bitArray[segment] |= 1L << inIndex;
			} else {
				bitArray[segment] &= ~(1L << inIndex);
			}
		}

		@Override
		public boolean get(int index) {
			int segment = index / 64;
			int inIndex = index % 64;
			return (bitArray[segment] & (1L << inIndex)) != 0L;
		}

		@Override
		public void shiftRight(int num) {
			int shiftSeg = num / 64;
			int shiftInI = num % 64;
			for (int segment = 0; segment < bitArray.length; segment++) {
				int sourceSeg = segment + shiftSeg;
				if (sourceSeg < bitArray.length) {
					bitArray[segment] = bitArray[sourceSeg] >>> shiftInI;
					if (shiftInI > 0 && sourceSeg + 1 < bitArray.length) {
						bitArray[segment] |= bitArray[sourceSeg + 1] << (64 - shiftInI);
					}
				} else {
					bitArray[segment] = 0L;
				}
			}
		}

		@Override
		public void shiftLeft(int num) {
			int shiftSeg = num / 64;
			int shiftInI = num % 64;
			for (int segment = bitArray.length - 1; segment >= 0; segment--) {
				int sourceSeg = segment - shiftSeg;
				if (sourceSeg >= 0) {
					bitArray[segment] = bitArray[sourceSeg] << shiftInI;
					if (shiftInI > 0 && sourceSeg > 0) {
						bitArray[segment] |= bitArray[sourceSeg - 1] >>> (64 - shiftInI);
					}
				} else {
					bitArray[segment] = 0L;
				}
			}
		}

		public long getLong(int segment) {
			return bitArray[segment];
		}

		@Override
		public void or(BitSet bitset) {
			if (!(bitset instanceof LongBit)) {
				return;
			}
			for (int segment = 0; segment < bitArray.length; segment++) {
				bitArray[segment] |= ((LongBit)bitset).getLong(segment);
			}
		}

		@Override
		public void and(BitSet bitset) {
			if (!(bitset instanceof LongBit)) {
				return;
			}
			for (int segment = 0; segment < bitArray.length; segment++) {
				bitArray[segment] &= ((LongBit)bitset).getLong(segment);
			}
		}
	}

}