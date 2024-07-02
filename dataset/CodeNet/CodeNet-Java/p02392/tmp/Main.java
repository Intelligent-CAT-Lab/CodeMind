import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		String inStr;
		inStr = inp();
		String[] in;
		in = inStr.split(" ");
System.out.println("[INST]9;in;inStr.split(' ');"+in);

		int a = Integer.valueOf(in[0]);
System.out.println("[INST]11;a;Integer.valueOf(in[0]);"+a);
		int b = Integer.valueOf(in[1]);
System.out.println("[INST]12;b;Integer.valueOf(in[1]);"+b);
		int c = Integer.valueOf(in[2]);
System.out.println("[INST]13;c;Integer.valueOf(in[2]);"+c);

		if (a < b && b < c)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	private static String inp() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
System.out.println("[INST]24;None;br.readLine();"+br.readLine());
	}

}