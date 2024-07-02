import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String akihabara = "AKIHABARA";
		String kihbr = "KIHBR";
		String s = scanner.nextLine();
System.out.println("[INST]8;s;scanner.nextLine();"+s);

		int i;
		int j = 0;
		int k = 0;
		for(i = 0; i < s.length(); i++){
System.out.println("[INST]13;None;s.length();"+s.length());
			if(
				j+1 < akihabara.length() &&
System.out.println("[INST]15;None;akihabara.length();"+akihabara.length());
				akihabara.charAt(j) == 'A' &&
System.out.println("[INST]16;None;akihabara.charAt(j);"+akihabara.charAt(j));
				akihabara.charAt(j) != s.charAt(i)
System.out.println("[INST]17;None;akihabara.charAt(j);"+akihabara.charAt(j));
System.out.println("[INST]17;None;s.charAt(i);"+s.charAt(i));
			) {
				j++;
			}

			if(j >= akihabara.length() || akihabara.charAt(j) != s.charAt(i)) {
System.out.println("[INST]22;None;akihabara.length();"+akihabara.length());
System.out.println("[INST]22;None;akihabara.charAt(j);"+akihabara.charAt(j));
System.out.println("[INST]22;None;s.charAt(i);"+s.charAt(i));
				System.out.println("NO");
				return;
			}
			if(s.charAt(i)!='A') {
System.out.println("[INST]26;None;s.charAt(i);"+s.charAt(i));
				if(s.charAt(i) == kihbr.charAt(k)) {
System.out.println("[INST]27;None;s.charAt(i);"+s.charAt(i));
System.out.println("[INST]27;None;kihbr.charAt(k);"+kihbr.charAt(k));
					k++;
				} else {
					System.out.println("NO");
					return;
				}
			}
			
			j++;
		}
		if(k == kihbr.length()) {
System.out.println("[INST]37;None;kihbr.length();"+kihbr.length());
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
