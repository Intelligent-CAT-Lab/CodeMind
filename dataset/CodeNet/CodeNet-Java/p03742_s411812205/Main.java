import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long x = Long.parseLong(st.nextToken()), y = Long.parseLong(st.nextToken());
		int ans = -1;
		if(y >= 0 && y <= x-2)
			ans = 1;
		else if(y >= x-1 && y <= x+1)
			ans = 0;
		else if(y >= x+2)
			ans = 1;
		pw.println(ans == 1 ? "Alice" : "Brown");
		br.close();
		pw.close();
		System.exit(0);
	}
}