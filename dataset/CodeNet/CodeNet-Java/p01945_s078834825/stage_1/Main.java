import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

var newVariable_0 = br.readLine();		String str[] = newVariable_0.split("");

		int ans=0;
		int now=0;
		
		for (int i = 0; i < str.length; i++) {
var newVariable_1 = str[i].equals("(");			if (newVariable_1) {
				now++;
var newVariable_2 = str[i].equals(")");			} else if (newVariable_2) {
				now--;
			} else {
				ans=now;
			}
		}
		System.out.println(ans);
	}
}
