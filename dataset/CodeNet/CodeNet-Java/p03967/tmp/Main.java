import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String top = r.readLine();
System.out.println("[INST]6;top;r.readLine();"+top);
		boolean cpp = false;
		int score = 0;
		for (int j = 0; j < top.length(); j++) {
System.out.println("[INST]9;None;top.length();"+top.length());
			if (cpp) {
				if (top.charAt(j) == 'g')
System.out.println("[INST]11;None;top.charAt(j);"+top.charAt(j));
					score++;
				cpp = false;
			}
			else {
				if (top.charAt(j) == 'p')
System.out.println("[INST]16;None;top.charAt(j);"+top.charAt(j));
					score--;
				cpp = true;
			}
		}
		System.out.println(score);
	}

}