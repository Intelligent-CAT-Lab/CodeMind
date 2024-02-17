import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()) - 1;

		int count = 0;
		while (n > 0) {
			n /= 3;
			count++;
		}
		System.out.println(count);
	}
}

