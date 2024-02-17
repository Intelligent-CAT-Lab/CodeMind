import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		StringBuilder ans = new StringBuilder();
		
		sc.close();
		
		for(int i=0; 2*i < s.length(); i++) {
			ans.append(s.charAt(2*i));
		}
		
		System.out.println(ans);

	}

}

