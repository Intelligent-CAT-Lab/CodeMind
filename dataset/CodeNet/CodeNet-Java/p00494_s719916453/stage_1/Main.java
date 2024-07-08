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

var newVariable_0 = line.isEmpty();		while ((line = br.readLine()) != null && !newVariable_0) {

			List<Character> cs = new ArrayList<Character>();
			List<Integer> ls = new ArrayList<Integer>();
			int last = 0;

			//parse
var newVariable_1 = cs.add('X');var newVariable_2 = ls.add(1);var newVariable_3 = line.length();			for (int i = 0; i < newVariable_3; i++) {
var newVariable_4 = cs.get(last);var newVariable_5 = line.charAt(i);				if (cs.get(last) == newVariable_5) {
var newVariable_6 = ls.set(last, ls.get(last) + 1);var newVariable_7 = ls.get(last);					ls.set(last, newVariable_7 + 1);
				} else {
var newVariable_8 = cs.add(line.charAt(i));var newVariable_9 = line.charAt(i);					cs.add(newVariable_9);
var newVariable_10 = ls.add(1);					last++;
				}
			}
var newVariable_11 = cs.add('X');var newVariable_12 = ls.add(1);
			//solve
			int k = 0;
var newVariable_13 = cs.size();			for (int i = 1; i < newVariable_13 - 1; i++) {
var newVariable_14 = cs.get(i);				if (newVariable_14 == 'O') {
					int l = ls.get(i);
var newVariable_15 = cs.get(i - 1);var newVariable_16 = cs.get(i + 1);					if (cs.get(i - 1) == 'J' && newVariable_16 == 'I'
var newVariable_17 = ls.get(i - 1);var newVariable_18 = ls.get(i + 1);							&& ls.get(i - 1) >= l && newVariable_18 >= l) {
						k = Math.max(k, l);
					}
				}
			}
			System.out.println(k);
		}
	}
}