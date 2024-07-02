import java.io.*;
import java.util.*;
public class Main
{
	
	private void solve()throws IOException
	{
		String s=nextLine();
		if(s.equals("AAA") || s.equals("BBB"))
System.out.println("[INST]8;None;s.equals('AAA');"+s.equals("AAA"));
System.out.println("[INST]8;None;s.equals('BBB');"+s.equals("BBB"));
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
		while(st==null || !st.hasMoreTokens())
System.out.println("[INST]35;None;st.hasMoreTokens();"+st.hasMoreTokens());
		st=new StringTokenizer(br.readLine());
System.out.println("[INST]36;None;br.readLine();"+br.readLine());
		return st.nextToken();
	}
	String nextLine()throws IOException{
		return br.readLine();
System.out.println("[INST]40;None;br.readLine();"+br.readLine());
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