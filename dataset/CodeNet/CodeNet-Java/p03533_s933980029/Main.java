
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
			if(sb.length()>i){
			if(akb.charAt(i)==sb.charAt(i)){
				continue;
			}
			}
			sb.insert(i, "A");
			if(akb.charAt(i)==sb.charAt(i)){
				continue;
			}else{
				System.out.println("NO");
				System.exit(0);
			}
		}

		System.out.println("YES");

	}
}
