import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);

		int n;
		n = Integer.parseInt(reader.readLine());
System.out.println("[INST]10;n;Integer.parseInt(reader.readLine());"+n);
System.out.println("[INST]10;None;reader.readLine();"+reader.readLine());

		System.out.println((n * 800) - ((n / 15) * 200));

		reader.close();
	}
}