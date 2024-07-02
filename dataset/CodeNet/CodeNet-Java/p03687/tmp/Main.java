import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
System.out.println("[INST]5;s;sc.next();"+s);
		int ans = 101;
		for(int i=0; i<26; i++){
			char target = (char)(i+'a');
			int max=0;
			int cur=0;
			for(int j=0; j<s.length(); ++j){
System.out.println("[INST]11;None;s.length();"+s.length());
				if(s.charAt(j)==target) cur = 0;
System.out.println("[INST]12;None;s.charAt(j);"+s.charAt(j));
				else{
					cur++;
					max = Math.max(max, cur);
System.out.println("[INST]15;max;Math.max(max, cur);"+max);
				}
			}
			ans = Math.min(ans,max);
System.out.println("[INST]18;ans;Math.min(ans,max);"+ans);
		}
		
		System.out.println(ans);
		return;
	}
}