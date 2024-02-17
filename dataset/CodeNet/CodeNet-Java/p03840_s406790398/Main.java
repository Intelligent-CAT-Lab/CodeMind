import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Main implements Runnable{
	static ContestScanner in;static Writer out;
	public static void main(String[] args) {
		new Thread(null, new Main(), "", 16 * 1024 * 1024).start();
	}
	public void run() {
		try {
			in = new ContestScanner();
			out = new Writer();
			Main solve = new Main();
			solve.solve();
			in.close();
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	static void dump(int[]a){StringBuilder s=new StringBuilder();for(int i=0;i<a.length;i++)
	s.append(a[i]).append(" ");out.println(s.toString().trim());}
	static void dump(int[]a,int n){for(int i=0;i<a.length;i++)out.printf("%"+n+"d ",a[i]);out.println();}
	static void dump(long[]a){StringBuilder s=new StringBuilder();for(int i=0;i<a.length;i++)
	s.append(a[i]).append(" ");out.println(s.toString().trim());}
	static void dump(char[]a){for(int i=0;i<a.length;i++)out.print(a[i]);out.println();}
	static long pow(long a,int n){long r=1;while(n>0){if((n&1)==1)r*=a;a*=a;n>>=1;}return r;}
	static String itob(int a,int l){return String.format("%"+l+"s",Integer.toBinaryString(a)).replace(' ','0');}
	static void sort(int[]a){m_sort(a,0,a.length,new int[a.length]);}
	static void sort(int[]a,int l){m_sort(a,0,l,new int[l]);}
	static void sort(int[]a,int l,int[]buf){m_sort(a,0,l,buf);}
	static void sort(int[]a,int s,int l,int[]buf){m_sort(a,s,l,buf);}
	static void m_sort(int[]a,int s,int sz,int[]b)
	{if(sz<7){for(int i=s;i<s+sz;i++)for(int j=i;j>s&&a[j-1]>a[j];j--)swap(a, j, j-1);return;}
	m_sort(a,s,sz/2,b);m_sort(a,s+sz/2,sz-sz/2,b);int idx=s;int l=s,r=s+sz/2;final int le=s+sz/2,re=s+sz;
	while(l<le&&r<re){if(a[l]>a[r])b[idx++]=a[r++];else b[idx++]=a[l++];}
	while(r<re)b[idx++]=a[r++];while(l<le)b[idx++]=a[l++];for(int i=s;i<s+sz;i++)a[i]=b[i];
	} /* qsort(3.5s)<<msort(9.5s)<<<shuffle+qsort(17s)<Arrays.sort(Integer)(20s) */
	static void sort(long[]a){m_sort(a,0,a.length,new long[a.length]);}
	static void sort(long[]a,int l){m_sort(a,0,l,new long[l]);}
	static void sort(long[]a,int l,long[]buf){m_sort(a,0,l,buf);}
	static void sort(long[]a,int s,int l,long[]buf){m_sort(a,s,l,buf);}
	static void m_sort(long[]a,int s,int sz,long[]b)
	{if(sz<7){for(int i=s;i<s+sz;i++)for(int j=i;j>s&&a[j-1]>a[j];j--)swap(a, j, j-1);return;}
	m_sort(a,s,sz/2,b);m_sort(a,s+sz/2,sz-sz/2,b);int idx=s;int l=s,r=s+sz/2;final int le=s+sz/2,re=s+sz;
	while(l<le&&r<re){if(a[l]>a[r])b[idx++]=a[r++];else b[idx++]=a[l++];}
	while(r<re)b[idx++]=a[r++];while(l<le)b[idx++]=a[l++];for(int i=s;i<s+sz;i++)a[i]=b[i];}
	static void swap(long[] a,int i,int j){final long t=a[i];a[i]=a[j];a[j]=t;}
	static void swap(int[] a,int i,int j){final int t=a[i];a[i]=a[j];a[j]=t;}
	static int binarySearchSmallerMax(int[]a,int v)// get maximum index which a[idx]<=v
	{int l=-1,r=a.length-1,s=0;while(l<=r){int m=(l+r)/2;if(a[m]>v)r=m-1;else{l=m+1;s=m;}}return s;}
	static int binarySearchSmallerMax(int[]a,int v,int l,int r)
	{int s=-1;while(l<=r){int m=(l+r)/2;if(a[m]>v)r=m-1;else{l=m+1;s=m;}}return s;}
	@SuppressWarnings("unchecked")
	static List<Integer>[]createGraph(int n)
    {List<Integer>[]g=new List[n];for(int i=0;i<n;i++)g[i]=new ArrayList<>();return g;}
	void solve() throws IOException{
		long[] a = new long[7];
		for(int i=0; i<7; i++){
			a[i] = in.nextLong();
		}
		long ans = a[1]*2;
		int[] t = new int[]{0, 3, 4};
		for(int i: t){
			if(a[i]>4){
				long use = a[i]-4;
				ans += (use/2)*4;
				a[i] -= (use/2)*2;
			}
		}
		int[] sa = new int[3];
		for(int i=0; i<3; i++){
			sa[i] = (int)a[t[i]];
		}
		memo = new int[6][6][6];
		for(int i=0; i<6; i++){
			for(int j=0; j<6; j++){
				for(int k=0; k<6; k++){
					memo[i][j][k] = -1;
				}
			}
		}
		int rest = dfs(sa, 0);
		System.out.println((ans + rest)/2);
	}
	
	int[][][] memo;
	int dfs(int[] a, int sum){
		if(memo[a[0]][a[1]][a[2]]!=-1) return memo[a[0]][a[1]][a[2]];
		int max = sum;
		int min = 10;
		for(int i=0; i<3; i++){
			min = Math.min(min, a[i]);
			if(a[i]>=2){
				a[i] -= 2;
				max = Math.max(max, dfs(a, sum+4));
				a[i] += 2;
			}
		}
		if(min>0){
			for(int i=0; i<3; i++){
				a[i]--;
			}
			max = Math.max(max, dfs(a, sum+6));
			for(int i=0; i<3; i++){
				a[i]++;
			}
		}
		return memo[a[0]][a[1]][a[2]] = max;
	}
}


@SuppressWarnings("serial")
class MultiSet<T> extends HashMap<T, Integer>{
	@Override public Integer get(Object key){return containsKey(key)?super.get(key):0;}
	public void add(T key,int v){put(key,get(key)+v);}
	public void add(T key){put(key,get(key)+1);}
	public void sub(T key){final int v=get(key);if(v==1)remove(key);else put(key,v-1);}
	public MultiSet<T> merge(MultiSet<T> set)
	{MultiSet<T>s,l;if(this.size()<set.size()){s=this;l=set;}else{s=set;l=this;}
	for(Entry<T,Integer>e:s.entrySet())l.add(e.getKey(),e.getValue());return l;}
}
@SuppressWarnings("serial")
class OrderedMultiSet<T> extends TreeMap<T, Integer>{
	@Override public Integer get(Object key){return containsKey(key)?super.get(key):0;}
	public void add(T key,int v){put(key,get(key)+v);}
	public void add(T key){put(key,get(key)+1);}
	public void sub(T key){final int v=get(key);if(v==1)remove(key);else put(key,v-1);}
	public OrderedMultiSet<T> merge(OrderedMultiSet<T> set)
	{OrderedMultiSet<T>s,l;if(this.size()<set.size()){s=this;l=set;}else{s=set;l=this;}
	while(!s.isEmpty()){l.add(s.firstEntry().getKey(),s.pollFirstEntry().getValue());}return l;}
}
class Pair implements Comparable<Pair>{
	int a,b;final int hash;Pair(int a,int b){this.a=a;this.b=b;hash=(a<<16|a>>16)^b;}
	public boolean equals(Object obj){Pair o=(Pair)(obj);return a==o.a&&b==o.b;}
	public int hashCode(){return hash;}
	public int compareTo(Pair o){if(a!=o.a)return a<o.a?-1:1;else if(b!=o.b)return b<o.b?-1:1;return 0;}
}
class Timer{
	long time;public void set(){time=System.currentTimeMillis();}
	public long stop(){return time=System.currentTimeMillis()-time;}
	public void print(){System.out.println("Time: "+(System.currentTimeMillis()-time)+"ms");}
	@Override public String toString(){return"Time: "+time+"ms";}
}
class Writer extends PrintWriter{
	public Writer(String filename)throws IOException
	{super(new BufferedWriter(new FileWriter(filename)));}
	public Writer()throws IOException{super(System.out);}
}
class ContestScanner implements Closeable{
	private BufferedReader in;private int c=-2;
	public ContestScanner()throws IOException 
	{in=new BufferedReader(new InputStreamReader(System.in));}
	public ContestScanner(String filename)throws IOException
	{in=new BufferedReader(new InputStreamReader(new FileInputStream(filename)));}
	public String nextToken()throws IOException {
		StringBuilder sb=new StringBuilder();
		while((c=in.read())!=-1&&Character.isWhitespace(c));
		while(c!=-1&&!Character.isWhitespace(c)){sb.append((char)c);c=in.read();}
		return sb.toString();
	}
	public String readLine()throws IOException{
		StringBuilder sb=new StringBuilder();if(c==-2)c=in.read();
		while(c!=-1&&c!='\n'&&c!='\r'){sb.append((char)c);c=in.read();}
		return sb.toString();
	}
	public long nextLong()throws IOException,NumberFormatException
	{return Long.parseLong(nextToken());}
	public int nextInt()throws NumberFormatException,IOException
	{return(int)nextLong();}
	public double nextDouble()throws NumberFormatException,IOException 
	{return Double.parseDouble(nextToken());}
	public void close() throws IOException {in.close();}
}