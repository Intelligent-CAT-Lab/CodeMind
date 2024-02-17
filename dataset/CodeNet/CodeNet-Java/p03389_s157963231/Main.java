import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main{
	static FastScanner s=new FastScanner(System.in);

	void solve(){
		int[] a={gInt(),gInt(),gInt()};
		Arrays.sort(a);
		int[] m={a[0]%2,a[1]%2,a[2]%2};

		int r=0;
		if(m[0]==m[1]&&m[1]==m[2]){
		}else{
			++r;
			if(m[0]==m[1]){
				a[0]++;
				a[1]++;
			}else if(m[1]==m[2]){
				a[1]++;
				a[2]++;
			}else if(m[2]==m[0]){
				a[2]++;
				a[0]++;
			}
		}
		Arrays.sort(a);
		System.out.println(r+(a[2]*2-a[1]-a[0])/2);
	}

	public static void main(String[] $){
		new Main().solve();
	}

	int gInt(){
		return s.nextInt();
	}
	long gLong(){
		return s.nextLong();
	}
	double gDouble(){
		return Double.parseDouble(s.next());
	}

	SupplyingIterator<Integer> ints(int n){
		return new SupplyingIterator<>(n,this::gInt);
	}
	SupplyingIterator<Long> longs(int n){
		return new SupplyingIterator<>(n,this::gLong);
	}
	SupplyingIterator<Double> doubles(int n){
		return new SupplyingIterator<>(n,this::gDouble);
	}
	SupplyingIterator<String> strs(int n){
		return new SupplyingIterator<>(n,s::next);
	}

	Range rep(int i){
		return Range.rep(i);
	}
	Range rep(int f,int t,int d){
		return Range.rep(f,t,d);
	}
	Range rep(int f,int t){
		return rep(f,t,1);
	}
	Range rrep(int f,int t){
		return rep(t,f,-1);
	}

	IntStream INTS(int n){
		return IntStream.generate(this::gInt).limit(n);
	}
	Stream<String> STRS(int n){
		return Stream.generate(s::next).limit(n);
	}

}

class FastScanner{
	private final BufferedInputStream	in;
	private static final int			bufSize	=1<<16;
	private final byte					buf[]	=new byte[bufSize];
	private int							i		=bufSize,k=bufSize;
	private final StringBuilder			str		=new StringBuilder();

	FastScanner(InputStream in){
		this.in=new BufferedInputStream(in,bufSize);
	}
	int nextInt(){
		return (int)nextLong();
	}
	long nextLong(){
		int c;
		long x=0;
		boolean sign=true;
		while((c=nextChar())<=32)
			;
		if(c=='-'){
			sign=false;
			c=nextChar();
		}
		if(c=='+'){
			c=nextChar();
		}
		while(c>='0'){
			x=x*10+(c-'0');
			c=nextChar();
		}
		return sign?x:-x;
	}
	private int nextChar(){
		if(i==k){
			try{
				k=in.read(buf,i=0,bufSize);
			}catch(IOException e){
				System.exit(-1);
			}
		}
		return i>=k?-1:buf[i++];
	}
	String next(){
		int c;
		str.setLength(0);
		while((c=nextChar())<=32&&c!=-1)
			;
		if(c==-1)
			return null;
		while(c>32){
			str.append((char)c);
			c=nextChar();
		}
		return str.toString();
	}
	String nextLine(){
		int c;
		str.setLength(0);
		while((c=nextChar())<=32&&c!=-1)
			;
		if(c==-1)
			return null;
		while(c!='\n'){
			str.append((char)c);
			c=nextChar();
		}
		return str.toString();
	}

}

class SupplyingIterator<T> implements Iterable<T>,Iterator<T>{
	private int	remain;
	Supplier<T>	supplier;

	SupplyingIterator(int t,Supplier<T> supplier){
		this.remain=t;
		this.supplier=supplier;
	}

	@Override
	public Iterator<T> iterator(){
		return this;
	}

	@Override
	public boolean hasNext(){
		return remain>0;
	}

	@Override
	public T next(){
		--remain;
		return supplier.get();
	}

}

class Range implements Iterable<Integer>,PrimitiveIterator.OfInt{
	public final int	from,to,d;
	private int			cur;

	Range(int from,int to,int d){
		this.from=from;
		this.cur=from-d;
		this.to=to;
		this.d=d;
	}

	Range(int n){
		this(0,n-1,1);
	}

	@Override
	public Iterator<Integer> iterator(){
		return this;
	}

	@Override
	public boolean hasNext(){
		return cur+d==to||(cur!=to&&(cur<to==cur+d<to));
	}

	@Override
	public int nextInt(){
		return cur+=d;
	}

	protected final int CHARACTERISTICS=Spliterator.SIZED|Spliterator.DISTINCT|Spliterator.IMMUTABLE|Spliterator.NONNULL;
	@Override
	public Spliterator.OfInt spliterator(){
		return Spliterators.spliterator(this,(to-from)/d+1,CHARACTERISTICS);
	}

	IntStream stream(){
		return d==1?IntStream.rangeClosed(from,to):java.util.stream.StreamSupport.intStream(this.spliterator(),false);
	}


	static Range rep(int i){
		return new Range(i);
	}
	static Range rep(int f,int t,int d){
		return new Range(f,t,d);
	}
	static Range rep(int f,int t){
		return rep(f,t,1);
	}
	static Range rrep(int f,int t){
		return rep(t,f,-1);
	}


}
