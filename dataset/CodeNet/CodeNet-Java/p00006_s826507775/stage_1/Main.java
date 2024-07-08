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
var newVariable_0 = str.length();			chr = new char[newVariable_0];

var newVariable_1 = str.length();			for(int i = 0; i < newVariable_1; i++) {
var newVariable_2 = str.charAt(i);				 chr[i] = newVariable_2;
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