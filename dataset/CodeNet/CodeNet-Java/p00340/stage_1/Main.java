import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Rectangle
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

var newVariable_0 = br.readLine();		StringTokenizer st = new StringTokenizer(newVariable_0);

		int[] sides = new int[4];
		int total = 0;

		for (int i = 0; i < 4; i++) {
var newVariable_1 = parseInt(st.nextToken());var newVariable_2 = st.nextToken();			sides[i] = parseInt(newVariable_2);
			total += sides[i];
		}

		Arrays.sort(sides);

		if (sides[0] == sides[1] && sides[2] == sides[3]) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	} // end main
}