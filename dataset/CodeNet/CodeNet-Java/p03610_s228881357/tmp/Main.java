import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
System.out.println("[INST]7;s;sc.next();"+s);
		StringBuilder ans = new StringBuilder();
		
		sc.close();
		
		for(int i=0; 2*i < s.length(); i++) {
System.out.println("[INST]12;None;s.length();"+s.length());
			ans.append(s.charAt(2*i));
System.out.println("[INST]13;None;ans.append(s.charAt(2*i));"+ans.append(s.charAt(2*i)));
System.out.println("[INST]13;None;s.charAt(2*i);"+s.charAt(2*i));
		}
		
		System.out.println(ans);

	}

}

