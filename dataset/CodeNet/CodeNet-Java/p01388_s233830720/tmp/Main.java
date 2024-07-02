import java.util.*;
import java.math.*;

class Main{
	public static void main(String[] args){
		Solve s = new Solve();
		s.solve();
	}	
}

class Solve{
	Solve(){}
	
	Scanner in = new Scanner(System.in);

	void solve(){
		String s = in.next();
System.out.println("[INST]16;s;in.next();"+s);
		int k = 0, u = 0, p = 0, c = 0;

		for(int i = 0; i < s.length(); i++){
System.out.println("[INST]19;None;s.length();"+s.length());
			if(s.charAt(i) == 'K') k++;
System.out.println("[INST]20;None;s.charAt(i);"+s.charAt(i));
			else if(s.charAt(i) == 'U') u++;
System.out.println("[INST]21;None;s.charAt(i);"+s.charAt(i));
			else if(s.charAt(i) == 'P') p++;
System.out.println("[INST]22;None;s.charAt(i);"+s.charAt(i));
			else if(s.charAt(i) == 'C') c++;
System.out.println("[INST]23;None;s.charAt(i);"+s.charAt(i));
		}

		System.out.println(Math.min(k, Math.min(u, Math.min(p, c))));
	}
	
}

// while(in.hasNext()){
		// 	int n = in.nextInt();
		// 	if(n == 0) return;
			
		// }