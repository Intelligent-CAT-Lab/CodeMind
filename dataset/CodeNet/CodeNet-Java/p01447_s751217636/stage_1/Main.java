import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

var newVariable_0 = Integer.parseInt(br.readLine());var newVariable_1 = br.readLine();		int n = Integer.parseInt(newVariable_1) - 1;

		int count = 0;
		while (n > 0) {
			n /= 3;
			count++;
		}
		System.out.println(count);
	}
}

