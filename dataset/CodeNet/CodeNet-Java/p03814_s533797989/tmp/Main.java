import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.next();
System.out.println("[INST]5;s;stdIn.next();"+s);
		char[] words = s.toCharArray();
System.out.println("[INST]6;words;s.toCharArray();"+words);
		int min = 0;
		int max = 0;
		for(int i = s.length()-1; i >= 0; i--) {
System.out.println("[INST]9;None;s.length();"+s.length());
			if(words[i] == 'A') {
				min = i;
			}
		}
		for(int i = 0; i < s.length(); i++) {
System.out.println("[INST]14;None;s.length();"+s.length());
			if(words[i] == 'Z') {
				max = i;
			}
		}
		System.out.println(max-min+1);

	}

}