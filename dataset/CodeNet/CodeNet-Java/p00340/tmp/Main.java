import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * Rectangle
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;

		StringTokenizer st = new StringTokenizer(br.readLine());
System.out.println("[INST]17;None;br.readLine();"+br.readLine());

		int[] sides = new int[4];
		int total = 0;

		for (int i = 0; i < 4; i++) {
			sides[i] = parseInt(st.nextToken());
System.out.println("[INST]23;None;parseInt(st.nextToken());"+parseInt(st.nextToken()));
System.out.println("[INST]23;None;st.nextToken();"+st.nextToken());
			total += sides[i];
		}

		Arrays.sort(sides);
System.out.println("[INST]27;None;Arrays.sort(sides);"+Arrays.sort(sides));

		if (sides[0] == sides[1] && sides[2] == sides[3]) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}

	} // end main
}