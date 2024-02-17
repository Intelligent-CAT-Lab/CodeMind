import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Tennis
 * PCK2013 ??¬???1
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			int j, y;
			j = parseInt(line.substring(0, line.indexOf(' ')));
			y = parseInt(line.substring(line.indexOf(' ') + 1));

			play(0, 0, "", j, y);

		}//end while
	}//end main

	static void play(int _j, int _y, String r, int j, int y) {

		if (_j == j && _y == y) {
			System.out.println(r);
			return;
		}

		if (_j > j || _y > y) return;
		if ((_j >= 5 && _y < 4) || (_j < 4 && _y >= 5)) return;

		play(_j + 1, _y, r + "A", j, y);
		play(_j, _y + 1, r + "B", j, y);
	}
}