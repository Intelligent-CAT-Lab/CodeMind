import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);

		int n;
var newVariable_0 = reader.readLine();		n = Integer.parseInt(newVariable_0);

		System.out.println((n * 800) - ((n / 15) * 200));

		reader.close();
	}
}