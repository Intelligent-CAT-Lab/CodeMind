import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

var newVariable_0 = line.isEmpty();		while ((line = br.readLine()) != null && !newVariable_0) {
			int c1, c2, c3;
			c1 = c2 = c3 = 0;
var newVariable_1 = line.length();			if (newVariable_1 < 6) {
				System.out.println("INVALID");
			} else {
var newVariable_2 = line.toCharArray();				for (char c : newVariable_2) {
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