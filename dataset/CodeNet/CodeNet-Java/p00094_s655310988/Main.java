import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		double a = Double.parseDouble(str[0]);
		double b = Double.parseDouble(str[1]);
		System.out.println(a*b/3.305785);
	}

}