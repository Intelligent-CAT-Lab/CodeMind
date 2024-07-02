import java.io.*;

public class Main{
	public static void main(String[] argv) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = br.readLine()) != null){
System.out.println("[INST]6;line;br.readLine();"+line);
			StringBuffer reverse = new StringBuffer().append(line);
System.out.println("[INST]7;reverse;new StringBuffer().append(line);"+reverse);
			System.out.print(reverse.reverse()+"\n");
		}
	}
}