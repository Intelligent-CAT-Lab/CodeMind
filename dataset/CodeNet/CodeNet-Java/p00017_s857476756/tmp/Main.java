import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		while (sc.hasNext()) {
System.out.println("[INST]6;None;sc.hasNext();"+sc.hasNext());
			String s = sc.nextLine();
System.out.println("[INST]7;s;sc.nextLine();"+s);
			
			for (int i=0; i<26; i++) {
				StringBuilder sb = new StringBuilder();
				for (int j=0; j<s.length(); j++) {
System.out.println("[INST]11;None;s.length();"+s.length());
					char c = s.charAt(j);
System.out.println("[INST]12;c;s.charAt(j);"+c);
					if ('a'<=c && c<='z') {
						c -= i;
						if (c < 97) {c += 26;}
					}
					sb.append(c);
System.out.println("[INST]17;None;sb.append(c);"+sb.append(c));
				}
				if (sb.toString().matches(".*(the|this|that).*")) {System.out.println(sb); break;}
System.out.println("[INST]19;None;sb.toString().matches('.*(the|this|that).*');"+sb.toString().matches(".*(the|this|that).*"));
System.out.println("[INST]19;None;sb.toString();"+sb.toString());
			}
			
		}
	}
}
