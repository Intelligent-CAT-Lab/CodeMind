import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		if (str.equals("A")) {
			System.out.println("T");
		} else if (str.equals("T")) {
			System.out.println("A");
		} else if (str.equals("C")) {
			System.out.println("G");
		} else {
			System.out.println("C");
		}
	}
}
