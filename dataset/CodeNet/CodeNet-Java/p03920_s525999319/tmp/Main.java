import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(reader.readLine());
System.out.println("[INST]8;k;Integer.parseInt(reader.readLine());"+k);
System.out.println("[INST]8;None;reader.readLine();"+reader.readLine());
		int N = (int) (Math.sqrt(8*k + 1) - 1) / 2;
System.out.println("[INST]9;None;Math.sqrt(8*k + 1);"+Math.sqrt(8*k + 1));
		int missing = 0;
		if (N*(N + 1)/2 < k) {
			missing = (N + 1) * (N + 2) / 2 - k;
			N++;
		}
		for (int j = 1; j<=N; j++)
			if (j != missing)
				System.out.println(j);
	}
	
}
