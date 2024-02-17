import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(reader.readLine());
		int N = (int) (Math.sqrt(8*k + 1) - 1) / 2;
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
