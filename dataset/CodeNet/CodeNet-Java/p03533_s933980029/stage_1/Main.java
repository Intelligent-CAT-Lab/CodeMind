
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		StringBuilder sb = new StringBuilder(S);

		char[] ch = S.toCharArray();
		if(ch.length>9) {
			System.out.println("NO");
			return;
		}
		String akb = new String("AKIHABARA");

		for(int i=0;i<9;i++)
		{
var newVariable_0 = sb.length();			if(newVariable_0>i){
var newVariable_1 = akb.charAt(i);var newVariable_2 = sb.charAt(i);			if(akb.charAt(i)==newVariable_2){
				continue;
			}
			}
var newVariable_3 = sb.insert(i, "A");var newVariable_4 = akb.charAt(i);var newVariable_5 = sb.charAt(i);			if(akb.charAt(i)==newVariable_5){
				continue;
			}else{
				System.out.println("NO");
				System.exit(0);
			}
		}

		System.out.println("YES");

	}
}
