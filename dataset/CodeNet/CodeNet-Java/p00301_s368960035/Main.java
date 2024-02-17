import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Symmetric Ternary Number
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int w = parseInt(line);
			String base3 = "";

			while (w != 0) {
				int r = w % 3;
				if (r == 0) {
					base3 = "0" + base3;
					w /= 3;
				} else if (r == 1) {
					base3 = "+" + base3;
					w /= 3;
				} else if (r == 2) {
					base3 = "-" + base3;
					w /= 3;
					w++;
				}
			}

			System.out.println(base3);

		} // end while
	} // end main
}