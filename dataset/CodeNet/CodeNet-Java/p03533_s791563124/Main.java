import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		try {
			s = br.readLine().trim();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(9 < s.length()) {
			System.out.println("NO");
			return;
		}
		
		final char[] WORD = {'A', 'K', 'I', 'H', 'A', 'B', 'A', 'R', 'A'};
		char[] str = s.toCharArray();
		char[] r = new char[WORD.length];
		
		for (int i = 0, j = 0; i < WORD.length; i++) {
			if (str.length <= j) r[i] = 'A';
			else if (WORD[i] == str[j]) r[i] = str[j];
			else {
				r[i] = 'A';
				if (i < WORD.length - 1)r[++i] = str[j];
			}
			j++;
		}
		System.out.println((Arrays.equals(r, WORD)) ? "YES":"NO");		
	}
}