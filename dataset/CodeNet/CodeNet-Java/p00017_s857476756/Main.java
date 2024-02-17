import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		while (sc.hasNext()) {
			String s = sc.nextLine();
			
			for (int i=0; i<26; i++) {
				StringBuilder sb = new StringBuilder();
				for (int j=0; j<s.length(); j++) {
					char c = s.charAt(j);
					if ('a'<=c && c<='z') {
						c -= i;
						if (c < 97) {c += 26;}
					}
					sb.append(c);
				}
				if (sb.toString().matches(".*(the|this|that).*")) {System.out.println(sb); break;}
			}
			
		}
	}
}
