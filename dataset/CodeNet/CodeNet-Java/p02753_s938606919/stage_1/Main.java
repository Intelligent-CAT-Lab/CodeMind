import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		String s=nextLine();
var newVariable_0 = s.equals("AAA");var newVariable_1 = s.equals("BBB");		if(s.equals("AAA") || newVariable_1)
			out.println("No");
		else
			out.println("Yes");
	}

	 
	///////////////////////////////////////////////////////////

	public void run()throws IOException
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		st=null;
		out=new PrintWriter(System.out);

		solve();

		br.close();
		out.close();
	}
	public static void main(String args[])throws IOException{
		new Main().run();
	}
	BufferedReader br;
	StringTokenizer st;
	PrintWriter out;
	String nextToken()throws IOException{
var newVariable_2 = st.hasMoreTokens();		while(st==null || !newVariable_2)
var newVariable_3 = br.readLine();		st=new StringTokenizer(newVariable_3);
		return st.nextToken();
	}
	String nextLine()throws IOException{
var newVariable_4 = br.readLine();		return newVariable_4;
	}
	int nextInt()throws IOException{
		return Integer.parseInt(nextToken());
	}
	long nextLong()throws IOException{
		return Long.parseLong(nextToken());
	}
	double nextDouble()throws IOException{
		return Double.parseDouble(nextToken());
	}
}