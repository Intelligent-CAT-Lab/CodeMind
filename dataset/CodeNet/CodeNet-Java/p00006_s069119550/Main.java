import java.io.*;

public class Main{
	public static void main(String[] argv) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line = br.readLine()) != null){
			StringBuffer reverse = new StringBuffer().append(line);
			System.out.print(reverse.reverse()+"\n");
		}
	}
}