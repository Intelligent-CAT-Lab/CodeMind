import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		StringBuilder ans = new StringBuilder();
		
		sc.close();
		
var newVariable_0 = s.length();		for(int i=0; 2*i < newVariable_0; i++) {
var newVariable_1 = ans.append(s.charAt(2*i));var newVariable_2 = s.charAt(2*i);			ans.append(newVariable_2);
		}
		
		System.out.println(ans);

	}

}

