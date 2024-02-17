import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.next();
		char[] words = s.toCharArray();
		int min = 0;
		int max = 0;
		for(int i = s.length()-1; i >= 0; i--) {
			if(words[i] == 'A') {
				min = i;
			}
		}
		for(int i = 0; i < s.length(); i++) {
			if(words[i] == 'Z') {
				max = i;
			}
		}
		System.out.println(max-min+1);

	}

}