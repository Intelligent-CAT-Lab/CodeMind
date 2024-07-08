import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String top = r.readLine();
		boolean cpp = false;
		int score = 0;
var newVariable_0 = top.length();		for (int j = 0; j < newVariable_0; j++) {
			if (cpp) {
var newVariable_1 = top.charAt(j);				if (newVariable_1 == 'g')
					score++;
				cpp = false;
			}
			else {
var newVariable_2 = top.charAt(j);				if (newVariable_2 == 'p')
					score--;
				cpp = true;
			}
		}
		System.out.println(score);
	}

}