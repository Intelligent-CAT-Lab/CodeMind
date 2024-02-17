import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char s[] = scanner.next().toCharArray();
		if (s.length == 1) {

			System.out.println("-1 -1");
			return;
		}
		if(s.length == 2){
			if(s[0]==s[1]){
				System.out.println("1 2");
				return;
			}else{
				System.out.println("-1 -1");
				return;
			}
		}
		for (int i = 1; i < s.length - 1; i++) {
			if (s[i - 1] == s[i] || s[i + 1] == s[i] || s[i - 1] == s[i + 1]) {
				System.out.println(i + " " + (i + 2));
				return;
			}
		}
		System.out.println("-1 -1");
	}
}