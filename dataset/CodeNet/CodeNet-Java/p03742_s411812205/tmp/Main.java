import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(br.readLine());
System.out.println("[INST]9;None;br.readLine();"+br.readLine());
		long x = Long.parseLong(st.nextToken()), y = Long.parseLong(st.nextToken());
System.out.println("[INST]10;x;Long.parseLong(st.nextToken());"+x);
System.out.println("[INST]10;None;st.nextToken();"+st.nextToken());
System.out.println("[INST]10;y;Long.parseLong(st.nextToken());"+y);
System.out.println("[INST]10;None;st.nextToken();"+st.nextToken());
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
System.out.println("[INST]21;None;System.exit(0);"+System.exit(0));
	}
}