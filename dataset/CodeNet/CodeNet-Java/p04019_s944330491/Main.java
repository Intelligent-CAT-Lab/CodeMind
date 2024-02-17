import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		String line = f.readLine();
		boolean[] dir = new boolean[4];
		for(int i = 0; i < line.length(); i++) {
			char now = line.charAt(i);
			if(now == 'N') dir[0] = true;
			if(now == 'S') dir[1] = true;
			if(now == 'E') dir[2] = true;
			if(now == 'W') dir[3] = true;
		}
		if(dir[0] == dir[1] && dir[2] == dir[3]) System.out.println("Yes");
		else System.out.println("No");
	}
}