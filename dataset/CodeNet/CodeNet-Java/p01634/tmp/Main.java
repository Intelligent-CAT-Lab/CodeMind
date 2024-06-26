import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		while ((line = br.readLine()) != null && !line.isEmpty()) {
System.out.println("[INST]10;line;br.readLine();"+line);
System.out.println("[INST]10;None;line.isEmpty();"+line.isEmpty());
			int c1, c2, c3;
			c1 = c2 = c3 = 0;
			if (line.length() < 6) {
System.out.println("[INST]13;None;line.length();"+line.length());
				System.out.println("INVALID");
			} else {
				for (char c : line.toCharArray()) {
System.out.println("[INST]16;None;line.toCharArray();"+line.toCharArray());
					if (c >= '0' && c <= '9') {
						c1++;
					} else if (c >= 'A' && c <= 'Z') {
						c2++;
					} else {
						c3++;
					}
				}
				if (c1 > 0 && c2 > 0 && c3 > 0) {
					System.out.println("VALID");
				} else {
					System.out.println("INVALID");
				}
			}
		}
	}
}