/**
 * JJOOII
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		while ((line = br.readLine()) != null && !line.isEmpty()) {

			List<Character> cs = new ArrayList<Character>();
			List<Integer> ls = new ArrayList<Integer>();
			int last = 0;

			//parse
			cs.add('X');
			ls.add(1);
			for (int i = 0; i < line.length(); i++) {
				if (cs.get(last) == line.charAt(i)) {
					ls.set(last, ls.get(last) + 1);
				} else {
					cs.add(line.charAt(i));
					ls.add(1);
					last++;
				}
			}
			cs.add('X');
			ls.add(1);

			//solve
			int k = 0;
			for (int i = 1; i < cs.size() - 1; i++) {
				if (cs.get(i) == 'O') {
					int l = ls.get(i);
					if (cs.get(i - 1) == 'J' && cs.get(i + 1) == 'I'
							&& ls.get(i - 1) >= l && ls.get(i + 1) >= l) {
						k = Math.max(k, l);
					}
				}
			}
			System.out.println(k);
		}
	}
}