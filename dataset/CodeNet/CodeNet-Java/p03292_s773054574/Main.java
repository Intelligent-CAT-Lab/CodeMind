import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

import static java.util.Comparator.*;

public class Main {

    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);

        Solver solver = new Solver(in, out);
        solver.solve();

        out.close();
    }

    // ======================================================================

    static class Solver {
    	MyInput in;
    	PrintWriter out;
        public Solver(MyInput in, PrintWriter out) {
        	this.in = in;
        	this.out = out;
        }
        
        // -----------------------------------------
        //
        int D;
        long G;
        int[] P, C;
        int calc(long sum) {
        	if(sum >= G) {
        		return 0;
        	}
        	int ans = 9999;
        	for (int i = 0; i < D; i++) {
        		if(P[i] > 0) {
        			P[i]--;
        			if(P[i] == 0) 
            			ans = Math.min(ans, calc(sum + 100 * (i+1) + C[i]) + 1);
        			else
        				ans = Math.min(ans, calc(sum + 100 * (i+1)) + 1);
        			P[i]++;
        		}
			}
        	return ans;
        }
		public void solve() {
			int[] A = ndi(3);
			Arrays.sort(A);
			prn(A[2] - A[0]);
		}
        // -----------------------------------------
        void prn(String s) {
        	out.println(s);
        }
        void prn(int i) {
        	out.println(i);
        }
        void prn(long i) {
        	out.println(i);
        }
        void prr(String s) {
        	out.print(s);
        }
        int ni() {
        	return in.nextInt();
        }
        long nl() {
        	return in.nextLong();
        }
        double nd() {
        	return in.nextDouble();
        }
        String ns() {
        	return in.nextString();
        }
        int[] ndi(int n) {
        	int[] ans = new int[n];
        	for(int i=0; i < n; i++) {
        		ans[i] = ni();
        	}
        	return ans;
        }
        long[] ndl(int n) {
        	long[] ans = new long[n];
        	for(int i=0; i < n; i++) {
        		ans[i] = nl();
        	}
        	return ans;
        }
        double[] ndd(int n) {
        	double[] ans = new double[n];
        	for(int i=0; i < n; i++) {
        		ans[i] = nd();
        	}
        	return ans;
        }
        String[] nds(int n) {
        	String[] ans = new String[n];
        	for(int i=0; i < n; i++) {
        		ans[i] = ns();
        	}
        	return ans;
        }
        int[][] nddi(int n, int m) {
        	int[][] ans = new int[n][m];
        	for(int i=0; i < n; i++) {
            	for(int j=0; j < m; j++) {
            		ans[i][j] = ni();
            	}
        	}
        	return ans;
        }
        long[][] nddl(int n, int m) {
        	long[][] ans = new long[n][m];
        	for(int i=0; i < n; i++) {
            	for(int j=0; j < m; j++) {
            		ans[i][j] = nl();
            	}
        	}
        	return ans;
        }
    }

    static class PP{
    	public int key, val;
    	public PP(int key, int val) {
    		this.key = key;
    		this.val = val;
    	}
		public int getKey() {
			return key;
		}
		public void setKey(int key) {
			this.key = key;
		}
		public int getVal() {
			return val;
		}
		public void setVal(int val) {
			this.val = val;
		}
    }
    static class PPL {
    	public long key, val;
    	public PPL(long key, long val) {
    		this.key = key;
    		this.val = val;
    	}
		public long getKey() {
			return key;
		}
		public void setKey(long key) {
			this.key = key;
		}
		public long getVal() {
			return val;
		}
		public void setVal(long val) {
			this.val = val;
		}
    }
    static class PPDL {
    	public long key;
    	public long[] val;
    	public PPDL(long key, long[] val) {
    		this.key = key;
    		this.val = val;
    	}
		public long getKey() {
			return key;
		}
		public void setKey(long key) {
			this.key = key;
		}
		public long[] getVal() {
			return val;
		}
		public void setVal(long[] val) {
			this.val = val;
		}
		public void dump(PrintWriter out) {
			out.print("key = " + key + "  val ");
			for(int i=0; i < val.length; i++) {
				out.print("[" + val[i] + "] ");
			}
			out.println("");
		}
    }
    // HashMap のキーに使う
    static final class PPKEY{
    	private final int key, val;
    	public PPKEY(int key, int val) {
    		this.key = key;
    		this.val = val;
    	}
		public int getKey() {
			return key;
		}
		public int getVal() {
			return val;
		}
	    @Override
	    public boolean equals(Object obj) {
	        if (obj instanceof PPKEY) {
	        	PPKEY dest = (PPKEY) obj;
	            return this.key == dest.key && this.val == dest.val;
	        } else {
	            return false;
	        }
	    }
	    @Override
	    public int hashCode() {
	        return Objects.hash(key, val);
	    }
    }
    // HashMap のキーに使う
    static final class PPLKEY{
    	private final long key, val;
    	public PPLKEY(long key, long val) {
    		this.key = key;
    		this.val = val;
    	}
		public long getKey() {
			return key;
		}
		public long getVal() {
			return val;
		}
	    @Override
	    public boolean equals(Object obj) {
	        if (obj instanceof PPKEY) {
	        	PPKEY dest = (PPKEY) obj;
	            return this.key == dest.key && this.val == dest.val;
	        } else {
	            return false;
	        }
	    }
	    @Override
	    public int hashCode() {
	        return Objects.hash(key, val);
	    }
    }
    // グラフのリンクリスト
    static class Graph {
        private Map<Integer, List<Integer>> data = new HashMap<Integer, List<Integer>>();
        void add(int key, int value) {
        	List<Integer> list = data.get(key);
        	if(list == null) {
        		list = new ArrayList<Integer>();
        		data.put(key, list);
        	}
        	list.add(value);
        }
        List<Integer> get(int key) {
        	return data.get(key);
        }
        Set<Integer> keySet() {
        	return data.keySet();
        }
        boolean contains(int key, int value) {
        	List<Integer> list = data.get(key);
        	if(list == null)	return false;
        	else 				return list.contains(value);
        }
        void dump(PrintWriter out) {
        	for(int key : data.keySet()) {
        		out.print(key + " : ");
        		for(int val : data.get(key)) {
        			out.print(val + " ");
        		}
        		out.println("");
        	}
        }
    }
    // 重さを持ったグラフのリンクリスト
    static class GraphWith {
        private Map<Integer, List<PP>> data = new HashMap<Integer, List<PP>>();
        void add(int key, PP p) {
        	List<PP> list = data.get(key);
        	if(list == null) {
        		list = new ArrayList<PP>();
        		data.put(key, list);
        	}
        	list.add(p);
        }
        List<PP> get(int key) {
        	return data.get(key);
        }
        // グラフの存在チェック（重さは関係しない）
        boolean contains(int key, int value) {
        	List<PP> list = data.get(key);
        	if(list == null)	return false;
        	boolean ans = false;
        	for(PP p : list) {
        		if(p.getKey() == value) {
        			ans = true;
        			break;
        		}
        	}
        	return ans;
        }
    }
    // グラフのリンクリスト(Long)
    static class GraphLong {
        private Map<Long, List<Long>> G = new HashMap<Long, List<Long>>();
        void add(long key, long value) {
        	List<Long> list = G.get(key);
        	if(list == null) {
        		list = new ArrayList<Long>();
        		G.put(key, list);
        	}
        	list.add(value);
        }
        List<Long> get(long key) {
        	return G.get(key);
        }
    }
    // 重さを持ったグラフのリンクリスト(Long)
    static class GraphLongWith {
        private Map<Long, List<PPL>> G = new HashMap<Long, List<PPL>>();
        void add(long key, PPL p) {
        	List<PPL> list = G.get(key);
        	if(list == null) {
        		list = new ArrayList<PPL>();
        		G.put(key, list);
        	}
        	list.add(p);
        }
        List<PPL> get(long key) {
        	return G.get(key);
        }
    }

    // ======================================================================
    static class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {
        /** serialVersionUID. */
        private static final long serialVersionUID = 6411527075103472113L;

        public Pair(final K key, final V value) {
            super(key, value);
        }
     }
    static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];

        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }

        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }

        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new MyInput.EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }

        public int nextInt() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            int ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public long nextLong() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            long ret = 0L;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public double nextDouble() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            double ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            int cnt = 0;
            for (; i < len; i++) {
            	if(str[i] == '.') {
            		cnt = 10;
            		continue;
            	}
            	if(cnt == 0) {
            		ret = ret * 10 + str[i] - '0';
            	} else {
            		ret = ret + ((double)(str[i] - '0') / cnt);
            		cnt *= 10;
            	}
            }
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

       public String nextString() {
        	String ret = new String(nextDChar()).trim();
            return ret;
        }

        public char[] nextDChar() {
            int len = 0;
            len = reads(len, isSpace);
            char[] ret = new char[len + 1];
            for (int i=0; i < len; i++)		ret[i] = str[i];
            ret[len] = 0x00;
            return ret;
        }

        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }

        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (MyInput.EndOfFileRuntimeException e) {
            }
            return len;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }
    }
}
