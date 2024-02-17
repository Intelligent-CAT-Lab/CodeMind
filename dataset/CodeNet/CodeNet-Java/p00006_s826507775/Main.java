import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{


	public static void main(String[] a){

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);


        String str = "";
        char[] chr;

		try {
			str = br.readLine();
			chr = new char[str.length()];

			for(int i = 0; i < str.length(); i++) {
				 chr[i] = str.charAt(i);
			}

			String ans = "";

			for(int i = (chr.length - 1); i >= 0; i--) {
				ans += chr[i];
			}
			System.out.println(ans);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}