import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		int h, m, s;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int S = Integer.parseInt(br.readLine());
System.out.println("[INST]10;S;Integer.parseInt(br.readLine());"+S);
System.out.println("[INST]10;None;br.readLine();"+br.readLine());

		h = S / 3600;
		m = (S - h * 3600) / 60;
		s = S - (h * 3600 + m * 60);

		System.out.println(h + ":" + m + ":" + s );
	}
}