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
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class Main {
	static ContestScanner in;static Writer out;public static void main(String[] args)
	{try{in=new ContestScanner();out=new Writer();Main solve=new Main();solve.solve();
	in.close();out.flush();out.close();}catch(IOException e){e.printStackTrace();}}
	static void dump(int[]a){for(int i=0;i<a.length;i++)out.print(a[i]+" ");out.println();}
	static void dump(int[]a,int n){for(int i=0;i<a.length;i++)out.printf("%"+n+"d ",a[i]);out.println();}
	static void dump(long[]a){for(int i=0;i<a.length;i++)out.print(a[i]+" ");out.println();}
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
		n = in.nextInt();
		List<int[]> pList = new ArrayList<>();
		int[][] lt = new int[n][2];
		lt[0] = new int[]{0, 0};
		for(int i=0; i<4; i++){
			pList.add(new int[]{i&1, -(i>>1)});
		}
		for(int i=1; i<n; i++){
			int id = in.nextInt();
			int d = in.nextInt();
			int[] p = lt[id];
			for(int j=0; j<4; j++){
				int[] np = new int[]{(j&1)+dx[d]+p[0], -(j>>1)+dy[d]+p[1]};
				pList.add(np);
				if(j==0) lt[i] = np;
//				System.out.println(Arrays.toString(pList.get(pList.size()-1)));
			}
		}
		List<int[]> hull = convexHull(pList);
		Pos[] pos = new Pos[hull.size()];
		for(int i=0; i<hull.size(); i++){
			int[] p = hull.get(i);
			pos[i] = new Pos(p[0], p[1]);
//			System.out.println(pos[i]);
		}
		final int sz = hull.size();
		Line l = new Line(pos[0], pos[1]);
		Line nl = new Line(pos[1], l.getNVec().add(pos[1]));
		double len = l.len();
		double nlen = nl.len();
		int i1=0, i2=0, i3=0;
		double d1=Integer.MIN_VALUE, d2=0, d3=Integer.MAX_VALUE;
		for(int i=0; i<sz; i++){
			final double td1 = nl.ccw(pos[i])/nlen;
			if(td1>d1){
				d1 = td1;
				i1 = i;
			}
			if(td1<d3){
				d3 = td1;
				i3 = i;
			}
			final double td2 = Math.abs(l.ccw(pos[i]))/len;
			if(td2>d2){
				d2 = td2;
				i2 = i;
			}
		}
		double ans = d2*Math.abs(d1-d3);
		for(int i=1; i<sz-1; i++){
			l.set(pos[i], pos[i+1]);
			nl.set(pos[i+1], l.getNVec().add(pos[i+1]));
			len = l.len();
			nlen = nl.len();
			d1 = nl.ccw(pos[i1])/nlen;
			d2 = Math.abs(l.ccw(pos[i2]))/len;
			d3 = nl.ccw(pos[i3])/nlen;
			
			double nd1 = nl.ccw(pos[(i1+1)%sz])/nlen;
			double nd2 = Math.abs(l.ccw(pos[(i2+1)%sz]))/len;
			double nd3 = nl.ccw(pos[(i3+1)%sz])/nlen;
			
			while(nd1>=d1-1e-10){
				d1 = nd1;
				i1 = (i1+1)%sz;
				nd1 = nl.ccw(pos[(i1+1)%sz])/nlen;
			}
			while(nd2>=d2-1e-10){
				d2 = nd2;
				i2 = (i2+1)%sz;
				nd2 = Math.abs(l.ccw(pos[(i2+1)%sz]))/len;
			}
			while(nd3-1e-10<=d3){
				d3 = nd3;
				i3 = (i3+1)%sz;
				nd3 = nl.ccw(pos[(i3+1)%sz])/nlen;
			}
//			System.out.printf("%d, %d, %d, %d, %f\n", i, i1, i2, i3, d2*Math.abs(d1-d3));
			ans = Math.min(ans, d2*Math.abs(d1-d3));
		}
		System.out.println(ans);
	}
	
	int n;
	final int[] dx = {-1, 0, 1, 0};
	final int[] dy = {0, -1, 0, 1};
	public static List<int[]> convexHull(List<int[]> list){
		int k = 0;
		Collections.sort(list, new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[0] != o2[0]) return o1[0]-o2[0];
				return o1[1]-o2[1];
			}
		});
		int n = list.size();
		int[] pre = list.get(0);
		List<int[]> nl = new ArrayList<>(n);
		nl.add(pre);
		for(int i=1; i<n; i++){
			int[] p = list.get(i);
			if(!(p[0]==pre[0] && p[1]==pre[1])) nl.add(p);
			pre = p;
		}
		list = nl;
		n = list.size();
		int[][] qs = new int[n*2][2];
		for(int i=0; i<n; i++){
			while(k > 1 && cross(qs[k-2], qs[k-1], qs[k-1], list.get(i)) < 0) k--;
			qs[k++] = list.get(i);
		}
		
		for(int i=n-2, t=k; i>=0; i--){
			while(k > t && cross(qs[k-2], qs[k-1], qs[k-1], list.get(i)) < 0) k--;
			qs[k++] = list.get(i);
		}
		
		List<int[]> res = new ArrayList<int[]>();
		for(int i=0; i<k; i++){
			res.add(qs[i]);
		}
		return res;
	}
	public static int cross(int[] p11, int[] p12, int[] p21, int[] p22){
		return (p12[0]-p11[0])*(p22[1]-p21[1]) - (p22[0]-p21[0])*(p12[1]-p11[1]);
	}
}

class Pos implements Comparable<Pos>{
	static final double EPS = 1e-10;
	double x, y;
	public Pos(double x, double y){
		this.x = x;
		this.y = y;
	}
	public Pos add(Pos v){
		x += v.x;
		y += v.y;
		return this;
	}
	public double dist2(Pos p){
		return (x-p.x)*(x-p.x) + (y-p.y)*(y-p.y);
	}
	@Override
	public int compareTo(Pos o) {
		if(Math.abs(x-o.x) >= EPS) return Double.compare(x, o.x);
		if(Math.abs(y-o.y) >= EPS) return Double.compare(y, o.y);
		return 0;
	}
	@Override
	public String toString() {
		return String.format("(%f,%f)", x, y);
	}
}

class Line{
	static final double EPS = 1e-10;
	Pos p1, p2;
	Pos vec;
	public Line(Pos p1, Pos p2){
		this.p1 = p1;
		this.p2 = p2;
		vec = new Pos(p2.x-p1.x, p2.y-p1.y);
	}
	public double len(){
		return Math.sqrt(p1.dist2(p2));
	}
	public Line(double x1, double y1, double x2, double y2){
		p1 = new Pos(x1, y1);
		p2 = new Pos(x2, y2);
		vec = new Pos(x2-x1, y2-y1);
	}
	void set(Pos p1, Pos p2){
		this.p1 = p1;
		this.p2 = p2;
		vec.x = p2.x-p1.x;
		vec.y = p2.y-p1.y;
	}
	Pos getNVec(){
		return new Pos(-vec.y, vec.x);
	}
	Pos crossPos(Line l){
		if(!cross(l)) return null;
		double d1 = Math.abs(cross(l.vec.x, l.vec.y, p1.x-l.p1.x, p1.y-l.p1.y));
		double d2 = Math.abs(cross(l.vec.x, l.vec.y, p2.x-l.p1.x, p2.y-l.p1.y));
		double t = d1/(d1+d2);
		return new Pos(p1.x+(p2.x-p1.x)*t, p1.y+(p2.y-p1.y)*t);
	}
	double crossPosT(Line l){
		if(!cross(p1, p2, l.p1, l.p2)) return -1;
		double d1 = Math.abs(cross(l.vec.x, l.vec.y, p1.x-l.p1.x, p1.y-l.p1.y));
		double d2 = Math.abs(cross(l.vec.x, l.vec.y, p2.x-l.p1.x, p2.y-l.p1.y));
		return d1/(d1+d2);
	}
	boolean link(Line l){
		return p1.compareTo(l.p1) == 0
				|| p1.compareTo(l.p2) == 0
				|| p2.compareTo(l.p1) == 0
				|| p2.compareTo(l.p2) == 0;
	}
	// ?????¨???????????¨?????????(?????????????????????????????????????????¨????????????????????????????????¨?????£?????????)
	boolean cross(Line l){
		return cross(p1, p2, l.p1, l.p2);
	}
	static boolean cross(Pos p1, Pos p2, Pos p3, Pos p4){
		return ccw(p1, p2, p3) * ccw(p1, p2, p4) < 0 && ccw(p3, p4, p1) * ccw(p3, p4, p2) < 0;
	}
	static double cross(Pos a, Pos b){
		return a.x*b.y - b.x*a.y;
	}
	public static double cross(double x1, double y1, double x2, double y2){
		return x1*y2 - x2*y1;
	}
	static double ccw(Pos a, Pos b, Pos c){
		double dx1 = b.x - a.x;
		double dy1 = b.y - a.y;
		double dx2 = c.x - a.x;
		double dy2 = c.y - a.y;
		return dx1*dy2 - dx2*dy1;
	}
	double ccw(Pos p){
		double dx1 = p2.x - p1.x;
		double dy1 = p2.y - p1.y;
		double dx2 = p.x - p1.x;
		double dy2 = p.y - p1.y;
		return dx1*dy2 - dx2*dy1;
	}
	public static double dist(Pos a, Pos b, Pos c){
        // a->b ??????c???????????¢
        if(dot(b.x-a.x, b.y-a.y, c.x-a.x, c.y-a.y) < EPS)
            return Math.sqrt(a.dist2(c));
        if(dot(a.x-b.x, a.y-b.y, c.x-b.x, c.y-b.y) < EPS)
            return Math.sqrt(b.dist2(c));
        return Math.abs(ccw(a, b, c))/Math.sqrt(a.dist2(b));
    }
	public double dist(Pos p){
        // this ??????p???????????¢
        if(dot(p2.x-p1.x, p2.y-p1.y, p.x-p1.x, p.y-p1.y) < EPS)
            return Math.sqrt(p1.dist2(p));
        if(dot(p1.x-p2.x, p1.y-p2.y, p.x-p2.x, p.y-p2.y) < EPS)
            return Math.sqrt(p2.dist2(p));
        return Math.abs(ccw(p1, p2, p))/Math.sqrt(p1.dist2(p2));
	}
	public double dist(Line l){
		if(cross(l)) return 0;
		double res1 = Math.min(dist(p1, p2, l.p1), dist(p1, p2, l.p2));
		double res2 = Math.min(dist(l.p1, l.p2, p1), dist(l.p1, l.p2, p2));
		return Math.min(res1, res2);
	}
	public static double dot(double x, double y, double x1, double y2){
		return x*x1 + y*y2;
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