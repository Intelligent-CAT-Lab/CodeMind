import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		
		String CMD = null ;
		BufferedReader BR = null;
		BR = new BufferedReader(new InputStreamReader(System.in));
		try {CMD = BR.readLine();
System.out.println("[INST]11;CMD;BR.readLine();"+CMD);
		} 
		catch (IOException e) {e.printStackTrace();
		}
		String[] str = CMD.split(" "); 
System.out.println("[INST]15;str;CMD.split(' ');"+str);
		
		int x = Integer.parseInt(str[0]);
System.out.println("[INST]17;x;Integer.parseInt(str[0]);"+x);
		int y = Integer.parseInt(str[1]);
System.out.println("[INST]18;y;Integer.parseInt(str[1]);"+y);
		
		if(x==y){
			System.out.println("a == b");
		}if(x<y){
			System.out.println("a < b");
		}if(x>y){
			System.out.println("a > b");
		}

	}

}