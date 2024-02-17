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

class PrimeGenerator
{
	static final int maxx = (int) 1e7;
	
	int current;
	boolean[] sieve;
	
	PrimeGenerator()
	{
		sieve = new boolean[maxx+1];
		
		current = 0;
		Arrays.fill(sieve, true);
		sieve[0]=false;
		sieve[1]=false;
		for (int i=2; i*i<=maxx; i++)
		if (sieve[i])
		{
			for (int j=i*2; j<=maxx; j+=i)
				sieve[j]=false;
		}
	}
	
	int nextPrime()
	{
		current++;
		
		while (!sieve[current]) current++;
		
		return current;
	}
	
}
class Solve {
	static final int[] mx = new int[] {0,0,1,-1};
	static final int[] my = new int[] {1,-1,0,0};
	
	Kattio io;

	int n;
	long[][] a;
	PrimeGenerator PG;
	Solve(Kattio io) {
		this.io = io;
	}

	long gcd(long x,long y)
	{
		if (x%y==0) return y;
		else return gcd(y,x%y);
	}
	
	long lcm(long x,long y)
	{
		return x/gcd(x,y)*y;
	}
	
	void main() {
		n = io.getInt();
		PG = new PrimeGenerator();
		
		a = new long[n+2][n+2];
		
		int[] d1 = new int[2*n+3];
		int[] d2 = new int[2*n+3];
		
		for (int i=1; i<2*n+2; i++)
		if (i%2==0)
			d1[i] = PG.nextPrime();
		
		for (int i=1; i<2*n+2; i++)
			d2[i] = PG.nextPrime();
		
		//io.println(PG.nextPrime());
		
		for (int i=0; i<=n+1; i++)
			for (int j=0; j<=n+1; j++)
				a[i][j]=1;
		
		for (int i=0; i<=n+1; i++)
			for (int j=0; j<=n+1; j++)
				if ((i+j)%2==0)
				{
					a[i][j]=d1[i+j]*d2[i-j+n+1];
					//io.println(d1[i+j]+" "+d2[i-j+n+1]+" "+a[i][j]);
				}
		
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=n; j++)
				if ((i+j)%2==1)
				{
					a[i][j]=1;
					for (int x=0; x<4; x++)
						a[i][j]=lcm(a[i][j],a[i+mx[x]][j+my[x]]);
					a[i][j]++;
					if (a[i][j]>(long) 1e15)
					{
						io.println(i+" "+j);
						throw new RuntimeException();
					}
				}
		}
		
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=n; j++)
				io.print(a[i][j]+" ");
			io.println();
		}
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