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

var newVariable_0 = line.toCharArray();		for (char c : newVariable_0) {
			if (c == 'A' && a) {
				a = false;
			}
			if (c == 'Z' && !a) {
var newVariable_1 = sb.append("AZ");				a = true;
			}
		}

var newVariable_2 = sb.length();		if (newVariable_2 != 0) {
			System.out.println(sb.toString());
		} else {
			System.out.println(-1);
		}
	}
}