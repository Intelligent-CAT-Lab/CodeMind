import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String s = stdIn.next();
		char[] words = s.toCharArray();
		int min = 0;
		int max = 0;
var newVariable_0 = s.length();		for(int i = newVariable_0-1; i >= 0; i--) {
			if(words[i] == 'A') {
				min = i;
			}
		}
var newVariable_1 = s.length();		for(int i = 0; i < newVariable_1; i++) {
			if(words[i] == 'Z') {
				max = i;
			}
		}
		System.out.println(max-min+1);

	}

}