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

		int count = 0;
		boolean a = true;
var newVariable_0 = line.toCharArray();		for (char c : newVariable_0) {
			if (c == 'A' && a) {
				a = false;
			}
			if (c == 'Z' && !a) {
				count++;
				a = true;
			}
		}

		if (count != 0) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < count; i++) {
var newVariable_1 = sb.append("AZ");			}
			System.out.println(sb.toString());
		} else {
			System.out.println(-1);
		}
	}
}