import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	private	static	BufferedReader	br = null;

	static {
		br   = new BufferedReader(new InputStreamReader(System.in));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int		nNum  = parseNum();
		long	nFact = 1;
		for (int n = 2; n <= nNum; n++ ) {
			nFact *= (long)n;
		}
		System.out.println(nFact);
	}

	private static int parseNum() {
		int	nNum = -1;
		try {
			String line = br.readLine();
System.out.println("[INST]28;line;br.readLine();"+line);
			if (line != null) {
				if (!line.isEmpty()) {
System.out.println("[INST]30;None;line.isEmpty();"+line.isEmpty());
					nNum = Integer.parseInt(line);
System.out.println("[INST]31;nNum;Integer.parseInt(line);"+nNum);
				}
			}
		}
		catch (IOException e) {}

		return nNum;
	}
}