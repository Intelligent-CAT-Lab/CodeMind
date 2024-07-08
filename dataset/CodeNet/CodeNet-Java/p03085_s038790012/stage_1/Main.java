import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
var newVariable_0 = str.equals("A");		if (newVariable_0) {
			System.out.println("T");
var newVariable_1 = str.equals("T");		} else if (newVariable_1) {
			System.out.println("A");
var newVariable_2 = str.equals("C");		} else if (newVariable_2) {
			System.out.println("G");
		} else {
			System.out.println("C");
		}
	}
}
