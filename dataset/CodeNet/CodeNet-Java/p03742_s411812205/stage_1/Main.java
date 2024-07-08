import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
var newVariable_0 = br.readLine();		StringTokenizer st = new StringTokenizer(newVariable_0);
var newVariable_1 = st.nextToken();var newVariable_2 = st.nextToken();		long x = Long.parseLong(newVariable_2), y = Long.parseLong(newVariable_2);
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