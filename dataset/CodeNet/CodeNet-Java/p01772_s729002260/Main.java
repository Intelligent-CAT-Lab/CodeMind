import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A-Z Cat
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		line = br.readLine();

		StringBuilder sb = new StringBuilder();
		boolean a = true;

		for (char c : line.toCharArray()) {
			if (c == 'A' && a) {
				a = false;
			}
			if (c == 'Z' && !a) {
				sb.append("AZ");
				a = true;
			}
		}

		if (sb.length() != 0) {
			System.out.println(sb.toString());
		} else {
			System.out.println(-1);
		}
	}
}