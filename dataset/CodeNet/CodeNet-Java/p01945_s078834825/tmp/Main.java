import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split("");
System.out.println("[INST]9;str;br.readLine().split('');"+str);
System.out.println("[INST]9;None;br.readLine();"+br.readLine());

		int ans=0;
		int now=0;
		
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("(")) {
System.out.println("[INST]15;None;str[i].equals('(');"+str[i].equals("("));
				now++;
			} else if (str[i].equals(")")) {
System.out.println("[INST]17;None;str[i].equals(')');"+str[i].equals(")"));
				now--;
			} else {
				ans=now;
			}
		}
		System.out.println(ans);
	}
}
