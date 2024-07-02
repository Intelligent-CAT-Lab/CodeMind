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
System.out.println("[INST]16;line;br.readLine();"+line);
System.out.println("[INST]16;None;line.isEmpty();"+line.isEmpty());

			List<Character> cs = new ArrayList<Character>();
			List<Integer> ls = new ArrayList<Integer>();
			int last = 0;

			//parse
			cs.add('X');
System.out.println("[INST]23;None;cs.add('X');"+cs.add('X'));
			ls.add(1);
System.out.println("[INST]24;None;ls.add(1);"+ls.add(1));
			for (int i = 0; i < line.length(); i++) {
System.out.println("[INST]25;None;line.length();"+line.length());
				if (cs.get(last) == line.charAt(i)) {
System.out.println("[INST]26;None;cs.get(last);"+cs.get(last));
System.out.println("[INST]26;None;line.charAt(i);"+line.charAt(i));
					ls.set(last, ls.get(last) + 1);
System.out.println("[INST]27;None;ls.set(last, ls.get(last) + 1);"+ls.set(last, ls.get(last) + 1));
System.out.println("[INST]27;None;ls.get(last);"+ls.get(last));
				} else {
					cs.add(line.charAt(i));
System.out.println("[INST]29;None;cs.add(line.charAt(i));"+cs.add(line.charAt(i)));
System.out.println("[INST]29;None;line.charAt(i);"+line.charAt(i));
					ls.add(1);
System.out.println("[INST]30;None;ls.add(1);"+ls.add(1));
					last++;
				}
			}
			cs.add('X');
System.out.println("[INST]34;None;cs.add('X');"+cs.add('X'));
			ls.add(1);
System.out.println("[INST]35;None;ls.add(1);"+ls.add(1));

			//solve
			int k = 0;
			for (int i = 1; i < cs.size() - 1; i++) {
System.out.println("[INST]39;None;cs.size();"+cs.size());
				if (cs.get(i) == 'O') {
System.out.println("[INST]40;None;cs.get(i);"+cs.get(i));
					int l = ls.get(i);
System.out.println("[INST]41;l;ls.get(i);"+l);
					if (cs.get(i - 1) == 'J' && cs.get(i + 1) == 'I'
System.out.println("[INST]42;None;cs.get(i - 1);"+cs.get(i - 1));
System.out.println("[INST]42;None;cs.get(i + 1);"+cs.get(i + 1));
							&& ls.get(i - 1) >= l && ls.get(i + 1) >= l) {
System.out.println("[INST]43;None;ls.get(i - 1);"+ls.get(i - 1));
System.out.println("[INST]43;None;ls.get(i + 1);"+ls.get(i + 1));
						k = Math.max(k, l);
System.out.println("[INST]44;k;Math.max(k, l);"+k);
					}
				}
			}
			System.out.println(k);
		}
	}
}