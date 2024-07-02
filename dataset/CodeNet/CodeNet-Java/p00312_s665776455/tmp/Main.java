import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String str;
		while((str=br.readLine())!=null){
System.out.println("[INST]12;str;br.readLine();"+str);
			String[] sp = str.split(" ");
System.out.println("[INST]13;sp;str.split(' ');"+sp);

			int D = Integer.parseInt(sp[0]);
System.out.println("[INST]15;D;Integer.parseInt(sp[0]);"+D);
			int L = Integer.parseInt(sp[1]);
System.out.println("[INST]16;L;Integer.parseInt(sp[1]);"+L);

			if(D % L == 0){
				System.out.println(D / L);
			} else{
				System.out.println(D / L + D % L);
			}
		}
	}
}