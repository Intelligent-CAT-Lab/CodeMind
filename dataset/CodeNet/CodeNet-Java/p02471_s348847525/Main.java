import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Elementary Number Theory - Extended Euclid Algorithm
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int a, b;
			a = parseInt(line.substring(0, line.indexOf(' ')));
			b = parseInt(line.substring(line.indexOf(' ') + 1));

			int[] res = egcd(a, b);

			System.out.println(res[0] + " " + res[1]);

		}//end while
	}//end main

	static int[] egcd(int a, int b) {

		int x1 = 1, y1 = 0, r1 = a;
		int x2 = 0, y2 = 1, r2 = b;
		int x3, y3, r3;

		while (true) {
			int q = r1 / r2;
			r3 = r1 % r2;
			x3 = x1 - q * x2;
			y3 = y1 - q * y2;
			if (r3 == 0) break;
			x1 = x2;
			y1 = y2;
			r1 = r2;
			x2 = x3;
			y2 = y3;
			r2 = r3;
		}

		return new int[]{x2, y2};
	}

}