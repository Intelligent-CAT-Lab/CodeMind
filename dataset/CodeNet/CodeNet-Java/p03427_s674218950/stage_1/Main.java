import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		String n = sc.next();
		sc.close();
		boolean f=true;
var newVariable_0 = n.length();		for (int i = 1; i < newVariable_0; i++) {
var newVariable_1 = n.charAt(i);			if(newVariable_1!='9') {
				f = false;
				break;
			}
		}
		char c = f?'0':'1';
var newVariable_2 = n.charAt(0);var newVariable_3 = n.length();		int ans = (int)(n.charAt(0)-c) + (newVariable_3 - 1) * 9;
		out.println(ans);
	}
}
