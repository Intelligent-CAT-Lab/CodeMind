import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		InputStream input;
		OutputStream output;
		try {
			input = new FileInputStream("input.txt");
			output = new FileOutputStream("output.txt");
		} catch (FileNotFoundException e) {
			input = System.in;
			output = System.out;
		}
		Kattio io = new Kattio(input, output);
		(new Solve(io)).main();
		io.close();

		if (input instanceof FileInputStream)
			try {
				input.close();
			} catch (IOException e) {

			}
		if (output instanceof FileOutputStream)
			try {
				output.close();
			} catch (IOException e) {

			}
	}
}

class Solve {
	
	static final long mod = (long) 1e9+7;
	
	Kattio io;
	
	int n,k;
	int[] a,b;
	int[] f;
	Long[][] dp;
	
	Long[] memoWaysToPair;
	
	Solve(Kattio io) {
		this.io = io;
	}

	Long waysToPair(int x)
	{
		if (!memoWaysToPair[x].equals(new Long("-1"))) 
			return memoWaysToPair[x];
		
		if (x%2==1) 
			memoWaysToPair[x]=new Long(0);
		else
		if (x==0)
			memoWaysToPair[x]=new Long(1);
		else
			memoWaysToPair[x]=waysToPair(x-2)*(x-1)%mod;
		
		//io.println(x+" "+memoWaysToPair[x]);
		return memoWaysToPair[x];
	}
	
	int paired(int x,int y)
	{
		//io.println(x+" "+y+" "+((f[y]-f[x-1])>(y-x+1)));
		return f[y]-f[x-1];
	}
	
	boolean inside(int a,int x,int y)
	{
		return (x<=a && a<=y);
	}
	
	Long caldp(int x,int y)
	{
		if (!dp[x][y].equals(new Long("-1"))) return dp[x][y];
		
		int notPairedinXY = (y-x+1)-paired(x,y);
		
		//io.println(notPairedOutSideXY<0);
		
		for (int i=1; i<=k; i++)
		{
			boolean p1 = inside(a[i],x,y);
			boolean p2 = inside(b[i],x,y);
			if (p1!=p2)
			{
				dp[x][y]=new Long(0);
				return dp[x][y];
			}
		}
		
		dp[x][y]=waysToPair(notPairedinXY);
		
		//io.println(x+" "+y+" "+dp[x][y]);
		
		for (int z=x+1; z<y; z++)
		{
			int notPairedinZY = (y-(z+1)+1)-paired(z+1,y);
			dp[x][y]=(dp[x][y]-caldp(x,z)*waysToPair(notPairedinZY)+mod*mod)%mod;
		}
		
		//io.println(x+" "+y+" "+dp[x][y]);
		
		return dp[x][y];
		
	}
	void main() {
		//io.println(mod);
		n=io.getInt();
		n*=2;
		k=io.getInt();
		a = new int[k+1];
		b = new int[k+1];
		f = new int[n+1];
		
		Arrays.fill(f, 0);
		
		for (int i=1; i<=k; i++)
		{
			a[i] = io.getInt();
			b[i] = io.getInt();
			f[a[i]]=1;
			f[b[i]]=1;
		}
		
		for (int i=1; i<=n; i++)
			f[i]+=f[i-1];
		
		dp = new Long[n+1][n+1];
		
		for (int i=0; i<=n; i++)
			Arrays.fill(dp[i], new Long("-1"));
		
		memoWaysToPair = new Long[n+1];
		Arrays.fill(memoWaysToPair, new Long("-1"));
		
		Long res = new Long(0);
		for (int x=1; x<=n; x++)
			for (int y=x; y<=n; y++)
			{
				int notPairedOutSideXY = (n-(y-x+1))-(f[n]-paired(x,y));
				res=(res+caldp(x,y)*waysToPair(notPairedOutSideXY)%mod)%mod;
			}
		
		io.print(res);
	}
}

class Kattio extends PrintWriter {
	public Kattio(InputStream i) {
		super(new BufferedOutputStream(System.out));
		r = new BufferedReader(new InputStreamReader(i));
	}

	public Kattio(InputStream i, OutputStream o) {
		super(new BufferedOutputStream(o));
		r = new BufferedReader(new InputStreamReader(i));
	}

	public boolean hasMoreTokens() {
		return peekToken() != null;
	}

	public int getInt() {
		return Integer.parseInt(nextToken());
	}

	public double getDouble() {
		return Double.parseDouble(nextToken());
	}

	public long getLong() {
		return Long.parseLong(nextToken());
	}

	public String getWord() {
		return nextToken();
	}

	private BufferedReader r;
	private String line;
	private StringTokenizer st;
	private String token;

	private String peekToken() {
		if (token == null)
			try {
				while (st == null || !st.hasMoreTokens()) {
					line = r.readLine();
					if (line == null)
						return null;
					st = new StringTokenizer(line);
				}
				token = st.nextToken();
			} catch (IOException e) {
			}
		return token;
	}

	private String nextToken() {
		String ans = peekToken();
		token = null;
		return ans;
	}
}