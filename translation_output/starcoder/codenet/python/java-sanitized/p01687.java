import java.util.*;
public class p01687 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String ref = "AADINNUY";
		String aizu = "AIZUNYAN";
		String inp = sc.next();
		if(inp.length() < 8){
			System.out.println(inp);
		}else{
			String ans = "";
			int l = inp.length();
			int i = 0;
			while(i < l){
				if(i <= l - 8 && inp.substring(i, i+8).compareTo(ref) == 0){
					ans += aizu;
					i += 8;
				}else{
					ans += inp.charAt(i);
					i += 1;
				}
			}
			System.out.println(ans);
		}
	}
}