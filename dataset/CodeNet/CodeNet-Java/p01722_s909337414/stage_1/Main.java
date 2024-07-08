import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
		String str="";
		int mjs=0;

		str=bfr.readLine();
		mjs=Integer.parseInt(str);

		if(mjs==0) {
			System.out.println("1");
		}
		else if(mjs==1) {
			System.out.println("2");
		}
		else if(mjs==2) {
			System.out.println("1");
		}
		else if(mjs>=3) {
			System.out.println("0");
		}
	}
}
