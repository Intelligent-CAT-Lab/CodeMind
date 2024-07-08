import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
var newVariable_0 = br.readLine();		String[] str = newVariable_0.split(" ");
		double a = Double.parseDouble(str[0]);
		double b = Double.parseDouble(str[1]);
		System.out.println(a*b/3.305785);
	}

}