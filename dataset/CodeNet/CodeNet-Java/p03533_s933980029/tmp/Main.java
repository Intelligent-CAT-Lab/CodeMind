
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
System.out.println("[INST]8;S;sc.next();"+S);
		StringBuilder sb = new StringBuilder(S);

		char[] ch = S.toCharArray();
System.out.println("[INST]11;ch;S.toCharArray();"+ch);
		if(ch.length>9) {
			System.out.println("NO");
			return;
		}
		String akb = new String("AKIHABARA");

		for(int i=0;i<9;i++)
		{
			if(sb.length()>i){
System.out.println("[INST]20;None;sb.length();"+sb.length());
			if(akb.charAt(i)==sb.charAt(i)){
System.out.println("[INST]21;None;akb.charAt(i);"+akb.charAt(i));
System.out.println("[INST]21;None;sb.charAt(i);"+sb.charAt(i));
				continue;
			}
			}
			sb.insert(i, "A");
System.out.println("[INST]25;None;sb.insert(i, 'A');"+sb.insert(i, "A"));
			if(akb.charAt(i)==sb.charAt(i)){
System.out.println("[INST]26;None;akb.charAt(i);"+akb.charAt(i));
System.out.println("[INST]26;None;sb.charAt(i);"+sb.charAt(i));
				continue;
			}else{
				System.out.println("NO");
				System.exit(0);
System.out.println("[INST]30;None;System.exit(0);"+System.exit(0));
			}
		}

		System.out.println("YES");

	}
}
