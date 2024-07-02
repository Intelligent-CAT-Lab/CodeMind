import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		String n = sc.next();
System.out.println("[INST]9;n;sc.next();"+n);
		sc.close();
		boolean f=true;
		for (int i = 1; i < n.length(); i++) {
System.out.println("[INST]12;None;n.length();"+n.length());
			if(n.charAt(i)!='9') {
System.out.println("[INST]13;None;n.charAt(i);"+n.charAt(i));
				f = false;
				break;
			}
		}
		char c = f?'0':'1';
		int ans = (int)(n.charAt(0)-c) + (n.length() - 1) * 9;
System.out.println("[INST]19;None;n.charAt(0);"+n.charAt(0));
System.out.println("[INST]19;None;n.length();"+n.length());
		out.println(ans);
	}
}
