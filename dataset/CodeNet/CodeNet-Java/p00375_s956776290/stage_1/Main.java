import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Celsius and Fahrenheit
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

var newVariable_0 = br.readLine();		int F = parseInt(newVariable_0);

		System.out.println((F - 30) / 2);
	}
}

