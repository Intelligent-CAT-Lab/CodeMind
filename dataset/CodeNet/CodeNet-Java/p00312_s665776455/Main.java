import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str;
		while((str=br.readLine())!=null){
			String[] sp = str.split(" ");

			int D = Integer.parseInt(sp[0]);
			int L = Integer.parseInt(sp[1]);

			if(D % L == 0){
				System.out.println(D / L);
			} else{
				System.out.println(D / L + D % L);
			}
		}
	}
}