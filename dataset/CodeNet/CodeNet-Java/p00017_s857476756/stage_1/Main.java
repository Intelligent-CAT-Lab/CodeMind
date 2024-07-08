import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
var newVariable_0 = sc.hasNext();		while (newVariable_0) {
			String s = sc.nextLine();
			
			for (int i=0; i<26; i++) {
				StringBuilder sb = new StringBuilder();
var newVariable_1 = s.length();				for (int j=0; j<newVariable_1; j++) {
					char c = s.charAt(j);
					if ('a'<=c && c<='z') {
						c -= i;
						if (c < 97) {c += 26;}
					}
var newVariable_2 = sb.append(c);				}
var newVariable_3 = sb.toString().matches(".*(the|this|that).*");var newVariable_4 = sb.toString();				if (newVariable_4.matches(".*(the|this|that).*")) {System.out.println(sb); break;}
			}
			
		}
	}
}
