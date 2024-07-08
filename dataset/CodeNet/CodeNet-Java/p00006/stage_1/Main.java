import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String ret = "";
var newVariable_0 = str.length();		for (int i = 0; i < newVariable_0; i++) {
var newVariable_1 = str.length();			char ch = str.charAt(newVariable_1 - i - 1);
			ret += ch;
		}
		System.out.println(ret);
	}
}