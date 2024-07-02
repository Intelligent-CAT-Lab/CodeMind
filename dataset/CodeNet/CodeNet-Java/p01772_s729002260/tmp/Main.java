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
System.out.println("[INST]14;line;br.readLine();"+line);

		StringBuilder sb = new StringBuilder();
		boolean a = true;

		for (char c : line.toCharArray()) {
System.out.println("[INST]19;None;line.toCharArray();"+line.toCharArray());
			if (c == 'A' && a) {
				a = false;
			}
			if (c == 'Z' && !a) {
				sb.append("AZ");
System.out.println("[INST]24;None;sb.append('AZ');"+sb.append("AZ"));
				a = true;
			}
		}

		if (sb.length() != 0) {
System.out.println("[INST]29;None;sb.length();"+sb.length());
			System.out.println(sb.toString());
		} else {
			System.out.println(-1);
		}
	}
}