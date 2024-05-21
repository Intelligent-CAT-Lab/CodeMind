import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class p01916 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";

		Map<Character, Integer> map = new HashMap<>();
		while ((line = br.readLine())!= null &&!line.isEmpty()) {
			char[] chars = line.toCharArray();
			for (char c : chars) {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}
		}

		int count = 0;
		for (char c : map.keySet()) {
			if (map.get(c) % 2!= 0) {
				count++;
			}
		}
		System.out.println(count / 2);
	}
}