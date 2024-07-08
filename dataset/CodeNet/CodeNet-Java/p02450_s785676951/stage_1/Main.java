import java.util.*;
import java.io.*;

public class Main {

	void solve (FastScanner in, PrintWriter out, Methods ms) {

		int n = in.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
var newVariable_0 = list.add(i);		for (int i=1; i<=n; i++) newVariable_0;
		
var newVariable_1 = list.size();		while (newVariable_1 > 0) {
			
			for (int i=0; i<n; i++) {
				out.print((i==0?"":" ")+list.get(i));
			}
			out.println();
			
			list = nextPermutation(list);
			
		}

	}

	static ArrayList<Integer> nextPermutation (ArrayList<Integer> list) {

		int pivotPos = -1;
		int pivot = 0;

var newVariable_2 = list.size();		for (int i=newVariable_2-2; i>=0; i--) {
var newVariable_3 = list.get(i);var newVariable_4 = list.get(i+1);			if (list.get(i) < newVariable_4) {
				pivotPos = i;
				pivot = list.get(i);
				break;
			}
		}

		if (pivotPos==-1 && pivot==0) {
var newVariable_5 = list.clear();			return list;
		}

var newVariable_6 = list.size();		int L = pivotPos+1, R = newVariable_6-1, minPos = -1;
		int min = Integer.MAX_VALUE;
		for (int i=R; i>=L; i--) {
var newVariable_7 = list.get(i);var newVariable_8 = list.get(i);			if (pivot < newVariable_8 && newVariable_8 < min) {
				min = list.get(i);
				minPos = i;
			}
		}

		Collections.swap(list, pivotPos, minPos);
var newVariable_9 = list.subList(L, R+1);		Collections.sort(newVariable_9);

		return list;

	}



	public static void main(String[] args) {
		Main main = new Main();
		FastScanner in = new FastScanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		Methods ms = new Methods();
		main.solve(in, out, ms);
		in.close();
		out.close();
	}

	static class Methods {

		public void print (Object... ar) {System.out.println(Arrays.deepToString(ar));}

		public void yesno (PrintWriter out, boolean b) {out.println(b?"Yes":"No");}

		public void YESNO (PrintWriter out, boolean b) {out.println(b?"YES":"NO");}

		public int max (int... ar) {Arrays.sort(ar); return ar[ar.length-1];}

		public int min (int... ar) {Arrays.sort(ar); return ar[0];}

		public int manhat (int x1, int y1, int x2, int y2) {
var newVariable_10 = Math.abs(x1-x2);var newVariable_11 = Math.abs(y1-y2);			return Math.abs(x1-x2)+newVariable_11;
		}

		public double euclid (double x1, double y1, double x2, double y2) {
var newVariable_12 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));			return newVariable_12;
		}

		public  boolean isPrime (int n) {
			if (n==2) return true;
			if (n<2 || n%2==0) return false;
			double d = Math.sqrt(n);
			for (int i=3; i<=d; i+=2) if(n%i==0){return false;}
			return true;
		}

	}

	static class FastScanner {

		private InputStream in;
		private byte[] buffer = new byte[1024];
		private  int length = 0, p = 0;

		public FastScanner (InputStream stream) {
			in = stream;
		}

		public boolean hasNextByte () {
			if (p < length) return true;
			else {
				p = 0;
				try {length = in.read(buffer);}
				catch (Exception e) {e.printStackTrace();}
				if (length <= 0) return false;
			}
			return true;
		}

		public int readByte () {
			if (hasNextByte() == true) return buffer[p++];
			return -1;
		}

		public boolean isPrintable (int n) {return 33<=n&&n<=126;}

		public void skip () {
			while (hasNextByte() && !isPrintable(buffer[p])) p++;
		}

		public boolean hasNext () {skip(); return hasNextByte();}

		public String next () {
			if (!hasNext()) throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int t = readByte();
			while (isPrintable(t)) {
var newVariable_13 = sb.appendCodePoint(t);				t = readByte();
			}
var newVariable_14 = sb.toString();			return newVariable_14;
		}

		public String[] nextArray (int n) {
			String[] ar = new String[n];
			for (int i=0; i<n; i++) ar[i] = next();
			return ar;
		}

		public int nextInt () {return Math.toIntExact(nextLong());}

		public int[] nextIntArray (int n) {
			int[] ar = new int[n];
			for (int i=0; i<n; i++) ar[i] = nextInt();
			return ar;
		}

		public long nextLong () {
			if (!hasNext()) throw new NoSuchElementException();
			boolean minus = false;
			int temp = readByte();
			if (temp == '-') {
				minus = true;
				temp = readByte();
			}
			if (temp<'0' || '9'<temp) throw new NumberFormatException();
			long n = 0;
			while (isPrintable(temp)) {
				if ('0'<=temp && temp<='9') {
					n *= 10;
					n += temp - '0';
				}
				else throw new NumberFormatException();
				temp = readByte();
			}
			return minus? -n : n;
		}

		public long[] nextLongArray (int n) {
			long[] ar = new long[n];
			for (int i=0; i<n; i++) ar[i] = nextLong();
			return ar;
		}

		public double nextDouble () {
			return Double.parseDouble(next());
		}

		public double[] nextDoubleArray (int n) {
			double[] ar = new double[n];
			for (int i=0; i<n; i++) ar[i] = nextDouble();
			return ar;
		}

		public void close () {
			try {in.close();}
			catch(Exception e){}
		}

	}

}
