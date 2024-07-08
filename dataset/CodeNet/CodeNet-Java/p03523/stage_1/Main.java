import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String akihabara = "AKIHABARA";
		String kihbr = "KIHBR";
		String s = scanner.nextLine();

		int i;
		int j = 0;
		int k = 0;
var newVariable_0 = s.length();		for(i = 0; i < newVariable_0; i++){
			if(
var newVariable_1 = akihabara.length();				j+1 < newVariable_1 &&
var newVariable_2 = akihabara.charAt(j);				newVariable_2 == 'A' &&
var newVariable_3 = akihabara.charAt(j);var newVariable_4 = s.charAt(i);				akihabara.charAt(j) != newVariable_4
			) {
				j++;
			}

var newVariable_5 = akihabara.length();var newVariable_6 = akihabara.charAt(j);var newVariable_7 = s.charAt(i);			if(j >= akihabara.length() || akihabara.charAt(j) != newVariable_7) {
				System.out.println("NO");
				return;
			}
var newVariable_8 = s.charAt(i);			if(newVariable_8!='A') {
var newVariable_9 = s.charAt(i);var newVariable_10 = kihbr.charAt(k);				if(s.charAt(i) == newVariable_10) {
					k++;
				} else {
					System.out.println("NO");
					return;
				}
			}
			
			j++;
		}
var newVariable_11 = kihbr.length();		if(k == newVariable_11) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
