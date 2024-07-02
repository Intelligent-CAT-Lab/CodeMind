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
System.out.println("[INST]17;str;br.readLine();"+str);
			chr = new char[str.length()];
System.out.println("[INST]18;None;str.length();"+str.length());

			for(int i = 0; i < str.length(); i++) {
System.out.println("[INST]20;None;str.length();"+str.length());
				 chr[i] = str.charAt(i);
System.out.println("[INST]21;None;str.charAt(i);"+str.charAt(i));
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